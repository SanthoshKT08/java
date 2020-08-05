package Java;

class anonymous
{
	public void start()
	{
		System.out.println("Machine is starting....");
	}
}

interface tree
{
	public void grow();
}

interface neem
{
	public void leaf();
}

interface banana
{
	public  void leaf();
}

public class Java_32_Anonymous_class {
	
	public static void main(String[] args) {
		anonymous ano = new anonymous() {
			@Override
			public void start() {
				System.out.println("camera is snapping....");
			}
			
		};
		ano.start();

		
		tree tr = new tree() {
			
			@Override
			public void grow() {
				
				System.out.println("Tree is 5 years old");
			}
			
		};
		
		tr.grow();
		
		neem obj = new neem() {
			
			@Override
			public void leaf() {
				System.out.println("Leaf is growing");
				
			}
		};
		
		obj.leaf();
		
		banana ba = new banana() {
			
			@Override
			public void leaf() {
				System.out.println("Banana lover");
			}
		};
		
		ba.leaf();
		
	}
}
