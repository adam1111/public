package Proxy;

public class sssa {

	public static void main(String[] args) {
		SmsProxy prx = new SmsProxy();
		
		System.out.println(prx.SendSms("12", "0101010", "hello"));
		System.out.println(prx.SendSms("12", "0101010", "hello"));
		System.out.println(prx.SendSms("12", "0101010", "hello"));
		System.out.println(prx.SendSms("12", "0101010", "hello"));

	}

}
