package Interface;

public class App {

	public static void main(String[] args) {

		Machine mac = new Machine();
		Person per = new Person("Santhosh" , 8.0);
		
		IShowInfo info1 = new Machine();
		info1.showInfo();
		
		Estimation est = new Machine();
		est.workProgress();
		
		IShowInfo info2 =mac;
		
		info2.showInfo();
		
		Estimation est2 = per;
		
		est2.workProgress();
		
		System.out.println();
		
		outputInfo(mac);
		outputInfo(per);
		outputInfo(info1);
		outputInfo(info2);
		
	}
	
	private static void outputInfo(IShowInfo info)
	{
		info.showInfo();
	}

}
