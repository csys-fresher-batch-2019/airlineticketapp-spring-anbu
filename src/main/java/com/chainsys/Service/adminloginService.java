package com.chainsys.Service;

import com.chainsys.adminlogin.implementadminlogin;

public class adminloginService {
	implementadminlogin obj=new implementadminlogin();
	 public int admin(String email, String password) throws Exception{
		return obj.admin(email, password);
	 }

}
