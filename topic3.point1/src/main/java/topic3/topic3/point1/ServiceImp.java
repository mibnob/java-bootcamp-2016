package topic3.topic3.point1;

public class ServiceImp implements ServiceShop {

	protected ServiceImp(){};
	int PA;
	public void addtoshopcart(){
		System.out.println("Product Added");
		PA++;
	}
	
	public void buy(){
		
		if(PA == 0){
			System.out.println("Please add at least one product to shopcart");
		}
		else{
			
			System.out.println("Products Bought: " + PA);
		}
		PA = 0;
		
	}
}
