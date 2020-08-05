package Java;

public class Java_02_Using_Variables {
	
	public static void main(String[] args) {
		
		int myNumber = 2; // 4 byte
		short myShort = 32767;  // 2byte
		byte myByte = 127; //1 byte
		long myLong = 999999999; // 8 byte
		char myChar = 'a'; //undefind
		boolean myBoolean = true;
		boolean myBoolean1 = false;
		float myfloat = 2.24f;
		double muDouble = 34.34;
		
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myByte);
		System.out.println(myLong);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myBoolean1);
		System.out.println(myfloat);
		System.out.println(muDouble);
		
		for(char c = 'a';c<'z';c++)
		{
			System.out.print(c + " : "+ c + " : " + c);
		}
	}

}
