
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Source2 {
	
	private static int [] systemNumber;
	private static int [] user;
	private  static int SIZE;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//要猜多少
		System.out.print("請輸入要猜幾位數:");
		SIZE = scan.nextInt();
		systemNumbeGenerate(SIZE);
		//進入每輪的測試
		while(round(SIZE));
		//獲勝
		System.out.print("WIN!");
	}
	
	private static boolean round(int size){
		System.out.print("請輸入數字:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		user = new int [size];
		for(int i=0;i<size;i++){
			user[i] = Integer.parseInt(str.charAt(i)+"");
		}
		return checkAnswer(user,systemNumber);
	}
	
	private static boolean checkAnswer(int[] usr,int[] sys){
		int aCount = 0;
		int bCount = 0;
		ArrayList nop = new ArrayList() ;
		//判斷幾A
		for(int i=0;i<sys.length;i++){
			if(usr[i]==sys[i]){
				aCount++;
				nop.add(i);
			}
		}
		//判斷幾B
		for(int i=0;i<usr.length;i++){
			if(nop.contains(i)) continue; //跳過A的
			//先取得單個使用者輸入數字
			int number = usr[i];
			//再把此數字跟系統陣列比較
			for(int j=0;j<sys.length;j++){
				if(number == sys[j]){
					bCount++;
				}
			}
		}
		System.out.println(aCount+"A"+bCount+"B");
		return ( aCount == sys.length ) ?  false: true;
	}
	private static void systemNumbeGenerate(int num){
		int [] pattern = new int []{1,2,3,4,5,6,7,8,9,0};
		
		//洗牌
		pattern = randomShake(pattern,pattern.length);
		//建立總大小
		systemNumber = new int [num] ;
		//填入亂數
		for(int i=0;i < num;i++){
			//初始化答案亂數
			systemNumber[i] = pattern[i];
			System.out.print(pattern[i]) ; //假如要一開始不要顯示答案的話這行拿掉
		}
		System.out.print("初始化完成\n") ;
	}
	
	//交換
	private static int[] randomShake(int [] array,int mod){
		while(true)
		{
			//用來選那兩排
			for(int i=0;i<500;i++){
				int rand1 = (int)((new Random()).nextDouble()*1000)%mod;
				int rand2 = (int)((new Random()).nextDouble()*1000)%mod;
				//抓個替死鬼來交換
				int temp = array[rand1];
				array[rand1] = array[rand2];
				array[rand2] = temp;
			}
			if(array[0]!=0){
				return array;
			}
		}
	
	}
	
}
