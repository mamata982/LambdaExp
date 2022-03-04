package newFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
int id;
String name;
float salary;
Product(int id,String name,float salary)
{
super();
this.id=id;
this.name=name;
this.salary=salary;
}
}
public class ComaraterWithLambda {

	public static void main(String args[])
	{
		List<Product> li=new ArrayList<Product>();
		li.add(new Product(1,"Hari",2500));
		li.add(new Product(3,"Nari",3500));
		li.add(new Product(5,"Murari",1500));
		System.out.println("Sorting on the basis of Names.....");
		Collections.sort(li,(p1,p2)->
		{return p1.name.compareTo(p2.name);}
		);
		for(Product p:li)
		{
			System.out.println(p.id+" "+p.name+" "+p.salary);
		}
		
		System.out.println("Sorting by Salary.....");
		Collections.sort(li,(p1,p2)->
		{return compare(p1.salary,p2.salary);}
		);
		
		for(Product p:li)
		{
			System.out.println(p.id+" "+p.name+" "+p.salary);
		}

	}

	private static int compare(float salary, float salary2) {
		if(salary==salary2)
		return 0;
		else if(salary>salary2)
			return 1;
		else
			return -1;
		
	}
}
