package newFeatures;
interface wellcome
{
	 public String say();
	}

public class LamdaExp{
	
public static void main(String[] args) {

	wellcome s1=()->
	{
		return "MY FIRST LAMBDA EXP EXample";
	};
	 System.out.println(s1.say());
		
	}
}


