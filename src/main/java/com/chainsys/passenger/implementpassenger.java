package com.chainsys.passenger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.Airlines.MyConnectionUtil;
import com.chainsys.logger.Logger;

public class implementpassenger implements interfacepassenger {
	public int savePassenger(passenger pass) throws Exception {
		Connection con = MyConnectionUtil.Testconnections();
		String sql = "INSERT INTO PASSENGER(FNAME,LNAME,ADDRESS,PHONE,AGE,GENDER,CLASSING,NO_OF_BOOKINGS,AIRLINEID,MAIL_ID) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);

		pst.setString(1, pass.getFname());
		pst.setString(2, pass.getLname());
		pst.setString(3, pass.getAddress());
		pst.setLong(4, pass.getPhone());
		pst.setInt(5, pass.getAge());
		pst.setString(6, pass.getGender());
		pst.setString(7, pass.getClassing());
		pst.setInt(8, pass.getNoofbookings());
		pst.setString(9, pass.getAirlineid());
		pst.setString(10, pass.getMailid());
		Logger logger = Logger.getInstance();
		logger.info(sql);
		int rows = pst.executeUpdate();
		logger.info("No of rows inserted:" + rows);
		return rows;

	}

	public void deletepassenger(passenger pass1) throws Exception {
		Connection con = MyConnectionUtil.Testconnections();
		String sql = "delete from passenger where Phone = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setLong(1, pass1.getPhone());
		int rows = pst.executeUpdate();
		Logger logger = Logger.getInstance();
		logger.info(sql);

		logger.info("No of rows deleted:" + rows);

	}

	public List<passenger> findbymail(String mailid) throws Exception {
		String sql = "select * from passenger where mail_id = ?";
		List<passenger> passen = new ArrayList<>();

		try (Connection con = MyConnectionUtil.Testconnections(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setString(1, mailid);
			try (ResultSet rows = pst.executeQuery()) {
				while (rows.next()) {
					passenger pass = new passenger();
					pass.setFname(rows.getString("FNAME"));
					pass.setLname(rows.getString("LNAME"));
					pass.setAddress(rows.getString("ADDRESS"));
					pass.setPhone(rows.getLong("PHONE"));
					pass.setAge(rows.getInt("AGE"));
					pass.setGender(rows.getString("GENDER"));
					pass.setClassing(rows.getString("CLASSING"));
					pass.setNoofbookings(rows.getInt("NO_OF_BOOKINGS"));
					pass.setAirlineid(rows.getString("AIRLINEID"));
					pass.setMailid(rows.getString("MAIL_ID"));

					passen.add(pass);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(passen.size());
		return passen;

	}

}
