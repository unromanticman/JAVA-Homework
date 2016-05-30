import java.util.*;


public class MyMain {
//	Scanner : 參考 p3-22
	static Scanner scn;
	
	public static void main(String[] args) {
		scn = new Scanner(System.in);
//		pract01();
		
//		pract02();		

//		pract04();
		
		System.out.println(pract05(45));
		
		scn.close();
	}
	
	public static void pract01() {
		int a=10,b=10,c=10,d=10;
		System.out.println(a++);
		System.out.println(a);	
		System.out.println(++b);
		System.out.println(b);
		System.out.println(c--);
		System.out.println(c);	
		System.out.println(--d);
		System.out.println(d);		
		System.out.println(1 & 2);
		System.out.println(1 & 3);
		System.out.println(1 | 2);
		System.out.println(1 | 3);		
	}

	public static void pract02() {
		int userInput;
		System.out.print("請輸入一個數值:");
		userInput=scn.nextInt();
		System.out.println(userInput);		
	}
	
	public static boolean pract03(int userInput,int threadhold) {
		if (userInput >= threadhold)
			return true;
		else
			return false;		
	}
	
	public static void pract04() {
		int u,t;
		System.out.print("請輸入一個使用者數值:");
		u=scn.nextInt();
		System.out.print("\n請輸入一個門檻值:");
		t=scn.nextInt();
		System.out.println(pract03(u,t)?"使用者數值大於等於門檻值":"使用者數值小於門檻值");
		System.out.printf(pract03(u,t)?"%d大於等於%d%n":"%d小於%d%n",u,t);
		System.out.printf("%d"+(pract03(u,t)?"大於等於":"小於")+"%d%n",u,t);		
	}

	public static String pract05(int userInput) {
		String msg1="",msg2="";
		if (userInput >=10 && userInput <=20
		 || userInput >=30 && userInput <=40
		 || userInput >=50 && userInput <=60) {
			msg1="位於區間內";			
		}
		else {
			msg1="不位於區間內";			
		}
		
		if (userInput%6==0)
			msg2="是6的倍數";
		else
			msg2="不6的倍數";
		
		return msg1+","+msg2;
	}
}
