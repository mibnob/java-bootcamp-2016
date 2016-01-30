package topic3.topic3.point1;

public class ServiceShopProxy implements ServiceShop {

	ServiceShop implementation;
	
		protected ServiceShopProxy(ServiceShop imp){
			this.implementation = imp;
		}
	
		public void addtoshopcart(){
			implementation.addtoshopcart();
		}
		
		public void buy(){
			implementation.buy();
		}
	
}
