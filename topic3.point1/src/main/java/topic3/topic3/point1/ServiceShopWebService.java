package topic3.topic3.point1;


public class ServiceShopWebService implements ServiceShop {

	ServiceShop implement = new ServiceImp();
	
	public void addtoshopcart() {
		implement.addtoshopcart();
		
	}

	public void buy() {
		implement.buy();
		
	}

	
}
