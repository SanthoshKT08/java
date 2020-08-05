package Java;
class person
{
	
	//Class contain data and methods.
	
	String name;
	int age;
	long ID;
	String Address;
	String DOB;
}


public class Java_13_classes_Object {

	public static void main(String[] args) {
		
		person person1 = new person();
		
		person1.name="KT Santhosh";
		person1.age=23;
		person1.ID=5122;
		person1.DOB="01/05/1997";
		person1.Address="77/1 Ganesh colony kelamangalam";
		
		System.out.println("Person name is "+person1.name);
		System.out.println("Person ID is "+person1.ID);
		System.out.println("Person age is "+person1.age);
		System.out.println("Person DOB is "+person1.DOB);
		System.out.println("Person Address is "+person1.Address);
		
		person person2 = new person();
		
		person2.name="Suman";
		person2.age=22;
		person2.ID=789;
		person2.Address="Ganesh colony";
		
		System.out.println("Person name is "+person2.name);
		System.out.println("Person ID is "+person2.ID);
		System.out.println("Person age is "+person2.age);
		System.out.println("Person Address is "+person2.Address);
		
	}
}
