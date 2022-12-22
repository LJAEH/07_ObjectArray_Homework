package com.hw3.model.vo;

public class Product {
	
	private int pld; // 제품번호
	private String pName; // 제품명
	private int price; // 제품 가격
	private double tax; // 제품 세금
	
	public Product() {}
	
	public Product(int pld, String pName, int price, double tax) {
		this.pld = pld;
		this.pName = pName;
		this.price = price;
		this.tax = tax;	
	}
	
	public String infomation() {
		return "제품번호 : " + pld + "제품명 : " + pName + "제품가격 : " 
				+ price + "제품 세금 : " + tax;	
	}
	

}
