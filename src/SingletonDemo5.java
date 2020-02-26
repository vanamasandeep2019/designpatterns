//Double checked locking
public class SingletonDemo5 {
	
	private static SingletonDemo5 singleton;
	
	private SingletonDemo5(){
		
	}
	
	private static SingletonDemo5 getInstance(){
		if(singleton==null){
			synchronized (SingletonDemo5.class) {
				if(singleton==null){
					return new SingletonDemo5();
				}
			}
		}
		return singleton;
	}
}
