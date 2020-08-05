package Java;

public class Java_22_Inheritance {

	public static void main(String[] args) {


		Java_22_Machine Mac = new Java_22_Machine();

		Mac.start();
		Mac.stop();
		System.out.println(Mac.java);

		Java_22_XDevice XD = new Java_22_XDevice();

		XD.start();
		XD.XDevice();
		XD.stop();
		Java_22_YDevice YD = new Java_22_YDevice();

		YD.start();
		YD.XDevice();
		YD.stop();



	}

}
