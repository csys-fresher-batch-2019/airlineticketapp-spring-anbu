package com.chainsys.adminregistration;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.chainsys.Registration.Registration;

public interface interfaceadminregistration {
	@SqlUpdate("INSERT INTO ADMINREGISTRATION(NAME,EMAILID,PASSWORD,CONTACT)VALUES(:name,:emailid,:password,:contact)")
	public void addadminregistration(adminregistration adreg) throws Exception;
}
