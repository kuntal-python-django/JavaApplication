package org.date;

import java.sql.Date;
import java.util.*;  

public class UtilsPart2 {

	public static void main(String[] args) {
		
//		Date [also java.sql.Date]
//		Ex 1
//		long millis=System.currentTimeMillis();
//		System.out.println(millis);
//        java.sql.Date date = new java.sql.Date(millis);  
//        System.out.println(date);
//		Ex 2
//		String str="2015-03-31";  
//	    Date date=Date.valueOf(str);//converting string into sql date  
//	    System.out.println(date);
		
		
//		Calender
	   Calendar calendar = Calendar.getInstance();  
//	   System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));
//	   System.out.println("At present Calendar's Month: " + calendar.get(Calendar.DATE));  
//	   System.out.println("My Exp: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		
//		Currency
//		Currency c1 = Currency.getInstance("AUD"); //Australian Dollar 
//        Currency c2 = Currency.getInstance("INR");  //Japan Yen 
//        Currency c3 = Currency.getInstance("USD");  //Japan Yen 
//        String cCode1 = c1.getCurrencyCode(); 
//        String cCode2 = c2.getCurrencyCode(); 
//        System.out.println("Australian Dollar code : " + cCode1); 
//        System.out.println("India Yen code : " + cCode2); 
//        System.out.println(""); 
//        System.out.println("AUD Display : "+c1.getDisplayName()); 
//        System.out.println("INR Display : "+c2.getSymbol()); 
//        System.out.println(""); 
		
	   
//		Locale
		/*
		 * As the name suggests util.
		 * Locale Class is used to perform 
		 * locale task and provides locale information for the user.
		 * */
//		Locale geek1 = new Locale("English", "IN"); 
//		Locale geek2 = Locale.getDefault();
//		System.out.println("Locale name : " + geek1); 
//        System.out.println("Locale name Default : " + geek2);
//        System.out.println("\nCountry Name : "
//                + geek1.getDisplayCountry());
//        System.out.println("Country Name ISO 3166 2-letter code : "
//                + geek1.getCountry());
		
        
//		Random
//		Random rand = new Random();
//		int rand_int1 = rand.nextInt(20); 
//        System.out.println("Random Integers: "+rand_int1); 
        

		
		
	}

}
