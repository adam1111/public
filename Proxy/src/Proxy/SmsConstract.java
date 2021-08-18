package Proxy;

public class SmsConstract extends SmsGnreater {

	@Override
	public String SendSms(String empId, String number, String sms) {
		return "message sended to " + number ;
	}

}
