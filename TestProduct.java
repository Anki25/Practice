package com.niit.shoppincart;

public class TestProduct {
	
	public static void main(String[] args){
		
	Product p1 = new Product();
		p1.setId(101);
		p1.setName("iPhone");
		p1.setPrice(70_000);
		
		System.out.println("ID: " + p1.getId());
		System.out.println("NAME: " + p1.getName());
		System.out.println("PRICE: " + p1.getPrice());
	}

}
