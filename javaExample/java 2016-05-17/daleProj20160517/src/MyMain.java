
public class MyMain {

	public static void main(String[] args) {
		
//		pract01(10,2);  //系統產生Exception，程式設計師(你)處理
//		pract02(10,0);  //程式設計師(你)拋例外，程式設計師(你)處理
		
//		try {
//			pract03(10,0);                     //程式設計師(你)拋例外，別人(呼叫他的人)處理
//		}
//		catch (ArithmeticException e) {      
//			System.out.println(e.getMessage());
//			System.out.println("分母不可為0");			
//		}

//		try {
//			pract04(10,0);                     //系統拋例外，別人(呼叫他的人)處理
//		}
//		catch (ArithmeticException e) {      
//			System.out.println(e.getMessage());
//			System.out.println("分母不可為0");			
//		}		
				
		try {
			pract05(5);                     //自訂例外
		}
		catch (MyException e) {      
			System.out.println(e.getMessage());			
		}
	}

	public static void pract01(int a, int b) {
		try {
			int[] A={1,2,3};
			System.out.println(a/b);
			System.out.println(A[9]);
		}	
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("分母不可為0");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("陣列的index超過");			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("【Exception】");
		}	
	}

	public static void pract02(int a, int b) {
		try {
			if (b==0)
				throw new ArithmeticException("【Exception】分母不可為0");  //程式設計師(你)拋例外
			else 			
				System.out.println(a/b);
			}
		catch (ArithmeticException e) {       //程式設計師(你)處理
			System.out.println(e.getMessage());
			System.out.println("分母不可為0");			
		}
	}
	
	public static void pract03(int a, int b) throws ArithmeticException{
		if (b==0)
			throw new ArithmeticException("【Exception】分母不可為0");  //程式設計師(你)拋例外
		else 			
			System.out.println(a/b);
	}

	public static void pract04(int a, int b) throws ArithmeticException{
		System.out.println(a/b);       //系統拋例外
	}
	
	public static void pract05(int a) throws MyException{
		if (a<-10 || a>10)
			throw new MyException("【Exception】值必須介於-10~10之間");
		else
			System.out.println(a);
	}
	
}
