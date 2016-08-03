
package com.niit.shoppincart;

import java.util.List;

public class Supplier {
   
	
	private String Id;
	private String name;
	private String address;

    private Product product;  //recursive concept-product data type is product to get properties of product from product class

    private List<Product> products;
    
    
    
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Supplier(String id, String name, String address) {
		Id = id;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
    


}
