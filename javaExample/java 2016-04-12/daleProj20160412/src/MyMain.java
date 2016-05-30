
public class MyMain {

	public static void main(String[] args) {
//		pract01();  //基本的二維陣列宣告
//		pract02();  //不規則二維陣列相加
		pract03();  //遞迴
		
	}

	public static void pract01() {
		int[][] a = {{1,2,3,4},
				     {5,6,7,8},
				     {9,10,11,12}};
		String[][] b;
		b = new String[3][4];
		int [][] c;
		c = new int[3][4];

		System.out.println(c.length);
		System.out.println(c[0].length);
		System.out.println(c[1].length);
		System.out.println(c[2].length);

		for (int i=0;i<c.length;i++) {
			for (int j=0;j<c[i].length;j++) {
				c[i][j]=i*j;
			}
		}		
	}

	public static void pract02() {
		int[][] X={{10,20,30},
				   {50,60,70,80},
				   {90,100,110,120},
				   {130,140,}};
		int[][] Y={{100,200,300,400},
				   {500,600,800},
				   {900,1000,1100,1200,1300}};
		
		printArray(addArray(X,Y));		
	}

	public static void pract03() {
		System.out.println(f1(10)); 
		System.out.println(f2(10));		
	}
	
	public static int[][] addArray(int[][] A,int[][] B) {
		int maxRow=Math.max(A.length, B.length);
		int maxCol=Math.max(findMaxCol(A), findMaxCol(B));
		int[][] R=new int[maxRow][maxCol];
		for (int i=0;i<maxRow;i++) {
			for (int j=0;j<maxCol;j++) {
				R[i][j]=(i<A.length && j<A[i].length? A[i][j] : 0)+
						(i<B.length && j<B[i].length? B[i][j] : 0);
			}
		}
		return R;
	}
	
	public static void printArray(int[][] R) {
		for (int i=0;i<R.length;i++) {
			for (int j=0;j<R[i].length;j++) {
				System.out.print(R[i][j]+"\t");
			}
			System.out.println();
		}			
	}

	public static int findMaxCol(int[][] X) {
		int maxCol=0;
		for (int i=0;i<X.length;i++) {
			if (maxCol<X[i].length)
				maxCol=X[i].length;
		}
		return maxCol;
	}

	public static int f1(int n) {
		if (n==1)
			return n;
		else
			return n+f1(n-1);
	}

	public static int f2(int n) {
		if (n==2)
			return n*(n-1);
		else
			return n*(n-1)+f2(n-1);
	}
}
