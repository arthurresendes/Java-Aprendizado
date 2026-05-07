package proxy;

import java.util.List;
import java.util.Random;

public class ProductDAO {
	public List<Product> products;

	public ProductDAO(List<Product> products) {
		this.products = products;
	}
	
	public List<Product> findAll(){
		simulateDelay();
		return this.products;
	}
	
	public Product findById(Integer id) {
		simulateDelay();
		return this.products.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
	}
	
	public void save(Product product) {
		simulateDelay();
		this.products.add(product);
	}

	public void delete(Product product) {
		simulateDelay();
		this.products.remove(product);
	}
	
	public void simulateDelay() {
		Random r = new Random();
		try {
			Thread.sleep(r.nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

