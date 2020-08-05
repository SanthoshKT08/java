package Java;

import java.util.ArrayList;

class Hp
{

	@Override
	public String toString() {
		return "I'm a laptop - AMD processor";
	}
	
	public int a;

	public int getA() {
		
		System.out.println(a);
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}

public class Java_31_Generics_Wildcards {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("Two");
		list.add("Three");
		list.add("four");
		list.add("five");
		showlist(list);
		ArrayList<Boolean> count  = new ArrayList<Boolean>();
		
		ArrayList<Hp> lap = new ArrayList<Hp>();
		lap.add(new Hp());
		lap.add(new Hp());
		
		count.add(true);
		count.add(false);
		
		boole(count);
		classCreatingArrayList(lap);
		
	}	
	
	public static void showlist(ArrayList<String> list)
	{
		for (String values : list) {
			System.out.println(values);
		}
	}
	
	public static void boole (ArrayList<Boolean> count)
	{
		for (Boolean boolean1 : count) {
			System.out.println(boolean1);
		}
	}
	
	public static void classCreatingArrayList(ArrayList<Hp> lap)
	{
		for (Hp hp : lap) {
			System.out.println(hp);
	}
		Hp obj  = new Hp();
		obj.setA(5);
		obj.getA();
		obj.equals(obj);
	
	
	}
}
