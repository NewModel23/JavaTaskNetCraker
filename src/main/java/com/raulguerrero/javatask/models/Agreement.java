package com.raulguerrero.javatask.models;


import java.util.List;

public class Agreement {

	@SuppressWarnings("unused")
	private String name;
	
	private String signed_by;
	
	List<Product> products;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSigned_by() {
		return signed_by;
	}

	public void setSigned_by(String signed_by) {
		this.signed_by = signed_by;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Agreement [name=" + name + ", signed_by=" + signed_by + ", products=" + products + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
