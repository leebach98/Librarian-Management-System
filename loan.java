public class loan  //�빊遺쏙옙占쎈쭆 �겫占썽겫占�
{
	public loan(String t,String b)
	{
		telno = t;
		book = b;
	}
	public boolean CompareTo (String t,String b) 
	{
		if(telno.equals(t) && book.equals(b))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	private String telno;
	private String book;
}