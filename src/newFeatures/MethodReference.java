package newFeatures;

interface Multiply
{
void multi();	

}
public class MethodReference {
	public static void multiSomething()
	{
		System.out.println("Please multiply something!!!");
	}

	public static void main(String[] args) {

		Multiply m1=MethodReference::multiSomething;
		m1.multi();
	}

}
