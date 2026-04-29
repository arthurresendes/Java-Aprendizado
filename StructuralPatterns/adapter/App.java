package adapter;
public class App {
	public static void main(String[] args) {
		Advertisement adv1 = new Advertisement();
		adv1.title = "Vendo marcador de lousa branca";
		adv1.description =  "Estado de novo. Cor preta";
		adv1.price = 20.0;
		System.out.println(adv1);
		
		adv1.publish();
		adv1.delete();
		adv1.activate();
		adv1.inactivate();
		
		Ad ad = new Ad();
		ad.description = "Bicicleta seminova, aro 18, com adesivo do Ben10";
		ad.price = 2000.0;
		ad.status = "reviewed";
		Advertisement adv2= new AdvertisementAdapter(ad);
		System.out.println(adv2);
		
		adv2.publish();
		adv2.delete();
		adv2.activate();
		adv2.inactivate();
		
	}
}
