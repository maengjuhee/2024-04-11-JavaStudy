// contains 
/*  
 *  https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=2
 * 
 *  JDBC => DBCP => MyBatis => (JPA)
 *  Ajax => Vue => React => Redux => React-Query => Next
 */


import java.util.Scanner;

import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 문자열_2 {

	private static Jsoup JSoup;
	

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
        Scanner scan=new Scanner(System.in);
        System.out.print("1. 노래명 검색 2. 가수명 검색");
        int menu=scan.nextInt();
        int k=1;
        
        if(menu==1)
        {
           System.out.print("노래명 입력:");
           String fd=scan.next();
           for(int i=1;i<=4;i++)
           {
        	   Document doc=JSoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=2"+1).get();
        	   Elements title=doc.select("table.list_wrap a.title");
        	   for(int j=0;j<title.size();j++)
        	   {
        		   if(title.get(j).text().contains(fd))
        		   {
        			  // System.out.println(k+"."+title.get(j).text()+"("+singer.get(j).text()+")");
            		   k++;
        		   }
        		   
        	   }
           }
        		   
        }
        else if(menu==2)
        {
        	 System.out.print("가수명 입력:");
             String fd=scan.next();
             for(int i=1;i<=4;i++)
             {
          	   Document doc=JSoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=2"+1).get();
          	   Elements title=doc.select("table.list_wrap a.title");
          	   for(int j=0;j<title.size();j++)
          	   {
          		   if(title.get(j).text().contains(fd))
          		   {
          			  // System.out.println(k+"."+title.get(j).text()+"("+singer.get(j).text()+")");
              		   k++;
          		   }
          		   
          	   }
             }
        }
	}

}
