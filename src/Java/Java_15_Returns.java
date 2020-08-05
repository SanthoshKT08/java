package Java;
class children
{

	// Class contain data variables and methods.
	String name;
	int age; 
	char alpha;
	static String chromePath;
	String loc;

	int futurYears()  //non static Return method.
	{
		int years = 10+age;
		return years;
	}
	
	public String path1()
	{
		System.out.println(loc);
		return loc;
	}
	
	public  void setpath(String loc)
	{
		this.loc=loc;
	}
	
	String getName()  //non static Return method.
	{
		String name = "Codewave";
		return name;
	}
	
	int getAge()
	{
		return age;
	}
	
	String laptops()
	{
	  String laptopNames = "Hp, Google, Vivo, Samasung";
	  return laptopNames;
	}
	
	public String Automation()
	{
		String Test = "API, Mobile , Web";
		return Test;
	}
	
	double digits()
	{
		double laptopSize = 3.3;
		return laptopSize;
		
	}
	
	char alphabets()
	{
		return alpha;
	}
	
	static String path()
	{
		return chromePath;
	}
	

}


public class Java_15_Returns {

	public static void main(String[] args) {

       children person1 = new children();
       
       person1.name="Heamanth";
       person1.age=8;
       person1.alpha='a';
       children.chromePath="//chromedriver.exe";
       
       int years = person1.futurYears();
       
       System.out.println(person1.name+" Age is "+person1.age);
       
       System.out.println(person1.getAge()); // return method.
       System.out.println(person1.age);
       System.out.println(person1.getName()); // return method.
       System.out.println(person1.name);
       String laptopNames = person1.laptops();
       System.out.println(laptopNames);
       System.out.println(person1.digits());
       System.out.println(person1.alphabets());
       System.out.println(children.path());
       person1.setpath("//dsfsdfsdfsfdsfds.exe");
       person1.path1();
       
       System.out.println(person1.Automation());

	}

}
