package com.exam;

import java.util.List;

public class FastFood {
	List<String> fastfood1;
	List<String> fastfood2;
	List<String> fastfood3;
	List<String> fastfood4;
	public FastFood(List<String> fastfood1, List<String> fastfood2, List<String> fastfood3, List<String> fastfood4) {
		this.fastfood1 = fastfood1;
		this.fastfood2 = fastfood2;
		this.fastfood3 = fastfood3;
		this.fastfood4 = fastfood4;
	}
	
	int id;
	String name;
	int price;
	int kcal;
	public FastFood(){
		
	}
	public FastFood(int id, String name ,int price, int kcal){
		this.id = id;
		this.name = name;
		this.price = price;
		this.kcal = kcal;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getKcal(){
		return kcal;
	}
	public void setKcal(int kcal){
		this.kcal = kcal;}
	public void Decide() {
		int decide = 1;
		System.out.print("1) 大麥克"+"\t"+
		"2) 雙層吉士牛肉堡"+"\t"+
			"3) 麥脆雞原味"+"\t"+
		"4) 麥香魚"+"\t"+
			"5) 薯條大包"+"\t"+
		"6) 可樂"+"\t"+
			"7) 冰紅茶"+"\t"+
		"0) 結算"+"\t"+"q) 離開(結束程式)"+"\t"+
			"請輸入餐點:");
		Scanner scanner = new Scanner(System.in);
		String sc = scanner.nextLine();
		int day = Integer.parseInt(sc);
		System.out.print("請輸入數量");
		sc = scanner.nextLine();
		int time = Integer.parseInt(sc);
		switch (day) {case 1:
			System.out.print("1. 麥香魚 ");
			
				case 2:
					System.out.print("2 . 雙層吉士牛肉堡 ");
				
			case 3:
				System.out.print("3) 麥脆雞原味 ");
			
			case 4:
				System.out.print("1. 麥香魚 ");
			
			case 5:
				System.out.print("1. 麥香魚 ");
			
			case 6:
				System.out.print("1. 麥香魚 ");
			
			case 7:
				System.out.print("1. 麥香魚 ");
			case 0:
				System.out.print("1. 麥香魚 ");
			
			case 9:
				System.out.print("1. 麥香魚 ");
			
			}
}}}
