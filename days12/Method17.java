package days12;

public class Method17 
{	
	public static void main(String[] args)
	{
		int[][] a = new int [9][];
		
		input(a); // 그림과 같이 배열을 구성하고 값을 대입
		prn(a); // 그림과 같이 출력
	}
	
	public static void input(int[][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i < 5)
				a[i] = new int[i+1];
			else
				a[i] = new int[9-i];
		}
		
		int num = 1;
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++)
				a[i][j] = (num++);
	}
	
	public static void prn(int[][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
				System.out.printf("%-2d\t", a[i][j]);
			System.out.println();
		}
	}
}
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19
// 20 21 22
// 23 24
// 25
