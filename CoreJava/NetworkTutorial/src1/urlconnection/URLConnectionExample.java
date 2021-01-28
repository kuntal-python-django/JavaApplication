package urlconnection;

import java.io.*;  
import java.net.*;  

public class URLConnectionExample {  
public static void main(String[] args){  
try{  
URL url=new URL("https://www.flipkart.com/air-conditioners/pr?sid=j9e,abm,c54&marketplace=FLIPKART&p[]=facets.discount_range_v1%255B%255D%3D30%2525%2Bor%2Bmore&restrictLocale=true&fm=personalisedRecommendation%2Fdiscount&iid=R%3Ad%3Bpt%3Ahp%3Buid%3Ad683a911-ae06-d080-6d65-7dbdb0fd1ac4%3B.cid%3AS_F_N_j9e_abm_c54__d_30-100__NONE_ALL%3Bnid%3Aj9e_abm_c54_%3Bmp%3AF%3Bct%3Ad%3B&ppt=hp&ppn=homepage&ssid=8niwsvtsdc0000001585077273820&otracker=hp_reco_Discounts%2Bfor%2BYou_2_13.dealCard.OMU_Discounts%2Bfor%2BYou_cid%3AS_F_N_j9e_abm_c54__d_30-100__NONE_ALL%3Bnid%3Aj9e_abm_c54_%3Bmp%3AF%3Bct%3Ad%3B_9&otracker1=hp_reco_WHITELISTED_personalisedRecommendation%2Fdiscount_Discounts%2Bfor%2BYou_DESKTOP_HORIZONTAL_dealCard_cc_2_NA_view-all_9&cid=cid%3AS_F_N_j9e_abm_c54__d_30-100__NONE_ALL%3Bnid%3Aj9e_abm_c54_%3Bmp%3AF%3Bct%3Ad%3B");  
URLConnection urlcon=url.openConnection();  
InputStream stream=urlcon.getInputStream();  
int i;  
while((i=stream.read())!=-1){  
System.out.print((char)i);  
}  
}catch(Exception e){System.out.println(e);}  
}  
}  