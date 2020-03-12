package com.chainsys.AIRLINEINFO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import com.chainsys.Airlines.MyConnectionUtil;
import com.chainsys.logger.Logger;
import com.chainsys.passenger.passenger;
public class implementairlineinfo implements interfaceairlineinfo {
	public int addairlineinfo(airlineinfo al) throws Exception
	{
		Connection con = MyConnectionUtil.Testconnections();
String sql="INSERT INTO AIRLINEINFO(AIRLINEID,AIRLINE_NAME,TOTAL_SEATS,NO_OF_SEATS_AVAILABLE,FROM_TO,JOURNEY_DATE,PRICE)values(?,?,?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
pst.setString(1, al.getAirlineid());
pst.setString(2, al.getAirlinename());
pst.setInt(3, al.getTotalseats());
pst.setInt(4,al.getNoofseatsavailable());
pst.setString(5, al.getFromto());
pst.setDate(6,Date.valueOf(al.getJourneydate()));
pst.setInt(7, al.getPrice());
Logger logger= Logger.getInstance();
logger.info(sql);
int rows = pst.executeUpdate();
logger.info("No of rows inserted:" + rows);
return rows;
		
	}		
public int deleteairlineinfo(airlineinfo al1) throws Exception{
	Connection con = MyConnectionUtil.Testconnections();
String sql="delete from airlineinfo where airlineid = ?";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, al1.getAirlineid());
int rows = pst.executeUpdate();
Logger logger= Logger.getInstance();
logger.info(sql);

logger.info("No of rows deleted:" + rows);
return rows;
	}
		
public ArrayList<airlineinfo> viewairlineinfo()throws Exception{
ArrayList<airlineinfo> flights = new ArrayList<airlineinfo>();	
Connection con = MyConnectionUtil.Testconnections();
String sql1="SELECT *FROM AIRLINEINFO";
PreparedStatement pst = con.prepareStatement(sql1);
ResultSet rows = pst.executeQuery();
	while(rows.next()) {
		airlineinfo a=new airlineinfo();
		
		a.setAirlineid(rows.getString("AIRLINEID"));
	a.setAirlinename(rows.getString("AIRLINE_NAME"));
    a.setTotalseats(rows.getInt("TOTAL_SEATS"));
    a.setNoofseatsavailable(rows.getInt("NO_OF_SEATS_AVAILABLE"));
    a.setFromto(rows.getString("FROM_TO"));
    a.setJourneydate(rows.getDate("JOURNEY_DATE").toLocalDate());
    a.setPrice(rows.getInt("PRICE"));
    flights.add(a);
	}
	return flights;
	


}

}
