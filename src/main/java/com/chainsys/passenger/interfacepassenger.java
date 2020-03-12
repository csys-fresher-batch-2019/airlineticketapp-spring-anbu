package com.chainsys.passenger;

import java.util.ArrayList;
import java.util.List;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface interfacepassenger {

@SqlUpdate("INSERT INTO PASSENGER(FNAME,LNAME,ADDRESS,PHONE,AGE,GENDER,CLASSING,NO_OF_BOOKINGS,AIRLINEID) values(:passportno,:fname,:lname,:address,:phone,:age,:gender,:classing,:noofbookings,:airlineid)")
	public int savePassenger(passenger pass) throws Exception;
	public void deletepassenger(passenger pass1) throws Exception;
	public List<passenger> findbymail(String mailid) throws Exception;
}
