package newFeatures;

interface Addable
{
	default int add(int a,int b)//default method
	{
		return a+b;
	}
	void sayable();//abstract method
	static void sayHello()//static method
	{
		System.out.println("Hello to Static method");
	}
	
}
abstract class Demo
{
	public Demo()
	{
		System.out.println("Abstact class Demo constructor...");
	}
	static void say()
	{
		System.out.println("Static say method");
	}
	abstract int sub(int a,int b);
	void saySomething()
	{
		System.out.println("Non-static method of saySomething...");
		
	}
	
}
public class DefaultMethod extends Demo implements Addable  {
	public int sub(int a,int b)
	{
		return a-b;
	}
	public void sayable()
	{
		System.out.println("Risu...say something!!!!");
	}
	
	public static void main(String args[])
	{
		DefaultMethod m1=new DefaultMethod();
		int result=m1.add(100, 25);
		System.out.println(result);
		m1.sayable();
		Addable.sayHello();
		int result1=m1.sub(20, 5);
		System.out.println(result1);
		m1.saySomething();
		Demo.say();
		
		
	}
	
	
	

}
