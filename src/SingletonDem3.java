//The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern and both threads will get the different instances of the singleton class. 
public class SingletonDem3 {
	
	private static SingletonDem3 s=null;
	
	private SingletonDem3(){
		//Empty constructor
	}
	
	public SingletonDem3 getInstance(){
		if(s==null){
			return new SingletonDem3();
		}
		return null;
	}

}
