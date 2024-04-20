package com.example.ProductDemo;

import java.util.List;

//import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        ProductService service = new ProductService();
//        service.addProduct(new Product("HP Omen", "Laptop", "Bahar table",2025));
//        service.addProduct(new Product("Lenovo T14", "Laptop", "Work bag",2026));
//        service.addProduct(new Product("Boat Immortal", "Headphones", "Bedside Table",2024));
//        service.addProduct(new Product("Water Bottle", "Bottle", "Bahar table",2023));
//        service.addProduct(new Product("Redgear Mouse", "Mouse", "Bahar table",2024));
//        service.addProduct(new Product("Logitech Mouse", "Mouse", "Work Bag",2026));
//        service.addProduct(new Product("Jabra elite 2", "Headphones", "Work Bag",2026));
        
        List<Product> products = service.getAllProducts();
        for(Product p: products) {
        	System.out.println(p);
        }
        
//        System.out.println("=============================================");
//        System.out.println(service.getProduct("HP Omen"));
//        
//        System.out.println("=============================================");
//        System.out.println(service.getProductsatPlace("Bahar table"));
//        
//        
//        System.out.println("============================================="); 
//        System.out.println(service.getProductByText("HP"));
    }
}
