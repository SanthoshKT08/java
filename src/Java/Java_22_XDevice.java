package Java;

public class Java_22_XDevice extends Java_22_Machine{


	public void XDevice()
	{
		System.out.println("XDeive : Recognizing the data");
	}

	@Override
	public void start() {
		System.out.println("XDevice Started");
	}
	
	@Override
    public void stop()
    {
    	System.out.println("XDevice stopped");
    }
}
