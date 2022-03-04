package newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class ProductList
{
	int id;
	String name;
	float price;
	ProductList(int id,String name,float price)
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	
	
}
public class StreamExamp1 {

	public static void main(String[] args) {
		List<ProductList> li=new ArrayList<ProductList>();
		li.add(new ProductList(1,"Samsung",27000f));
		li.add(new ProductList(2,"Sony",30000f));
		li.add(new ProductList(5,"Hitachi",40000f));
		li.add(new ProductList(4,"Usha",25000f));
		li.add(new ProductList(3,"Chrompton",80000f));
		li.add(new ProductList(7,"Chrompton",80000f));
		li.add(new ProductList(6,"Usha",25000f));
		List<Float> li2=li.stream().filter(p->p.price>=30000f).map(p->p.price).collect(Collectors.toList());
		System.out.println(li2);
		
		//By summing the total Price by using Collectors class
		double  li3=li.stream().collect(Collectors.summingDouble(p->p.price));
		System.out.println(li3);
		//Finding Min and Max value
		
		ProductList productA=li.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
		System.out.println(productA.price);
		ProductList productB=li.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
		System.out.println(productB.price);
		
		//Count using Filter
		long count=li.stream().filter(p->p.price>27000f).count();
		System.out.println(count);

		//Convert List to Set
		Set<Float> setPrice=li.stream().filter(p->p.price<30000f).map(p->p.price).collect(Collectors.toSet());
		System.out.println(setPrice);
		//List to Map
		Map<Integer,String> map=li.stream().collect(Collectors.toMap(p->p.id, p->p.name));
		System.out.println(map);
		
		//Stream with MethodReference
		
		List<Float> list=li.stream().filter(p->p.price>30000f).map(ProductList::getPrice).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
