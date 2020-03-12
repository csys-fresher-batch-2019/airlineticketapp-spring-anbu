package com.chainsys.Service;

import com.chainsys.passenger.implementpassenger;
import com.chainsys.passenger.interfacepassenger;
import com.chainsys.passenger.passenger;

public class PassengerService {
	interfacepassenger obj = new implementpassenger();
	public int addpassenger(passenger pass) throws Exception{
		obj.savePassenger(pass);
		return 0;
	}
	public void deletepassenger(passenger pass1) throws Exception{
		
	}
}
