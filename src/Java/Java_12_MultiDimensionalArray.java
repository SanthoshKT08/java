package Java;

public class Java_12_MultiDimensionalArray {

	public static void main(String[] args) {
		
		
	int [][] grid = {
		
			{21,32,53,5,45,5},
			{23,86,456,56},
			{12,32}
	};
	
	int [][] sup = {
			
			{12,3,3,3},
			
			{23,232,2323,3},
			
			{1,32,43,43,4,34,343,},
			{1,32,43,43,4,34,343,},
			
			{1,32,43,43,4,34,343,},
			{1,32,43,43,4,34,343,},
			{1,32,43,43,4,34,343,},
			
	};
	
	String [][] login_data = {
			
			{"santhosh", "123456"},
			{"santhosh", "123456"}
	};
	
	for(int v=0;v<login_data.length;v++)
	{
         for(int u=0;u<login_data[0].length;u++)
		{
			System.out.println(login_data[v][u]);
		}
	}

	
	for(int i=0;i<sup.length;i++)
	{
		for(int j=0;j<sup[0].length;j++)
		{
			System.out.print(sup[i][j] + "\t");
		}
		
		System.out.println();
	}
	
	System.out.println(sup[0][1]);

	
	String [][] words = {
			
			{"santhosh", "sathish", "Google"},
			{"Amazon", "jackma"},
			{"avengers"},
			{"GOd", "Nature"}
	};
	
	double [][] dou = {
			
			{2.2, 4.3,9.7}	
		
	};

	
	for(int a=0; a<words.length;a++)
	{
		for(int b=0; b<words[a].length;b++)
		{
			System.out.print(words[a][b]+"\t");
		}
		System.out.println();
	}
	
//	
//	System.out.println(grid[1][3]);
//	
//	System.out.println(grid[2][0]);
	
	for(int row=0;row<grid.length;row++) {
		for(int col=0;col<grid[row].length;col++)
		{
			System.out.print(grid[row][col] + "\t");  //tab
			
		}
		
		System.out.println();
	}
	
	String [][] array = new String[2][3];
	
	array[0][1]="santhosh";// 0 ROw - 1 col
	array[1][2]="codewave";
	
	System.out.println(array[0][1]);
	System.out.println(array[1][2]);

	}
}
