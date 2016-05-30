
public class MyMain {
	
	public Dog dog1, dog2;
	
	public static void main(String[] args) {
		MyMain myMain = new MyMain();
		myMain.pract01();
	}

	
	public void pract01() {
		dog1 = new Dog();
		dog2 = new Dog();
		dog1.setDogName("dog1");
		dog2.setDogName("dog2");
		dog1.run();
		dog1.run();		
		dog2.run();
		System.out.println("dog1 : heartBeat="+dog1.getHeartBeat());
		System.out.println("dog2 : heartBeat="+dog2.getHeartBeat());
		dog1.die();
		System.out.println("dos2 is :"+dog2.isDie());		
	}
}
