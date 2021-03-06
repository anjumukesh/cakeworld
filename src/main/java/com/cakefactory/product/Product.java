package com.cakefactory.product;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String ProductName;
	private String ProductCategory;
	private String ProductPrice;
	private String ProductQty;
	private String ProductImage;
	private String ProductDescription;
	
	@Transient
	private MultipartFile ProductFile;
	
	public MultipartFile getProductFile() {
		return ProductFile;
	}
	public void setProductFile(MultipartFile productFile) {
		ProductFile = productFile;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}
	public String getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}
	public String getProductQty() {
		return ProductQty;
	}
	public void setProductQty(String productQty) {
		ProductQty = productQty;
	}
	public String getProductImage() {
		return ProductImage;
	}
	public void setProductImage(String productImage) {
		ProductImage = productImage;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}
	
	
}
