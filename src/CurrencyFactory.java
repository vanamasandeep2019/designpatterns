
public class CurrencyFactory {
	
	public static Currency createCurrency(String Country){
		
		if(Country.equalsIgnoreCase("India")){
			return new Rupee();
		}
		
		if(Country.equalsIgnoreCase("America")){
			return new Dollar();
		}
		
		if(Country.equalsIgnoreCase("London")){
			return new Pound();
		}
		return null;
	}
}
