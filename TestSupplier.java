package com.niit.shoppincart;

import java.util.ArrayList;

import java.util.List;

public class TestSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  Product p1=new Product(101,"iPhone",70_000);
      Product p2=new Product(102,"TV",50_000);
      
      Supplier s1=new Supplier("SUP001","Reliance","Mumbai");
      Supplier s2=new Supplier("SUP002","Croma","Bangalore");
      Supplier s3=new Supplier("SUP003","Pai Electronics","Delhi");
      Supplier s4=new Supplier("SUP004","Bajaj Electronics","Chennai");     
      
      
      
      List<Supplier> supplierList = new ArrayList<Supplier>();
      supplierList.add(s1);
      supplierList.add(s2);
      supplierList.add(s3);
      supplierList.add(s4);
      
      p1.setSuppliers(supplierList);
      p2.setSuppliers(supplierList);
      //List<Product> productList = new ArrayList<Product>();
      //productList.add(p1);
      //productList.add(p2);
      
      
      //s1.setProducts(productList);
         
      System.out.println("The details ...");
      
      System.out.println(p1.getId());
      System.out.println(p1.getName());
      System.out.println(p1.getPrice());
      System.out.println("...........");
      
      System.out.println(p2.getId());
      System.out.println(p2.getName());
      System.out.println(p2.getPrice());
      System.out.println("...........");
      
     /* System.out.println(s1.getId());
      System.out.println(s1.getName());
      System.out.println(s1.getAddress());
      System.out.println("...........");*/
      
     /* System.out.println("Product details are: ");
      List<Product> products= s1.getProducts(); */
      
    /*  for(Product p : products)
      {//if(p.price<60_000)
    	  System.out.println(p.getId());
    	  System.out.println(p.getName());
    	  System.out.println(p.getPrice());
    	  System.out.println("..........");
      } */
      
      System.out.println("Supplier details are: ");
      List<Supplier> suppliers= p1.getSuppliers();
      
      for(Supplier s : suppliers)
      {
    	  System.out.println(s.getId());
    	  System.out.println(s.getName());
    	  System.out.println(s.getAddress());
    	  System.out.println("..........");
      }
      
	}

}
