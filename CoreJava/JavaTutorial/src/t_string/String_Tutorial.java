package t_string;

public class String_Tutorial {

	public static void main(String[] args) 
	{
		// String Operation
		
		String v = "Java Tutorial";
		
		// length
		int count_len = v.length();
		System.out.println("Length Of v is : " + count_len);
		
		// Upper & Lower
		System.out.println("Uppercase : " + v.toUpperCase());
		System.out.println("Lowercase : " + v.toLowerCase());
		
		// index of
		System.out.println("Index of => Tu is : " + v.indexOf("Tu"));
		
		// Concatenation
		String fn = "Kuntal ";
		String ln = "Samanta";
		System.out.println(fn + ln);
		System.out.println(fn.concat(ln));
		
		// Special Char or Char Bypass
		String var = "\"Java\" is popular's Prog Lang";
		String x = " It\'s Okay";
		System.out.println(var + x);
		
		
	}

}
