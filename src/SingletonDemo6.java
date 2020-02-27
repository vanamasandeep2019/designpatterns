//Bill Pugh Singleton Implementation

//Notice the private inner static class that contains the instance of the singleton class. When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.


public class SingletonDemo6 {
	
	
	private SingletonDemo6(){
		
	}
	
	private static class SingletonHelper{
		private static final SingletonDemo6 s=new SingletonDemo6();
	}
	
	public SingletonDemo6 getInstance(){
		return SingletonHelper.s;
	}

}
