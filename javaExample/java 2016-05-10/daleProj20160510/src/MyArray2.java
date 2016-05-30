
public class MyArray2 {
	
	private int[] arry;

	//constructor
	public MyArray2(int[] arry) {
		this.arry=arry;
	}
	
//	public void setArry(int[] arry) {
//		this.arry=arry;
//	}
	
	public int maxminOfArray(boolean isMax) {
		int maxmin=arry[0];
		for(int i=0;i<arry.length;i++) {
			if (isMax && arry[i]>maxmin || !isMax && arry[i]<maxmin)
				maxmin=arry[i];				
		}		
		return maxmin;
	}
	
	public void bubbleSort(boolean isAsc) {
		int tmp=arry[0];
		for (int i=0;i<arry.length-1;i++) {
			for (int j=0;j<arry.length-1-i;j++) {
				if (isAsc && arry[j]>arry[j+1]
				|| !isAsc && arry[j]<arry[j+1]) {
					tmp=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=tmp;
				}
			}
		}
	}
	
	public void printArray() {
		for (int i=0;i<arry.length;i++) {
			System.out.print(arry[i]+"\t");
		}
	}

}
