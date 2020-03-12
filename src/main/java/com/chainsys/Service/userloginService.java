package com.chainsys.Service;

import com.chainsys.login.implementationLogin;

public class userloginService {
	implementationLogin obj=new implementationLogin();
	public boolean userLogin(String emailId,String password)throws Exception{
		return obj.userLogin(emailId, password);
	}

}
