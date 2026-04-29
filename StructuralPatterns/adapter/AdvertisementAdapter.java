package adapter;

public class AdvertisementAdapter extends Advertisement{
	private Ad ad;

	public AdvertisementAdapter(Ad ad) {
		this.ad = ad;
		this.title = ad.description.substring(10);
		this.description = ad.description;
		this.price = ad.price;
		this.status = converteStatus(ad.status);
	}

	private AdvertisementStatus converteStatus(String status) {
		switch(status) {
		case "new": return AdvertisementStatus.DRAFT;
		case "reviewed": return AdvertisementStatus.PUBLISHED;
		case "deleted": return AdvertisementStatus.DELETED;
		default: return AdvertisementStatus.DRAFT;
		}
	}
	
	@Override
	public void publish() {
		ad.publish();
	}
	
	@Override
	public void delete() {
		ad.delete();
	}
	
	@Override
	public void activate() {
		ad.publish();
	}
	
	@Override
	public void inactivate() {
		ad.delete();
	}
	
	
}
