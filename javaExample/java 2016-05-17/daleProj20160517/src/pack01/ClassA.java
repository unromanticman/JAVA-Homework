package pack01;

public class ClassA {
	public int publicA=10;
	protected int protectedA=20;
	int packageA=30;
	private int privateA=40;
	
	public void printA() {
		System.out.printf("publicA=%d%n",publicA);
		System.out.printf("protectedA=%d%n",protectedA);
		System.out.printf("packageA=%d%n",packageA);
		System.out.printf("privateA=%d%n",privateA);
	}
}
