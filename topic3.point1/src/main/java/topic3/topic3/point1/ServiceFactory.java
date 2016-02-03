package topic3.topic3.point1;

public class ServiceFactory {

	private ServiceFactory(){}
	
	public static ServiceShop getLocalService(){
		return new ServiceImp();
	}
	
	public static ServiceShop getRemoteService(){
		return new ServiceShopProxy (new ServiceShopWebService());
	}
	
}
