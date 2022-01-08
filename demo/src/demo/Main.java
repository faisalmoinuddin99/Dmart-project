package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String args[]) {
		
		Dmart person1 = new Dmart() ;
		Dmart person2 = new Dmart() ;
		Dmart person3 = new Dmart() ;
		
		List<Dmart> cart = new ArrayList<>() ;
		person1.setProductId(1);
		person1.setProductName("Bread");
		person1.setProductCost(5.5);
		cart.add(person1) ;
		
		person2.setProductId(2);
		person2.setProductName("Butter");
		person2.setProductCost(6);
		cart.add(person2) ;
		
		person3.setProductId(3);
		person3.setProductName("Rice");
		person3.setProductCost(10.9);
		cart.add(person3) ;
		
		
		for(Dmart parseCart : cart) {
			System.out.println(parseCart.toString());
		}
		
		Double sum = cart.stream()
				.map(x -> x.getProductCost())
				.reduce((double) 0, (a, b) -> a + b) ;
		
		System.out.println("Diwali Total Sales: "+sum +"$");
			
	
	}
	

}
