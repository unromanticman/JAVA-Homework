package pack01;

public class ClassB extends ClassA {

	public void printA() {
		System.out.printf("publicA=%d%n",publicA);
		System.out.printf("protectedA=%d%n",protectedA);
		System.out.printf("packageA=%d%n",packageA);
//		System.out.printf("privateA=%d%n",privateA);  //not visible
	}
	
}
