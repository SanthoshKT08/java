package Java;

import java.io.IOException;

class test
{
	public void run() throws IOException
	{
		int code = 2;
		if(code!=0)
		{
			throw new IOException("Code is not exceuted..bec of exception");
		}
		//System.out.println("hello program is running successfully...");
	}
}

public class Java_35_throwingException {

	public static void main(String[] args) {
		test t1 = new test();
		try {
			t1.run();
		} catch (IOException e) {
          
			System.out.println(e.getMessage());
		}
	}

}
