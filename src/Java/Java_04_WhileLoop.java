package Java;

public class Java_04_WhileLoop {


	public static void main(String[] args) {

     char alphabets = 'a';
     
     while (alphabets<'z') {
    	 
    	 System.out.println(alphabets);
    	 
    	 alphabets++;
	}
     
     String actual = "ab";
     String expected = "a";
     
     while (actual == expected) {
		
    	 System.out.println("condition trueee");
    	 break;
	}
     System.out.println("next");
 
	}

}
