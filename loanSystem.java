import java.util.Scanner;
import java.util.Vector;


public class loanSystem
{
	private MemInterface mgr;
	private BookInterface act;
	Vector<loan> loanVector = new Vector<loan>();
	
	public loanSystem(MemInterface m,BookInterface a)
	{
		mgr = m;
		act = a;
	}
	public void loan() 
	{
		// input Member Telno
		Scanner scan = new Scanner(System.in);
		System.out.println("대출가능한 회원입니다.");
		String telno = scan.nextLine();
		int im = mgr.SearchMember(telno);
		if(im != -1) 
		{
			System.out.println("대출되었습니다");
			String book = scan.nextLine();
			
			int ib = act.searchBook(book);
			if(ib != -1)
			{
				loan l = new loan(telno,book);
				loanVector.add(l);
			}
			else 
			{
				System.out.println("대출가능한 책이아닙니다.");
			}
		}
		else
		{
			System.out.println("등록 가능한 회원이 아닙니다.");
		}
	}
	
	public int Searchloan(String t,String b) 
	{
		for(int i = 0 ; i < loanVector.size() ; i++) 
		{
			if(	loanVector.get(i).CompareTo(t,b))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void minor() 
	{
		System.out.print("대출할 책이름 : ");
		System.out.print("�뜝�럩�쓧�뜝�럩�꼨�뵓怨뺣쐡占쎄퉰占쎈ご�뜝占� �뜝�럩肉��뜝�럩�졑�뜝�럥�돵�썒�슣�닔�땻占썲뜝�럩�뭵 :");

		Scanner scan = new Scanner(System.in);
		String telno = scan.nextLine();
		int im = mgr.SearchMember(telno);
		if(im != -1) 
		{
			System.out.print("嶺뚢돦堉싷옙紐드뜝�럥堉� 嶺뚳옙占쎄턂占쎈턄占쎈뎨�뜝占� : ");
			String book = scan.nextLine();
			
			int ib = act.searchBook(book);
			if(ib != -1)
			{
				int i = Searchloan(telno,book);
				if (i != -1)
				{
					loanVector.remove(i);
				}
			}
			else 
			{
				System.out.println("�뜝�룞�삕占쎈퉲占쎈츇�뜝�룞�삕占쎈츪�뜝�럥由� 嶺뚳옙占쎄턂占쎈턄�뜝�럥�닡�뜝�럥六멨뜝�럥鍮띶뜝�럥堉�.");
			}
		}
		else
		{
			System.out.println("�뜝�럥苡삣슖�댙�삕 �뤆�룊�삕�뜝�럥裕잌뜝�럥由� �뜝�럩�뤂�뜝�럩�쐸�뜝�럩逾� �뜝�럥�닡�뜝�럥六멨뜝�럥鍮띶뜝�럥堉�.");
		}
	}
//	public void loan() 
//	{			
//		System.out.print("嶺뚢돦堉싷옙紐드뜝�럥堉� 嶺뚳옙占쎄턂占쎈턄占쎈뎨�뜝占� : ");
//		Scanner scan = new Scanner(System.in);
//		String inputTitle = scan .nextLine();
//		
//		int i = searchBook(inputTitle);
//		if(i != -1) 
//		{
//			bookList.get(i).bookPrint1();
//		}
//		else 
//		{
//			System.out.println("�뜝�럩逾х뇖�궡瑗백뇡占썹춯�쉻�삕�뜝�럥瑜ュ뜝�럥裕멨뜝�럥鍮띶뜝�럥堉�");
//		}
//	}
}
