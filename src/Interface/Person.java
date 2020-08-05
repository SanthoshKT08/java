package Interface;

public class Person implements IShowInfo, Estimation{
	
	private String name;
	private double hrs;
	
	public Person(String name, double hrs) {
		this.name = name;
		this.hrs= hrs;
	}

	public void greeting()
	{
		System.out.println("Hello there");
	}

	public void showInfo() {
		System.out.println("Person name is " + name);
	}

	public void workProgress() {
		
		System.out.println("Person work in progress is " + hrs + " hours");
		
	}

}
