
public class MyMain {

	public static void main(String[] args) {
//		pract01();  //陣列的基本宣告
//		pract02();  //基本型態與參照型(reference)型態的差異
//		pract03();  //找陣列中的最大值、最小值
//		pract04();  //call by value & call by reference
		
		pract05();  //bubble sort
		
	}

	public static void pract01() {
		int[] a={10,20,30,40,50};  //同時宣告、同時初始化
		int b[];
		b=new int[5];
//		b={1,2,3,4,5};             //一次給值的方式只能用於"同時宣告、同時初始化"
		int[] c=new int[5];
		
		for (int i=0;i<c.length;i++) {
			c[i]=i;
		}
		
		for (int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}		
	}

	public static void pract02() {
		int a1=10;
		int a2=a1;
		a2=20;
		System.out.printf("a1=%d%n",a1); //10
		
		int[] b1={1,2,3,4,5};
		int[] b2=b1;
		b2[0]=100;
		System.out.printf("b1[0]=%d%n",b1[0]);  //100		
	}

	public static void pract03() {
		int[] a={90,35,55,12,30,60,5,100};
		System.out.println(maxOfArray(a));
		System.out.println(minOfArray(a));		
		System.out.println(maxminOfArray(a,true));
		System.out.println(maxminOfArray(a,false));				
	}
	
	public static void pract04() {
//		資料各自獨立
		int a=10;
		System.out.printf("before : a=%d%n",a);
		callByValue(a);
		System.out.printf("after : a=%d%n",a);
		
//		資料共同擁有
		int[] b={1,2,3,4,5};
		System.out.printf("before : b[0]=%d%n",b[0]);	
		callByReference(b);
		System.out.printf("after : b[0]=%d%n",b[0]);		
	}
	
	public static void pract05(){
		int[] data={100,4,75,75,77,42,82,80,32,2};
		bubbleSortByAsc(data);
		printArray(data);
		System.out.println();
		bubbleSortByDesc(data);
		printArray(data);
		System.out.println();
		bubbleSort(data,true);
		printArray(data);
		System.out.println();
		bubbleSort(data,false);
		printArray(data);		
		
	}
	
	public static int maxOfArray(int[] arry) {
		int max=arry[0];
		for(int i=0;i<arry.length;i++) {
			if (arry[i]>max)
				max=arry[i];
		}
		return max;	
	}
	
	public static int minOfArray(int[] arry) {
		int min=arry[0];
		for(int i=0;i<arry.length;i++) {
			if (arry[i]<min)
				min=arry[i];
		}
		return min;	
	}
	
	public static int maxminOfArray(int[] arry,boolean isMax) {
		int maxmin=arry[0];
		for(int i=0;i<arry.length;i++) {
			if (isMax && arry[i]>maxmin || !isMax && arry[i]<maxmin)
				maxmin=arry[i];				
		}		
		return maxmin;
	}	

	public static void callByValue(int a) {
		a=100;
	}

	public static void callByReference(int[] arry) {
		arry[0]=100;
	}

	public static void printArray(int[] data) {
		for (int i=0;i<data.length;i++) {
			System.out.print(data[i]+"\t");
		}		
	}
	
	public static void bubbleSortByAsc(int [] data) {
		int tmp=data[0];
		for (int i=0;i<data.length-1;i++) {
			for (int j=0;j<data.length-1-i;j++) {
				if (data[j]>data[j+1]) {
					tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
			}
		}		
	}
	
	public static void bubbleSortByDesc(int [] data) {
		int tmp=data[0];
		for (int i=0;i<data.length-1;i++) {
			for (int j=0;j<data.length-1-i;j++) {
				if (data[j]<data[j+1]) {
					tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
			}
		}		
	}
	
	public static void bubbleSort(int [] data, boolean isAsc) {
		int tmp=data[0];
		for (int i=0;i<data.length-1;i++) {
			for (int j=0;j<data.length-1-i;j++) {
				if (isAsc && data[j]>data[j+1]
				|| !isAsc && data[j]<data[j+1]) {
					tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
			}
		}		
	}
}
