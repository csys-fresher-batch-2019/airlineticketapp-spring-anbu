package com.chainsys.ticket;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;

import com.chainsys.Airlines.MyConnectionUtil;
import com.chainsys.logger.Logger;

public  class implementticket implements interfaceticket {
	public void addticket(ticket tik) throws Exception {
		Connection con = MyConnectionUtil.Testconnections();
		String sql = "INSERT INTO TICKET(MAIL_ID,AIRLINEID,AIRLINE_NAME,DATE_OF_BOOKING,TRAVEL_DATE,NO_OF_BOOKINGS)values(?,?,?,SYSDATE,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);

		pst.setString(1, tik.getMailid());
		pst.setString(2, tik.getAirlineid());
		pst.setString(3, tik.getAirlinename());
		java.sql.Date date = java.sql.Date.valueOf(tik.getTraveldate());
		pst.setDate(4, date);
		
		int diff = Period.between(LocalDate.now(), tik.getTraveldate()).getDays();
		Logger logger= Logger.getInstance();
		logger.info(diff);
		if (diff > 20) {
			ticket.setDiscountforprebookings(1000);
		}
		
		pst.setInt(5, tik.getNoofbookings());
		int noofbookings= tik.getNoofbookings();
		if (noofbookings > 3) {
			ticket.setDiscountfornoofbookings(1000);
		}
	
			
		int rows = pst.executeUpdate();
		
		String sql1 = "UPDATE TICKET SET DISCOUNT_FOR_NO_OF_BOOKINGS = 1000 WHERE NO_OF_BOOKINGS > 3";
		String sql2 = "UPDATE TICKET SET DISCOUNT_FOR_PREBOOKINGS = 1000 WHERE  TRAVEL_DATE-DATE_OF_BOOKING > 20";
		String sql3=  "UPDATE TICKET SET ORIGINAL_PRICE  = ( NO_OF_BOOKINGS *( SELECT PRICE FROM AIRLINEINFO WHERE AIRLINEID = '"+tik.getAirlineid()+"' ))WHERE AIRLINEID='"+tik.getAirlineid()+"'";

		String sql4 = "UPDATE TICKET SET DISC_PRICE  = ORIGINAL_PRICE - (DISCOUNT_FOR_PREBOOKINGS + DISCOUNT_FOR_NO_OF_BOOKINGS)";
        String sql5=  "UPDATE AIRLINEINFO SET NO_OF_SEATS_AVAILABLE =( NO_OF_SEATS_AVAILABLE -(SELECT NO_OF_BOOKINGS FROM TICKET WHERE MAIL_ID = '"+tik.getMailid()+"'))WHERE AIRLINEID='"+tik.getAirlineid()+"'";



        

		
		
logger.info(""+sql1 + "\n"+sql2 + "\n"+sql3 + "\n"+sql4 + "\n"+sql5 );//String sql4 = "UPDATE TICKET SET DISC_PRICE =ORIGINAL_PRICE - (DISCOUNT_FOR_PREBOOKINGS + DISCOUNT_FOR_NO_OF_BOOKINGS)";
		Statement stmt = con.createStatement();
		int a = stmt.executeUpdate(sql1);
		int b = stmt.executeUpdate(sql2);
		int c = stmt.executeUpdate(sql3);
	    int d = stmt.executeUpdate(sql4);
		int e = stmt.executeUpdate(sql5);
		

	logger.info("No of rows inserted:" + rows );
	}

	public void deleteticket(ticket tik1) throws Exception {
		Connection con = MyConnectionUtil.Testconnections();
		String sql = "delete from ticket where MAIL_ID=?";
		String sql1=  "UPDATE AIRLINEINFO SET NO_OF_SEATS_AVAILABLE = NO_OF_SEATS_AVAILABLE +(SELECT NO_OF_BOOKINGS FROM TICKET WHERE MAIL_ID=?) WHERE AIRLINEID = ?";
		PreparedStatement pst = con.prepareStatement(sql1);

		pst.setString(1, tik1.getMailid());
		pst.setString(2, tik1.getAirlineid());

		PreparedStatement pst1 = con.prepareStatement(sql);
		pst1.setString(1, tik1.getMailid());

		int rows = pst.executeUpdate();
		int row = pst1.executeUpdate();

		
		Logger logger= Logger.getInstance();
	logger.info(rows);
		logger.info("No of rows deleted:" + rows);

	}

}
