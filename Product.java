package com.niit.shoppincart;

import java.util.List;

//Domain object/POJO(Plain old Java Object) / VLO(Value Object)/ Java Bean :Product
//meaning: these classes should contain properties and setter/getter and no functionality
public class Product {
	//add the properties:id,name,price
	
	private int id;
	private String name;
	private int price;
	private Supplier supplier;
	
	private List<Supplier> suppliers;
	
	
	public List<Supplier> getSuppliers() {
		return suppliers;
	}



	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}



	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	public Product(int id, String name,int Price) {
		this.id = id;
		this.name = name;
		this.price = price;
			}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0)
		{
			System.out.println("price shld be -ve");
			price=50_000;
		}
		this.price = price;
	}
	
	//to access the properties, write public method
	//these methods are called setter/getter methods
	
	

}
