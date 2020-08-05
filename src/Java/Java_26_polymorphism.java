package Java;

public class Java_26_polymorphism {
	
	
	public static void main(String[] args) {
		
		
		Java_26_plant plant1 = new Java_26_plant();
		
		Java_26_Tree tree1 = new Java_26_Tree();
		
		plant1.grow();
		
		tree1.grow();
		
		Java_26_plant plant2 = tree1;
		
		plant2.grow();
		
		Java_26_Tree tree2 = tree1;
		
		tree2.grow();
		
		
		
	}
	
}
