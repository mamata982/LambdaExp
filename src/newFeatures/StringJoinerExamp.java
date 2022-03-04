package newFeatures;

import java.util.StringJoiner;

public class StringJoinerExamp {

	public static void main(String[] args) {

		StringJoiner joinNames=new StringJoiner(",");
		System.out.println(joinNames);
		joinNames.setEmptyValue("It is an empty");
		System.out.println(joinNames);
		
		joinNames.add("Suhana");
		joinNames.add("Mohana");
		joinNames.add("Ahana");
		joinNames.add("Sugandha");
		System.out.println(joinNames);
		StringJoiner joinNames1=new StringJoiner(",","[","]");
		joinNames1.add("Suhana");
		joinNames1.add("Mohana");
		joinNames1.add("Ahana");
		joinNames1.add("Sugandha");
		System.out.println(joinNames1);
		StringJoiner joinNames2=new StringJoiner(":","[","]");
		joinNames2.add("Lalita");
		joinNames2.add("Rohit");
		System.out.println(joinNames2);
		StringJoiner merge=joinNames.merge(joinNames2);
		System.out.println(merge);
		int length=joinNames.length();
		System.out.println("Length:"+length);
		String str=joinNames.toString();
		System.out.println(str);
		char ch=str.charAt(5);
		System.out.println("Character at Index:"+ch);
		
		
		
		
	}

}
