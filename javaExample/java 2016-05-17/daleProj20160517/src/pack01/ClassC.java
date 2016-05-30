package pack01;

public class ClassC {
	ClassA classA = new ClassA();
	
	public void printA() {
		System.out.printf("classA.publicA=%d%n",classA.publicA);
		System.out.printf("classA.protectedA=%d%n",classA.protectedA);
		System.out.printf("classA.packageA=%d%n",classA.packageA);
//		System.out.printf("classA.privateA=%d%n",classA.privateA);  //not visible
	}	
}
