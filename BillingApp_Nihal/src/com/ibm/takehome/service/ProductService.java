package com.ibm.takehome.service;

import java.util.Scanner;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.util.CollectionUtil;

public class ProductService implements IProductService{
	Scanner scan = new Scanner(System.in);
	Product product = new Product();

	@Override
	public void generateBill() {
		System.out.println("Enter the product code : ");
		int code = scan.nextInt();
		if(CollectionUtil.products.containsKey(code)) {
			product = getProductDetails(code);
		}
		else {
			System.out.println("Sorry ! The Product Code <<"+code+">> is not available");
			
			
		}
		System.out.println("Enter Quantity : ");
		int qty = scan.nextInt();
		showProductDetails(product,qty);
		
		
	}

	@Override
	public Product getProductDetails(int productCode) {
		product = CollectionUtil.products.get(productCode);
		return product;
	}
	
	@Override
	public void showProductDetails(Product product, int qty) {
		System.out.println("Product Code : "+ product.getProduct_id());
		System.out.println("Product Name : "+product.getProduct_name());
		System.out.println("Product Category : "+product.getProduct_category());
		System.out.println("Product Price : "+product.getProduct_price());
		System.out.println("Line Total : Rs."+product.getProduct_price()*qty);
		
	}

}
