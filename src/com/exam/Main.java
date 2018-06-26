package com.exam;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
public class Main {
	
public Main(){
	


		List<FastFood> fastfood = new ArrayList<>();
		FastFoodTester fft = new FastFoodTester();
	try {
		FileReader fr = new FileReader("menu.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		String[] tokens = line.split(", ");
for(int a=0; a<=4;a++){
			String name = (tokens1[a*2+1]);
			List<String> schedule1 = new ArrayList<>();
			for (int i = 0; i < tokens1.length; i++) {
				schedule1.add(tokens1[i]);
		for(int i = 0; i< count; i++){
			String name = tokens[i*2+1];
			int price = Integer.parseInt(tokens[i*2+2]);
			int kcal = Integer.parseInt(tokens[i*2+3]);
			fft.fastfoods.add(new FastFood(i, name, price, kcal));
		}
		fft.on();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(
			"1) 大麥克"+"\t"+
			"2) 雙層吉士牛肉堡"+"\t"+
				"3) 麥脆雞原味"+"\t"+
			"4) 麥香魚"+"\t"+
				"5) 薯條大包"+"\t"+
			"6) 可樂"+"\t"+
				"7) 冰紅茶"+"\t"+
			"0) 結算"+"\t"+"q) 離開(結束程式)"+"\t"+
				"請輸入餐點:");
	Scanner scanner =new Scanner (System.in);
	String sc= scanner.nextLine();
	int meal = Integer.parseInt(sc);
	System.out.print("請輸入數量:");
	sc= scanner.nextLine();
	int number = Integer.parseInt(sc);
	for(int n = 0; n <fastfoods.size(); n++){
				FastFood fastfood = fastfood.get(n);
				System.out.println(fastfood.getId() + "\t" + fastfood.getName() + "\t" + fastfood.getPrice());
			}
	switch(meal){
	case 1:
		System.out.print("1. 麥香魚 ");
	
		case 2:
			System.out.print("2 . 雙層吉士牛肉堡 ");
		
	case 3:
		System.out.print("4) 麥香魚 ");
	
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
	}
	}
	
	
