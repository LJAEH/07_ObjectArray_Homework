package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {

	private Product pro = null;
	
	public int count;
	
	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("= 제품 관리 메뉴 =");
			System.out.println("1.제품 정보 추가");
			System.out.println("2.제품 전체 조회");
			System.out.println("0.프로그램 종료");
			System.out.print("번호입력 >>>>");
			menuNum = sc.nextInt();
			
			switch(menuNum){
				
				case 1 : System.out.println( productInput() );break;
				case 2 : System.out.println( productPrint() );break;
				case 0 : System.out.println( "프로그램을 종료합니다" );break;
				default : System.out.println("메뉴번호 재입력");
			}
			
		} while( menuNum != 0 );
	}
	
	public String productInput() {
		
		
		return "";
	}
	

	public String productPrint() {
		
		
		return "";
	}
	
	
	
}
