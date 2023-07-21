package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import productcrudapp.model.Product;

@Repository
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createProduct(Product product) {
		System.out.println("Product creating...");
		this.hibernateTemplate.saveOrUpdate(product);    			//save and update in single method
		System.out.println("Product created...");
	}
	
	//Get all product
	public List<Product> getProducts(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		System.out.println("Get all Products...");
		return products;
	}
	
	//Get single product
	public Product getProduct(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		System.out.println("Get single Products...");
		return product;
	}
	
	//Delete Single Product
	@Transactional
	public void deleteProduct(int pid) {
		Product product = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
		System.out.println("Product deleted...");
	}
	
}
