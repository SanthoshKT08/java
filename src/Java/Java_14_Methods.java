package Java;
class Student
{
	//Class contain data and methods.

	String name;
	int age;
	long ID;
	String Address;
	String DOB;
	String Job = "Quality Assurance";

	void hello()
	{
		    String hi = "hello";
			
			for(int a=0;a<10;a++)
			{
				System.out.println("Hello Student");
			}
	}
	
	public void done()
	{
		System.out.println("Process completed");
	}
	
	public static void method1()
	{
		System.out.println("Method 1 from static");
	}
	static void method2()
	{
		System.out.println("method 2 from static ");
	}

}


public class Java_14_Methods {

	public static void main(String[] args) {

		Student person1 = new Student();

		person1.name="KT Santhosh";
		person1.age=23;
		person1.ID=5122;
		person1.DOB="01/05/1997";
		person1.Address="77/1 Ganesh colony kelamangalam";
		person1.hello();
		System.out.println("Person name is "+person1.name);
		System.out.println("Person ID is "+person1.ID);
		System.out.println("Person age is "+person1.age);
		System.out.println("Person DOB is "+person1.DOB);
		System.out.println("Person Address is "+person1.Address);
		System.out.println(person1.Job);
		person1.done();
	    
		Student person2 = new Student();
		person2.hello();
		person2.name="Suman";
		person2.age=22;
		person2.ID=789;
		person2.Address="Ganesh colony";

		System.out.println("Person name is "+person2.name);
		System.out.println("Person ID is "+person2.ID);
		System.out.println("Person age is "+person2.age);
		System.out.println("Person Address is "+person2.Address);
		person2.done();
		
		Student.method1();
		Student.method2();

	}

}
