package com.oops;

import java.util.Date;

class Product {
	String name;
	String brand;
	long price;
	Date manufactureDate;
	Date ExpiryDate;
	public Product(String name, String brand, long price, Date manufactureDate, Date expiryDate) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.manufactureDate = manufactureDate;
		ExpiryDate = expiryDate;
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		Product product = new Product("Biscuits", "GoodDay",5079l,new Date(), new Date());
		System.out.println(product.name);
	}

}
