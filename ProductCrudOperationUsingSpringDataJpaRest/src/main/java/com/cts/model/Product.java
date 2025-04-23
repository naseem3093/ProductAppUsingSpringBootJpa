package com.cts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "product_info")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Product {
	@GeneratedValue
	@Id
	private int productId;
	@NotBlank(message="product name cannot be null or blank")
	//@NotNull
	//@NotEmpty
	private String productName;
	@Min(value = 100,message="The minimum value u can add is 100")
//	@Min(value = 100000,message="the maximum value u can add is 100000")
	private int productPrice;
	@NotEmpty(message="category cannot be empty")
	@Size(min = 3,max = 12,message ="the category length should be above 3 char and below 12 char")
	private String productCategory;
	@PositiveOrZero(message="cannot be negative")
	private int productQuantity;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, int productPrice, String productCategory, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
	}  

}