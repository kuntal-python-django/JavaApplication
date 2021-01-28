package t_abst;
import t_abst.*;


public class TestBankClass 
{
	public static void main(String[] args) 
	{
		Bank o1 = new SBI();
		Bank o2 = new HDFC();
		
		System.out.println(o1.roi());
		System.out.println(o2.roi());
	}

}
