package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class userentity {
 @Id
 private int productid;
 private String productname;
 private String quantity;
 private int price;
 public userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
public userentity(int productid, String productname, String quantity, int price) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.quantity = quantity;
	this.price = price;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}