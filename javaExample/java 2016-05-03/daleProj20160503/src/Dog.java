
public class Dog {

	private String dogName="";         //non-static變數 稱為物件變數

	public void setDogName(String dogName) {
		this.dogName=dogName;
	}

	//non-static方法 稱為物件方法
	public void run() {                
		System.out.printf("%s is running...%n",dogName);
		Heart.setHeartBeat(Heart.getHeartBeat()+1);
	}

	//non-static方法 稱為物件方法
	public int getHeartBeat() {
		return Heart.getHeartBeat();
	}	

	public void die() {
		Heart.die();
	}
	
	public boolean isDie() {
		return Heart.isDie();
	}
}
