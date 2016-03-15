import java.util.Scanner;

public class Source {
	/*資料紀錄*/
	static int data []  = new int [10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("分數區間判斷");
		calculate();
		printData();
	}
	/*計算個數*/
	private static void calculate()
	{
		Scanner scan = new Scanner(System.in);
		for(int i= 0;i<10;i++)
		{
			System.out.print("輸入第"+(i+1)+"個數字:");
			setData(scan.nextInt());
		}
	}
	/*判斷數字*/
	private static void setData(int num)
	{
		if(!(num>=0&&num<=100)){
			System.out.println("[!]輸入錯誤,本次數值未設定");
		}
		else{
			for(int i=1;i<=10;i++){		
				if((num<i*10)||(num == 100&&(i==10))){
					data[i-1]++;
					return;
				}
			}	
		}
	}
	/*印出數字*/
	public static void printData()
	{
		for(int i=1;i<=10;i++){		
			System.out.println(i*10-10+"-"+i*10+" 有 "+data[i-1]+"個");
		}
	}
}
