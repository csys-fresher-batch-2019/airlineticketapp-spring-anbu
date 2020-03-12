package com.chainsys.ticket;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.passenger.passenger;

public interface interfaceticket {
	@SqlUpdate("INSERT INTO TICKET(MAIL_ID,AIRLINEID,AIRLINE_NAME,DATE_OF_BOOKING,TRAVEL_DATE,NO_OF_BOOKINGS)values(:mailid,:airlineid,:airlinename,SYSDATE,:traveldate,noofbookings)")
	public void addticket(ticket tik) throws Exception;
	public void deleteticket(ticket tik1) throws Exception;

}
