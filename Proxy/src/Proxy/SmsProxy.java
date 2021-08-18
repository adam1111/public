package Proxy;

import java.util.HashMap;

public class SmsProxy 
{
  SmsConstract Sms;
  private HashMap<String , Integer> map = new HashMap<>();
  
  public String SendSms(String empId, String number, String sms) {
		if(Sms == null){
		Sms = new SmsConstract();
		map.put(empId,1);
		}else{
			int count =  map.get(empId);
			if(count <= 2){map.replace(empId,count+1);}else 
			{ return "Not send "; }
			
		}
			return Sms.SendSms(empId, number, sms);
	}

}
