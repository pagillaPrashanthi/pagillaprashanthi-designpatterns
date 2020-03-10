package builder;

public class House implements HousePlan
{
private String garage; 
private String swimmingpool; 
private String garden; 
private String fancystatus; 

public void setGarage(String garage)  
{ 
    this.garage = garage; 
} 

public void setSwimmingPool(String swimmingpool)  
{ 
    this.swimmingpool = swimmingpool; 
} 

public void setFancyStatus(String fancystatus)  
{ 
    this.fancystatus = fancystatus; 
} 

public void setGarden(String garden)  
{ 
    this.garden = garden; 

}
}