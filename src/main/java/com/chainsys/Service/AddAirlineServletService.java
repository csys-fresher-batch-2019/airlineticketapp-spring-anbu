package com.chainsys.Service;

import java.util.ArrayList;

import com.chainsys.AIRLINEINFO.airlineinfo;
import com.chainsys.AIRLINEINFO.implementairlineinfo;

public class AddAirlineServletService {
	implementairlineinfo obj = new implementairlineinfo();
	public int addairlineinfo(airlineinfo al) throws Exception{
		return obj.addairlineinfo(al);
	}
	public void deleteairlineinfo(airlineinfo al1) throws Exception{
		obj.deleteairlineinfo(al1);
	}
    public ArrayList<airlineinfo> viewairlineinfo()throws Exception{
		return obj.viewairlineinfo();
    	
    }
}
