package pack03;

public abstract class Animal {
    private int heartbeat;
    private String name;

    public Animal(String name, int heartbeat){
    	this.name=name;
    	this.heartbeat=heartbeat;
    }

    protected int getHeartBeat(){
    	return this.heartbeat;
    }

    protected String getName(){
    	return this.name;
    }

    public abstract void run();

    public void getStatus() {
    	System.out.printf("%s正常的心跳是%d下%n",this.name,this.heartbeat);
    }
}
