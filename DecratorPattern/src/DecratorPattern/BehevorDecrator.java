package DecratorPattern;

public class BehevorDecrator extends DecratorSms 
{
	public String sendemail(int id,String num, String massage) 
	{
		return "your email send to #00" + id + "number " + num;  
	}
	public String SendSms(int id,String num, String massage)
	{
		StringBuilder build = new StringBuilder();
		build.append(sendemail(id, num, massage)+"\n"+super.SendSms(id, num, massage));
	   return build.toString();	
	   
	}
}
