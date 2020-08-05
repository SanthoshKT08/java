package Java;

public class Java_11_ArrayOfStrings {

	public static void main(String[] args) {
		
		
		String[] fruits = {"Mangoes", "Apples", "Orange", "pineapple"};
		
		String [] movies = {"Big hero 6", "Avengers", "spiderman"};
		
		
		for(String print:fruits)
		{
			System.out.println(print);
		}
//		
//		for(String movieNames: movies)
//		{
//			System.out.println(movieNames);
//		}
		
		for(int i=0;i<movies.length;i++)
		{
			System.out.println(movies[i]);
		}
		
		String a = null;
		
		int b = 0 ;
		
		System.out.println(a);
		System.out.println(b);
		
		
		float [] flo = {23.3f,32.3f};
		
		for(float digits:flo)
		{
			System.out.println(digits);
		}
	}
}
