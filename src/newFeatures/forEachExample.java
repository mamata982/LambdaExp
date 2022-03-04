package newFeatures;

import java.util.List;
import java.util.ArrayList;

public class forEachExample {
	public static void main(String args[])
	{
		List<String> li=new ArrayList<String>();
		li.add("Hari");
		li.add("Risu");
		li.add("Manu");
		li.add("Khadush");
		li.add("Pinky");
		li.forEach(
				n->System.out.println(n)

				);
	}

}
