package Java;


class Machine
{
	
	private String name;
	private int code;
	
	public Machine() // NO argument constructor
	{ 
		this("hello2" , 5); 
		System.out.println("First Constructor is running");
		name = "Santhosh";
		System.out.println(name);
	}
	
	public void getName()
	{
		name = "getName_santhosh";
		System.out.println(name);
	}
	
	public void setName(String name)
	{
		this.name=name;
		System.out.println(name);
	}

	public Machine(String name) //  parameter constructor with one variable
	{
		this();
		System.out.println("Second Constructor is running");
		this.name = name;
		System.out.println(name);
	}
	public Machine(String name, int code) //  parameter constructor with two variables.
	{
		System.out.println("Thrid Constructor is running");
		this.name=name;
		this.code=code;
		System.out.println("Your Name is " +name + " My code is "+ code);
	}
	
//	public String getName() /**NO need to create a methods , it will run automatically. That is constructors..**/
//	{
//		return name;
//	}
//	
//	public int getCode()
//	{
//		return code;
//	}




}
public class Java_18_Constructor {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Machine machine2 = new Machine("santhosh KT");
		Machine machine3 = new Machine("Codewave" , 4);
		machine1.getName();
		machine1.setName("SetName_santhosh");
		


	}



}
