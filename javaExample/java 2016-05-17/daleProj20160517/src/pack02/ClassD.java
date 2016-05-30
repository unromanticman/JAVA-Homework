package pack02;

import pack01.ClassA;

public class ClassD {
	ClassA classA = new ClassA();
	
	public void printA() {
		System.out.printf("classA.publicA=%d%n",classA.publicA);
//		System.out.printf("classA.protectedA=%d%n",classA.protectedA);  //not visible
//		System.out.printf("classA.packageA=%d%n",classA.packageA);  //not visible
//		System.out.printf("classA.privateA=%d%n",classA.privateA);  //not visible
	}
}
