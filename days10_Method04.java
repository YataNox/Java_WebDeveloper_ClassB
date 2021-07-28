package days10;

public class Method04 
{
	//Call By Reference 방식의 메소드 호출
	
	public static void main(String[] args)
	{
		System.out.println("프로그램 시작");
		int[] a = {111, 222, 333};
		System.out.println("\nmain에서 출력 : ");
		for(int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = %d\t", i, a[i]);
		
		updateValue(a);
		
		System.out.println("\nmain에서 출력 : ");
		for(int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = %d\t", i, a[i]);
	}
	
	public static void updateValue(int[] a)
	{
		a[0] = 100; a[1] = 200; a[2] = 300;
		System.out.println("\nupdateValue에서 출력 : ");
		for(int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = %d\t", i, a[i]);
	}
}
