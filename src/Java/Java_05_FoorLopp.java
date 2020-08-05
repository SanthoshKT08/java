package Java;

public class Java_05_FoorLopp {

	public static void main(String[] args)
	{

		int a=0;
		while (a<10) {
			
			System.out.println(a+" While Loop");
			
			if(a==9)
			{
				System.out.println("If statement");
				break;
			}
			else
			{
				System.out.println("Google");
			}
			
			for(int b=1;b<=5;b++)
			{
				System.out.println(b);
			}
			
			a++;
			
		}	
	}	

}
