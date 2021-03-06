package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer bireyselMüşteri = new IndividualCustomer();
		bireyselMüşteri.customerNumber="11111111";
		
		CorporateCustomer kurumsalMüşteri = new CorporateCustomer();
		kurumsalMüşteri.customerNumber="22222222";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "33333333";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(kurumsalMüşteri);
		//customerManager.add(bireyselMüşteri);
		//customerManager.add(sendikaCustomer);
		Customer[] customers = {bireyselMüşteri,kurumsalMüşteri,sendikaCustomer};
		
		customerManager.addMultiple(customers);
	}

}
