package Java;


class Thing
{
	// Non-satic declaration
	public String name;
	public int a;
	
	// Static declaration
	public  static String description;
	// final keyword

	public final int dimension = 10;
	//non static method

	public static int count=0;
	public int id;
	public Thing() {
		id=count;
		count++;
	}
	public void NonStaticTest()
	{
		System.out.println("Non static data : Object" + ":" + id+ ","+description+ " : "+name);

	}

	//Static method
	public static void staticTest() {
		System.out.println("Static data " +description);
	}

}
public class Java_19_Static_and_Final {

	public static void main(String[] args) {

		//For non-static i have to create a obect

		System.out.println("Before creating object counts " + Thing.count);
		Thing obj = new Thing();
		Thing obj2 = new Thing();
		obj.a=3;
		obj.name = "santhosh";
		System.out.println("After creating object counts " + Thing.count);

		//Satic we can access through class.. class name+call the things like variable or methods
		Thing.description="Hello world";

		Thing.staticTest();
		obj.NonStaticTest();
		obj2.NonStaticTest();
		System.out.println(obj.dimension);	
		System.out.println(Math.PI);

		//System.out.println(Thing.dimension);
	}



}
