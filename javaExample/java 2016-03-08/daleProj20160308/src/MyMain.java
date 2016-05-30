
public class MyMain {

	public static void main(String[] args) {
//		pract01();   //資料型態
//		pract02("明天",20);
		
		System.out.println(getRand(5));

	}

	public static void pract01() {
		System.out.println(Math.PI);
		int a=100;      //基本型的資料型態(primitive data type)
		Integer b=200;  //參照型的資料型態(reference data type)
		short c=300;
		Short d=400;
		long e=10;
		Long f=20L;     //此處的20後面必須要加上L，否則會誤判為int
		float g=10.01F;
		System.out.println(a);
		System.out.println(b.MIN_VALUE);
		System.out.println(b.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);		
		System.out.println(Integer.MAX_VALUE);		
		System.out.println(c);
		System.out.println(d.MIN_VALUE);
		System.out.println(d.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);		
		System.out.println(Short.MAX_VALUE);
		System.out.println("--------------------");
		System.out.println(b.MIN_VALUE -1);   //造成溢位
		System.out.println(b.MAX_VALUE +1);   //造成溢位
	}
	
	public static void pract02(String s, int w) {
		System.out.println("xyz");
		System.out.print("a\tbc\n");
		System.out.print("It\"s a dog!!");
		System.out.print("\n川普\"Donald Trump\"一路的勝利，讓共和黨員非常傷腦筋，黨內因此傳出要徵召形像較受外界親賴的國會議長，萊恩的呼聲。\n萊恩本人則於4日透過他的律師克隆奎斯特\"Timothy E. Kronquist\"向聯邦選委會\"Federal\\Election\\Commission\"致函，聲明他並沒有參選總統的意願。\n萊恩在信函中明確否定了與「徵召議長萊恩委員會」（Committee to Draft Speaker Ryan）的關係，信件中指出，萊恩本人並無同意這個委員會的籌組行動，他和這個委員會沒有任何關係。\n");
		System.out.printf("聽說%s下探%d度%n",s,w);
		System.out.println("聽說"+s+"下探"+w+"度");
	}
	
	public static int getRand(int digit) {
		return (int) (Math.random()*Math.pow(10, digit));
	}
}
