
public class MyMain {

	public static void main(String[] args) {
//		N2N();
//		N2N(9);
//		N2N(10,3);
		
//		pract01();
		
		System.out.println(getRndStr1(4));
		System.out.println(getRndStr2(4));
	}

	public static void N2N() {
		N2N(9);
	}
	
	public static void N2N(int n) {
		N2N(n,1);
	}
	
	public static void N2N(int n,int nCol) {
		for (int i=1;i<=n;i=i+nCol) {
			for (int j=1;j<=n;j++) {
				for (int k=0;k<nCol && (i+k)<=n;k++) {
					System.out.printf("%d * %d = %d\t",(i+k),j,(i+k)*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void pract01() {
		String s="abcdefgabcdefg";
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.concat("XYZ"));
		System.out.println(s.equals("abcdefgabcdef"));
		System.out.println(s.startsWith("abc"));		
		System.out.println(s.endsWith("efg"));
		System.out.println(s.indexOf("abcd"));
		System.out.println(s.indexOf("abcd",1));
		System.out.println(s.indexOf("abcx"));		
		System.out.println(s.isEmpty());
		System.out.println(s.length());
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,7));	
	}

	public static String getRndStr1(int digits) {
		String rnd="",r="";
		for (int i=1;i<=4 || rnd.length()<4;i++) {
			r=Integer.toString((int)(Math.random()*10));
			if (rnd.isEmpty() && !r.equals("0") 
			 ||!rnd.isEmpty() && rnd.indexOf(r)==-1) 
				rnd=rnd+r;
		}
		return rnd;
	}

	public static String getRndStr2(int digits) {
		String rnd="",r="";
		while (rnd.length()<4) {
			r=Integer.toString((int)(Math.random()*10));			
			if (rnd.isEmpty() && !r.equals("0") 
			 ||!rnd.isEmpty() && rnd.indexOf(r)==-1) 
				rnd=rnd+r;
		}
		return rnd;
	}
}
