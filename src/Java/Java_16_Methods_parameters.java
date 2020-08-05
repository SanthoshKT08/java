package Java;

class Robot
{

	protected void speak (String text)
	{
		System.out.println(text);
	}

	public void jump (long Long)
	{
		System.out.println(Long);
	}

	public void size (double sizes)
	{
		System.out.println(sizes);
	}

	public void houseProperty(String houseName, double distance)
	{
		System.out.println("House Name is " + houseName + ", House Lenght is " +distance);
	}
	
	public static void laptop(String laptpname)
	{
		System.out.println(laptpname);
	}
	


	public void sheetData(String ExcelPath, String sheetName, int row, int col )
	{
        System.out.println("Excel path is " + ExcelPath + ", Sheet Name is " + sheetName + ", No of Rows is " + row + ", NO of colums is "+ col) ;
	}
	
	public static void keyboard(String key)
	{
		System.out.println(key);
	}
}


public class Java_16_Methods_parameters {

	public static void main(String[] args) {

		Robot obj = new Robot();
		obj.speak("Welcome to codewave");

		obj.speak("This is IT software company");

		obj.size(4.5);
		obj.houseProperty("Santhosh", 45.3);
		obj.sheetData(".//path", "SIGN IN/UP", 12, 3);
		Robot.laptop("Hp");
		Robot.keyboard("ewdfefs");
		
	}

}
