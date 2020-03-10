package builder;


	class WoodHouseBuilder implements HouseBuilder 
	{ 
	    private House house; 
	  
	    public WoodHouseBuilder()  
	    { 
	        this.house = new House(); 
	    } 
	  
	    public void buildGarage()  
	    { 
	        house.setGarage("shetter"); 
	    } 
	  
	    public void buildSwimmingPool()  
	    {
	        house.setSwimmingPool("water"); 
	    } 
	  
	    public void buildFancyStatus()  
	    { 
	        house.setFancyStatus("bricks"); 
	    } 
	  
	    public void bulidGarden()  
	    { 
	        house.setGarden("trees"); 
	    } 
	  
	    public House getHouse()  
	    { 
	        return this.house; 
	    }

		@Override
		public void bulidFancyStatus() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void buildGarden() {
			// TODO Auto-generated method stub
			
		} 
	} 


