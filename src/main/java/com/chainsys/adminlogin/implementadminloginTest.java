package com.chainsys.adminlogin;



import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class implementadminloginTest {

	@Test
	void testAdminlogin() throws Exception {
		String email = "ANBUU123";
		String pass="123";
		boolean expected = true;
		boolean actual;
		implementadminlogin met = new implementadminlogin();
		actual = met.adminlogin(email, pass);
		assertEquals(expected,actual);
	}

	@Test @Ignore
	void testAdmin() {
	
	}

}
