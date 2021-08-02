package days13;

class StaticB
{
	static int count = 0;
	int num;
	public StaticB()
	{
		this.num = count+1;
		// 생성자 메소드에서 count 값을 1씩 증가시키며, 그 값을 num에 저장
		count++;
	}
	
	/*public static void aaa()
	{
		// num = 10; 에러
	}
	*/
}

public class Class18 
{
	public static void main(String[] args)
	{
		StaticB b1 = new StaticB();
		System.out.printf("num = %d, count = %d\n", b1.num, StaticB.count);
		StaticB b2 = new StaticB();
		System.out.printf("num = %d, count = %d\n", b2.num, StaticB.count);
		StaticB b3 = new StaticB();
		System.out.printf("num = %d, count = %d\n", b3.num, StaticB.count);
	}
}
