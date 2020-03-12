package com.chainsys.Airlines;

import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface interfaceairport {
	@SqlUpdate("insert into airport(ap_Name,state,country,cName) values(:apName,:state,:country,:cName)")
public void addairport(airport b) throws Exception;
public void deleteairport(String apName) throws Exception;

}
