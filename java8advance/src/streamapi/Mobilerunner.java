package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import streamapi.Mobile.Brand;

public class Mobilerunner {
	public static List<Mobile> mobiledetails=null;




	public static void main(String[] args) {
		Mobile mobilelist1=new Mobile(Brand.apple, "i", 0240, 10000, 020, 16, "white");
		Mobile mobilelist2=new Mobile(Brand.samsung, "2", 280, 21000, 020, 16, "white");
		Mobile mobilelist3=new Mobile(Brand.nokia, "004", 120, 35000, 020, 16, "white");
		Mobile mobilelist4=new Mobile(Brand.vivo, "005", 540, 40000, 020, 16, "white");
		Mobile mobilelist5=new Mobile(Brand.apple, "006", 0240, 50000, 020, 16, "white");
		Mobile mobilelist6=new Mobile(Brand.redmi, "007", 1240, 10000, 020, 16, "white");
		Mobile mobilelist7=new Mobile(Brand.moto, "008", 0240, 10000, 020, 16, "white");
		Mobile mobilelist8=new Mobile(Brand.vivo, "009", 120, 20000, 020, 16, "white");
		Mobile mobilelist9=new Mobile(Brand.vivo, "010", 240, 10000, 020, 16, "white");
		Mobile mobilelist10=new Mobile(Brand.samsung, "011", 240, 10000, 020, 16, "white");

		mobiledetails=Arrays.asList(mobilelist1,mobilelist2,mobilelist3,mobilelist4,mobilelist5,mobilelist6,mobilelist7,mobilelist8,mobilelist9,mobilelist10);
		mobiledisplay();
		lotohigh();
		
		List<Brand> streamapi=mobiledetails.stream()
		.map(Mobile::getBrand)
		.collect(Collectors.toList());
		
		System.out.println(streamapi);
		
		
		
		
	}
	public static void mobiledisplay() {


		System.out.printf("| %-15s | %-15s | %-15s | %-15s |%n",
				"Brand", "model", "memory", "price", "megapixel");

		for (Mobile mobile : mobiledetails) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());

		}
	}

	public static void lotohigh() {
		
		Collections.sort(mobiledetails);
		System.out.println("after sorting");
		
		System.out.printf("| %-15s | %-15s | %-15s | %-15s |%n",
				"Brand", "model", "memory", "price", "megapixel");

		for (Mobile mobile : mobiledetails) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |%n",mobile.getBrand(),mobile.getModel(),mobile.getMemory(),mobile.getMegapixel(),mobile.getPrice());

		}
		
		
	}
	

}
