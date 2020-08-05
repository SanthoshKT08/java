package Java;

public class Java_10_Array {

	public static void main(String[] args) {

	   int [] values = new int[10];
	   
	   values[0]=10;
	   values[1]=20;
	   values[2]=30;
	   values[3]=40;
	   values[4]=50;
	   values[5]=60;
	   values[6]=70;
	   values[7]=80;
	   values[8]=90;
	   values[9]=100;
	   
	   System.out.println(values[6]);
	   for(int a=0;a<values.length;a++)
	   {
		   System.out.println(values[a]);
	   }
	   
	   double [] digits =  {2.3, 5.4};
	   
	   for(int i=0;i<digits.length;i++) {
		   System.out.println(digits[i]);
	   }
	   
	   String [] names = {"santhosh", "Nisha", "Hemanth", "Jaya" , "Velu" , "Thulasiraman", "Laskshmi"};
	   
	   for(int b=0;b<names.length;b++)
	   {
		   System.out.println(names[b]);
	   }
	   
	   Object [] var = {"santhosh", 2 , 'd', 32.32};
	   
	   String [] data = {"santhosh"};
	   
	   for(int c=0;c<var.length;c++)
	   {
		   System.out.println(var[c]);
	   }
	   
	}

}
