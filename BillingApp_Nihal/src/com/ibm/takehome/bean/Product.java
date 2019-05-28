package com.ibm.takehome.bean;

public class Product {
	
	//Data members for the Product 
	private int product_id;
	private String product_name ;
	private String product_category;
	private int product_price;
	
	//Parameterized Constructor for Product class
	public Product(int id, String name, String type, int price) {
		this.product_id = id;
		this.product_name = name;
		this.product_category = type;
		this.product_price = price;
	}
	
	//Default Constructor
	
	public Product() {
		
	}
	/**
	 * @return the product_id
	 */
	public int getProduct_id() {
		return product_id;
	}
	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}
	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	/**
	 * @return the product_category
	 */
	public String getProduct_category() {
		return product_category;
	}
	/**
	 * @param product_category the product_category to set
	 */
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	/**
	 * @return the product_price
	 */
	public int getProduct_price() {
		return product_price;
	}
	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	

}
