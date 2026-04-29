package adapter;

public class Advertisement {
	String title;
	String description;
	Double price;
	AdvertisementStatus status = AdvertisementStatus.DRAFT;
	
	public void publish() {
		System.out.println("Adv publishing process...");
		status = AdvertisementStatus.PUBLISHED;
	}
	
	public void inactivate() {
		System.out.println("Adv inactivation process...");
		status = AdvertisementStatus.INACTIVATED;
	}
	
	public void activate() {
		System.out.println("Adv activation process...");
		status = AdvertisementStatus.ACTIVATED;
	}
	
	public void delete() {
		System.out.println("Adv deletion process...");
		status = AdvertisementStatus.DELETED;
	}
	
	@Override
	public String toString() {
		return String.format("Advertisement=(%s, %s, %.2f, %s)", 
				title,description,price,status);
	}
}