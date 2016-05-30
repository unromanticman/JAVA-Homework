
public class MyMain {
	
	public static void main(String[] args) {
		System.out.println(add(10,30));
		System.out.println(add(100,60));
		System.out.println(add(110,55));
		System.out.println(add(20,30.05d));
		System.out.println(add(120,130,30));
		System.out.println(add("abc","def"));
	}
	
	public static int add(int x, int y) {
		return (x+y);
	}

	public static double add(int x, double y) {
		return (x+y);
	}

	public static String add(String x, String y) {
		return (x+y);
	}
	
	public static int add(int x, int y, int z) {
		return (add(add(x,y),z));
	}
	
	public static int add(int x, int y, int z, int a) {
		return (add(add(x,y),add(z,a)));
	}
	
	public static int add(int x, int y, int z, int a, int b) {
		return (add(add(x,y,z),add(a,b)));
	}
	
	public static int add(int x, int y, int z, int a, int b, int c) {
		return (add(add(x,y,z),add(a,b,c)));
	}
}
