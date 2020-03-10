package builder;

public class Builder {	
	    private static final HouseBuilder WoodHouseBuilder = null;

		public static void main(String[] args) 
	    { 
	        HouseBuilder WoodBuilder = new WoodHouseBuilder(); 
	        CivilEngineer engineer = new CivilEngineer(WoodBuilder); 
	  
	        engineer.constructHouse(); 
	  
	        House house = engineer.getHouse(); 
	  
	        System.out.println("Builder constructed: "+ house); 
	    } 
	} 
