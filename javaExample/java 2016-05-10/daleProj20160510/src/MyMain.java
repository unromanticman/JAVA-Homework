import java.util.Arrays;

import packUML01.*;
import packUML02.*;

public class MyMain {

	public static void main(String[] args) {
//		pract01(); //使用static的寫法
//		pract02(); //使用non-static的寫法
//		pract03(); //使用UML01，繼承
//		pract04(); //使用UML02，覆寫(Overriding)
		
	}

	public static void pract01() {
		int[] A={10,100,30,50,12,60,33,70,25,90};
		System.out.println(MyArray1.maxminOfArray(A, true));
		System.out.println(MyArray1.maxminOfArray(A, false));
		MyArray1.bubbleSort(A, true);
		MyArray1.printArray(A);
		System.out.println();
		MyArray1.bubbleSort(Arrays.copyOf(A, A.length), false);
		MyArray1.printArray(A);			
	}

	public static void pract02() {
		int[] A={10,100,30,50,12,60,33,70,25,90};
		int[] B={110,120,230,150,125,260,133,270,205,190};
		MyArray2 myArrayA = new MyArray2(A);
		MyArray2 myArrayB = new MyArray2(B);
//		myArrayA.setArry(A);
//		myArrayB.setArry(B);
		System.out.println(myArrayA.maxminOfArray(true));
		System.out.println(myArrayA.maxminOfArray(false));
		System.out.println(myArrayB.maxminOfArray(true));
		System.out.println(myArrayB.maxminOfArray(false));
		myArrayA.printArray();
		System.out.println();
		myArrayB.printArray();
	}

	public static void pract03() {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		ClassC classC = new ClassC();	
		classC.op1();
		classC.op2();
		classA.op1();
		classA.op2();
		classA.opA1();
		classB.op1();
		classB.op2();
		classB.opB1();		
	}
	
	public static void pract04() {
		ClassM classM = new ClassM();
		ClassN classN = new ClassN();
		ClassO classO = new ClassO();	
		classO.op1();
		classO.op2();
		classM.op1();
		classM.op2();
		classM.opM1();
		classN.op1();
		classN.op2();
		classN.opN1();		
	}
	
}
