package com.example.productspring;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService{
	
//	List<Product> products = new ArrayList<>();
	@Autowired
	ProductDB db;
	
	
	public void addProduct(Product p) {
//		products.add(p);
		db.save(p);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		
		return db.findAll();
//		return products;
	}

	public Product getProduct(String name) {
		// TODO Auto-generated method stub
		List<Product> products = db.findAll();
		for(Product p: products) {
			if(p.getName() == name) {
				return p;
			}
		}
		return null;
	}
	
//	public List<Product> getProductsatPlace(String place){
//		List<Product> result = new ArrayList<>();
//		for(Product p: products) {
//			if(p.getPlace().toLowerCase().equalsIgnoreCase(place.toLowerCase())) {
//				result.add(p);
//			}
//		}
//		return result;
//	}
//	
//	public List<Product> getProductByText(String text){
//		List<Product> result = new ArrayList<>();
//			for(Product p: products) {
//				if(p.getName().toLowerCase().contains(text.toLowerCase()) || p.getType().toLowerCase().contains(text.toLowerCase()) || p.getPlace().toLowerCase().contains(text.toLowerCase())) {
//					result.add(p);
//				}
//			}
//			
//		return result;
//	}

}
