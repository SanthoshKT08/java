package Java;

import java.util.ArrayList;

public class Java_30_Generics4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("pond heron");
		strings.add("baya weaver");
		strings.add("Grey heron");
		strings.add("Parrot");
		strings.add("Paady pipeit");
		strings.add("White throated kingfisher");
		strings.add("white taped");
		strings.add("American pekin");
		
		for (String string : strings) {
			
			System.out.println(string);
		}
		
//		for(int a=0;a<strings.size();a++)
//		{
//			System.out.println(strings.get(a));
//		}
//		
		ArrayList<String> count = new ArrayList<String>();
		count.add("1st one is manual testing");
		count.add("second one is automation");
		count.add("3rd one is jmeter - performance testing");
		
		for (String course : count) {
			System.out.println(course);
		}
			    
	}

}
