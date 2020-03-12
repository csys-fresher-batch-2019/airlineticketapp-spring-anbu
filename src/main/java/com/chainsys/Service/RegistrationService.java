package com.chainsys.Service;

import com.chainsys.Registration.Registration;
import com.chainsys.Registration.implementRegistration;
import com.chainsys.Registration.interfaceRegistration;

public class RegistrationService {
	implementRegistration obj = new implementRegistration();

	public int addRegistration(Registration reg) throws Exception {
		return obj.addRegistration(reg);
	}

}
