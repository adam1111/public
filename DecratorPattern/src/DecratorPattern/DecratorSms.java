package DecratorPattern;

public abstract class DecratorSms 
{
 
	MobileSms sms;
	
	public void Setservce(MobileSms s) 
	{
		sms = s;
	}
	
	public String SendSms(int id,String num, String massage)
	{
	   return sms.SendSms(id, num, massage);	
	}
}
