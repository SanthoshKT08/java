package Java;
class Dog
{
     private String dogName="kt";
     private int id=2;
     
     public Dog(String dogName, int id) {
    	 this.dogName=dogName;
    	 this.id=id;
	}
     
//     public String toString()
//     {
//    	 return dogName + " : "+ id;
//     }
     
     public String toString()
     {
    	 StringBuilder sb= new StringBuilder();
    	 sb.append(dogName).append(" : ").append(id);
    	 return sb.toString();
     }
     
     public String re()
     {
    	 return dogName + id;
     }
}
public class Java_21_StringMethod_and_ObjectClass {

	public static void main(String[] args) {
		
		Dog obj =new Dog("Tony" ,4);
		Dog obj1 =new Dog("Pen" ,4);
		Dog obj2 = new Dog("bus", 20);
		
		
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		  
		
	}



}
