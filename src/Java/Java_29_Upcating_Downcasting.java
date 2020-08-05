package Java;

class Human // parent class
{
	public void start()
	{
	   System.out.println("Human do the work");	
	}
	
	public void clothing()
	{
		System.out.println("Humans can wears cloths");
	}
}

class Men extends Human // child 1
{
	public void start()
	{
		 System.out.println("Men can work");
	}
	
	public void clothing()
	{
		System.out.println("Men wears - Shirt and pant");
	}
}

class Women extends Human // child 2
{
	public void start()
	{
		 System.out.println("Women can work");
	}
	
	public void clothing()
	{
		System.out.println("Womens wears - sarees");
	}
}

public class Java_29_Upcating_Downcasting {
	
	public static void main(String[] args) {
		
		Human hum1 = new Human();
		Men men1 = new Men();
		Women women1 = new Women();
		
		hum1.start();
		men1.start();
		women1.start();
		
		// Upcasting Child to parent (Men to Human)
		
		Human hum2 = men1;  // parent = child
		
		hum2.start();
		hum2.clothing();
		
		Human hum3 = women1;  //hum3 is variable , in Human class you can see one metohd. in instance we have the women1 (new women)
		
		hum3.start();
		hum3.clothing();
		
		// DownCasting - Parent to child
		
		Human hum4 = new Men(); // parent = child
		
		Men men2 = (Men) hum4; // child = parent
		
		men2.start();
		men2.clothing();
		
		Human hum5 = new Women(); // parent = child class
		
		
		
		Women women2 = (Women) hum5;
		
		women2.start();
		women2.clothing();
		
	}

}
