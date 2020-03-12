package com.chainsys.Registration;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.AIRLINEINFO.airlineinfo;

public interface interfaceRegistration {
	@SqlUpdate("INSERT INTO REGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)values(:name,:emailId,:password,:contact)")
	public int addRegistration(Registration reg) throws Exception;
}
