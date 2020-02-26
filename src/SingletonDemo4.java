// Thread safe singleton	
public class SingletonDemo4 {
	
	private static SingletonDemo4 s=null;
	
	private SingletonDemo4(){
		
	}
	
	public static synchronized SingletonDemo4 getInstance(){
		if(s==null){
			return new SingletonDemo4();
		}
		return s;
	}
}
