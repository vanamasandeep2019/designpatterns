//Static block initialization implementation is similar to eager initialization, except that instance of class is created in the static block that provides option for exception handling.

public class SingletonDemo2 {

	private static  SingletonDemo2 singletonDemo2=null;
	
	private SingletonDemo2(){
		
	}
	
	static
	{
		try{
			singletonDemo2=new SingletonDemo2();
		}catch(Exception e){
			
		}
	}
	
	public SingletonDemo2 getInstance(){
		return singletonDemo2;
	}
	
	
}
