
public class MyArray1 {
	
	public static int maxminOfArray(int[] arry,boolean isMax) {
		int maxmin=arry[0];
		for(int i=0;i<arry.length;i++) {
			if (isMax && arry[i]>maxmin || !isMax && arry[i]<maxmin)
				maxmin=arry[i];				
		}		
		return maxmin;
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
	
	public static void printArray(int [] arry) {
		for (int i=0;i<arry.length;i++) {
			System.out.print(arry[i]+"\t");
		}
	}
	
}
