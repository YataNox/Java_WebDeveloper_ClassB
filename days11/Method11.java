package days11;

public class Method11 
{
	public static void main(String[] args)
	{
		int[] a = {56, 87, 96, 59, 25, 48, 13, 33, 65, 78};
		int tot = 0;
		double avg;
		tot = sum(a); // 배열의 합계를 계산하여 리턴하는 메소드
		avg = average(a); // 배열의 평균을 계산하여 리턴하는 메소드
		prn(a, tot, avg); // 배열의 요소와 합계, 평균 출력
	}
	
	// 합계 메소드
	public static int sum(int[] a)
	{
		int value = 0;
		for(int i = 0; i < a.length; i++)
			value += a[i];
		
		return value;
	}
	
	// 평균 메소드
	public static double average(int[]a)
	{
		return  sum(a) / a.length;
	}
	
	// 출력 메소드
	public static void prn(int[] a, int tot, double avg)
	{
		System.out.println("계산할 점수들 : ");
		for(int i = 0; i < a.length; i++)
			System.out.printf("%d ", a[i]);
		System.out.println();
		
		System.out.printf("총점 : %d, 평균 : %.2f", tot, avg);
	}
}
