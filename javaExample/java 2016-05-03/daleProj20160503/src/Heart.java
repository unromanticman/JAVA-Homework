
public class Heart {
	private static int heartBeat=72;   //    static變數 稱為類別變數
	private static boolean isDie=false;
	
	//static方法 稱為類別方法
	public static void die() {
		isDie=true;
	}
	
	public static boolean isDie() {
		return isDie;
	}

	public static int getHeartBeat() {
		return heartBeat;
	}

	public static void setHeartBeat(int heartBeat) {
		Heart.heartBeat = heartBeat;
	}

}
