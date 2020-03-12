package com.chainsys.adminregistration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import com.chainsys.Airlines.MyConnectionUtil;
import com.chainsys.logger.Logger;

public class implementadminregistration implements interfaceadminregistration{
	public void addadminregistration(adminregistration adreg) throws Exception{
		Connection con = MyConnectionUtil.Testconnections();
	String sql="INSERT INTO ADMINREGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)VALUES(?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(sql);

	pst.setString(1, adreg.getName());
	pst.setString(2, adreg.getEmailid());
	pst.setString(3, adreg.getPassword());
	pst.setLong(4, adreg.getContact());
	Logger logger= Logger.getInstance();
	logger.info(sql);
	int rows = pst.executeUpdate();
	logger.info("No of rows inserted:" + rows);
	}

	
	
	
	
}
