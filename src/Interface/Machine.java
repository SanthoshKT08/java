package Interface;

public class Machine implements IShowInfo,Estimation{
	
	private int ID = 5122;
	private double hrs = 6.3;
	
	public void start()
	{
		System.out.println("Machine Started");
	}
	
	public void stop() {
     System.out.println("Machine Stopped");
	}


	public void showInfo() {
		System.out.println("machine ID is " + ID);
	}

	public void workProgress() {
		System.out.println("machine working progess is " + hrs + "hours");
	}

}
