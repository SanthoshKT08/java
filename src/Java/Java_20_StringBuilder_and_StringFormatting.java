package Java;

public class Java_20_StringBuilder_and_StringFormatting {

	public static void main(String[] args) {
		
		String info = "" ;
		
		info += "my name is";
		
		info += " ";
		
		info +="Santhosh";
		
		System.out.println(info);
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("My name is santhosh");
		sb.append(" ");
		sb.append("Im a photographer");
		
		System.out.println(sb.toString());
		
		StringBuilder s= new StringBuilder();
		
		s.append("My father name is thulasiraman. ").append(" ").append("He is a teacher.").append("He works hard");
		System.out.println(s.toString() );
		
		System.out.println("Hello \t santhosh");
		
		System.out.printf("My age is %d : I will learn java %d percentage", 22, 100);
		
		for(int a=0; a<20;a++)
		{
			System.out.printf(" %4d : HI\n" , a);
		}
		
	}



}
