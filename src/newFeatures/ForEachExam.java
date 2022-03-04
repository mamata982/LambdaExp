package newFeatures;

import java.util.ArrayList;
import java.util.List;

public class ForEachExam {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("Hari");
		li.add("Nari");
		li.add("Murari");
		li.add("Lari");
		li.add("Mira");
		System.out.println("Iterating elements using forEach() loop in Lambda Expe");
		li.forEach(lists->System.out.println(lists));
		System.out.println("Iterating by passing method reference....");
		li.forEach(System.out::println);
		
		System.out.println("forEachOrdered by passing Lambda Expression....");
		li.stream().forEachOrdered(lists->System.out.println(lists));
		System.out.println("forEachOrdered by passing Method Reference....");
		li.stream().forEachOrdered(System.out::println);
		


	}

}
