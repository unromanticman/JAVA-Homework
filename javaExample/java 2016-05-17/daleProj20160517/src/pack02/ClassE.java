package pack02;

import pack01.ClassA;

public class ClassE extends ClassA{

	public void printA() {
		System.out.printf("publicA=%d%n",publicA);
		System.out.printf("protectedA=%d%n",protectedA);
//		System.out.printf("packageA=%d%n",packageA);  //not visible
//		System.out.printf("privateA=%d%n",privateA);  //not visible
	}	
}
