package com.chainsys.AIRLINEINFO;

import java.util.ArrayList;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.passenger.passenger;

public interface interfaceairlineinfo {
@SqlUpdate("INSERT INTO AIRLINEINFO(AIRLINEID,AIRLINE_NAME,TOTAL_SEATS,NO_OF_SEATS_AVAILABLE,FROM_TO,JOURNEY_DATE,PRICE)values(:airlineid,:airlinename,:totalseats,:noofseatsavailable,fromto,journeydate,price)")
	public int addairlineinfo(airlineinfo al) throws Exception;
	public int deleteairlineinfo(airlineinfo al1) throws Exception;
    public ArrayList<airlineinfo> viewairlineinfo()throws Exception;
}
