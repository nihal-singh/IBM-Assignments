package com.ibm.takehome.service;


import com.ibm.takehome.bean.Product;

//Interface for the Product Service
public interface IProductService {
	
	void generateBill();//generates bill for the product.
	
	Product getProductDetails (int productCode); //retreives product from the Hash MAp
		
	void showProductDetails(Product product, int qty); //Displays all the info of the product.
	

}
