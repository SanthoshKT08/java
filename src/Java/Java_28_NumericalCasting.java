package Java;

public class Java_28_NumericalCasting {
		
	
	public static void main(String[] args) {
		
		//Primitive data types...
		
		 int intValue = 123;  // 4byte
		
		 short shortValue = 31; // 2byte
		
		byte byteValue = 12; // 1byte
		
		double doubleValue = 98.32; // 8byte
		
		float floatValue = 54.34f; //4byte
		
		long longValue = 79832; // 8byte
		
		char charValue = 'a';  // 2 byte
		
		
		// int to short 
		
		intValue = shortValue;
		
		// short to int
		
		shortValue = (short) intValue;
		
		//char to int
		
		charValue = (char)intValue;
		
		intValue = charValue;
		
		intValue = (int)longValue;
		
		
		
		System.out.println(intValue);
		
		System.out.println(shortValue);
		System.out.println(charValue);
		System.out.println(Byte.MAX_VALUE);
	
		
		
	}

}
