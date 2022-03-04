package newFeatures;

import java.util.function.BiFunction;

class Arithmetic
{
 public static int add(int a,int b) {
	 return a+b;
	 
 }
 public static int substract(int a,int b)
 {
	 return a-b;
 }
 public static int multiply(int a,int b)
 {
	 return a*b;
 }
 public static int divide(int a,int b)
 {
	 return a/b;
 }
 public int add1(int a,int b)
 {
	 return a+b;
 }
}
public class MethodReferenceWithBiFunction {
	public static void main(String args[])
	{
		BiFunction<Integer,Integer,Integer>  a1=Arithmetic::add;
		BiFunction<Integer,Integer,Integer>  a2=Arithmetic::substract;
		BiFunction<Integer,Integer,Integer>  a3=Arithmetic::multiply;
		BiFunction<Integer,Integer,Integer>  a4=Arithmetic::divide;
		BiFunction<Integer,Integer,Integer> a5=new Arithmetic()::add1;//Non-static method call
		
		int result=a1.apply(10,20);
		int result1=a2.apply(20, 5);
		int result2=a3.apply(5, 5);
		int result3=a4.apply(25, 5);
		int result4=a5.apply(30, 40);
		System.out.println(result+"\n"+result1+"\n"+result2+"\n"+result3+"\n"+result4);
	}

}
