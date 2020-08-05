package Java;


class BayaWeaver
{
	private String bird;
	private int age;
	private double height;
	private String office;
	
	public void setName(String newName)  // set method
	{
		bird = newName;
	}

	public void setAge(int newAge) // set method
	{
		age = newAge;
	}

	public void setHeight(double newHeight) //set method
	{
		height = newHeight;
	}
	
	public void setOffice(String office) //Using this keyword to setting data.
	{
		this.office=office;
		
	}

	public String getName() // get method
	{
		return bird;
	}

	public int getAge() // get method
	{
		return age;
	}

	public double getHeight()
	{
		return height;
	}
	
	public String getOffice()
	{
		return office;
	}


}
public class Java_17_SettersAnd_this {

	public static void main(String[] args) {


		BayaWeaver obj = new BayaWeaver();

//		obj.bird = "Yelllo Baya Weaver"; 
//		obj.height = 23.2;
//		obj.age=3;

		obj.setHeight(45.33);
		obj.setAge(6);
		obj.setName("Red Baya Weaver");
		obj.setOffice("Codewave");
		System.out.println(obj.getOffice());
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getHeight());
		
	}



}
