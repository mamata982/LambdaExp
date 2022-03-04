package newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1
{
int id;
String name;
float salary;
Product1(int id,String name,float salary)
{

	super();
	this.id=id;
	this.name=name;
	this.salary=salary;
}

}
public class LambdaWithFilter {

	public static void main(String[] args) {
		List<Product1> li=new ArrayList<Product1>();
		li.add(new Product1(1,"Suhas",25000f));
		li.add(new Product1(2,"Satish",15000f));
		li.add(new Product1(6,"Sagar",20000f));
		li.add(new Product1(3,"Sujay",35000f));
		
		Stream<Product1> data=li.stream().filter(p->p.salary>20000f);
		data.forEach(product->System.out.println(product.id+"   "+product.salary));

		

	}

}
