package newFeatures;

interface Messageable
{
public void sayMessage(String msg);	
}
class Message
{
	
Message(String msg)
{
System.out.println(msg);	
}

}
public class ConstructorReference {

	public static void main(String[] args) {
		Messageable m1=Message::new;
		m1.sayMessage("Hi My Lovly World!!!!");

	}

}
