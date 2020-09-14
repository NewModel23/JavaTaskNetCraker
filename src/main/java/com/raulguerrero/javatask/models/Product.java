package com.raulguerrero.javatask.models;

public class Product {

	private String parent_object;
	private String products;
	private String name;
	private double price;
	
	
	
	
	public Product(String parent_object, String products, String name, double price) {
		this.parent_object = parent_object;
		this.products = products;
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return " " +  products + "," + name + ", price="+ price ;
	}
	public String getParent_object() {
		return parent_object;
	}
	public void setParent_object(String parent_object) {
		this.parent_object = parent_object;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
}
