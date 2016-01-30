package topic3.topic3.point1;

public class MainShopCart {

	
		public static void main(String[] args) {
			
			ServiceShop shop1 = ServiceFactory.getLocalService();
			shop1.addtoshopcart();
			shop1.addtoshopcart();
			shop1.addtoshopcart();
			shop1.buy();
			shop1.buy();
			
			ServiceShop shop2 = ServiceFactory.getRemoteService();
			shop2.addtoshopcart();
			shop2.buy();
			
			
			
		}
}
