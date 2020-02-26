//This is the simplest method of creating a singleton class. In this, object of class is created when it is loaded to the memory by JVM. It is done by assigning the reference an instance directly.

public class SingletonDemo {
	
	private static final SingletonDemo s=new SingletonDemo();
	
	private SingletonDemo(){
		
	}
	
	public SingletonDemo getInstance(){
		return s;
	}
		
}
