import java.io.BufferedReader;
import java.io.FileReader;

import pack01.Customer;
import pack03.Dog;
import pack03.People;


public class FinalExam {

	/*系級： 資工2A
	 *學號： A3261576	
	 *姓名：林郁翔
	 */
		public static void main(String[] args) {
			System.out.println("-----【exam01 輸出結果】-----");
			exam01();
			System.out.println("-----【exam02 輸出結果】-----");
			exam02("C:\\temp\\news20160527.txt", "警方");
			exam02("C:\\temp\\news20160527.txt", "千元假鈔");
			System.out.println("-----【exam03 輸出結果】-----");
			exam03();
	
		}
		//第一題 
		public static void exam01() {
			Customer customerA = new Customer();
			Customer customerB = new Customer();
			System.out.println(customerA.buyTicket(80)==1?"交易成功":"交易失敗");//購票80張成功
			System.out.println(customerB.buyTicket(30)==1?"交易成功":"交易失敗");//購票30張失敗
			customerA.returnTicket(20);//退票20張
			System.out.println(customerB.buyTicket(30)==1?"交易成功":"交易失敗");//購票30張成功
		}

		
		//第二題 File I/O
		public static void exam02(String newsFile, String word) {
		
			
			
			try{
				int count = 0;
				
				FileReader fr = new FileReader(newsFile);
		        BufferedReader bfr = new BufferedReader(fr);
		      
		        String str="",strAll="";
		        while ((str=bfr.readLine())!=null) {
		        	strAll += str;
		        }
		        
		        //判斷出現次數
		        count = 0;
		       
		        for(int i = 0 ;i < strAll.length() ; i++){
		        	
		        	boolean check = true;
		        	
		        	for(int j = 0 ; j < word.length();j++){
		        		if(strAll.charAt(i+j)!= word.charAt(j)){
		        			check = false;
		        			break;
		        		}
		        	}
		        	
		        	if(check){
		        		count++;
		        	}
		   
		        }
		        
				fr.close();	
				System.out.printf("【%s】共出現%d次%n",word,count);
				
			}
			catch(Exception e){
				System.out.print(e.getMessage());
			}

		}

		public static void exam03() {
			People people = new People();
			Dog dog = new Dog();
			people.getStatus();
			dog.getStatus();
		}

}
