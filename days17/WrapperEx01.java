package days17;

public class WrapperEx01 
{
	public static void main(String[] args)
	{
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// 참조 변수(레퍼런스 변수)들의 비교
		if(i1 == i2)
			System.out.println("i1과 i2가 값이 같습니다.");
		else 
			System.out.println("i1과 i2가 값이 다릅니다.");
		System.out.println("i1 == i2 ? " + (i1 == i2));
		
		// 실제 인스턴스에 저장된 값들의 비교
		if(i1.equals(i2))
			System.out.println("i1과 i2가 값이 같습니다.(equals)");
		else 
			System.out.println("i1과 i2가 값이 다릅니다.(equals)");
		System.out.println("i1.equals(i2) ? " + i1.equals(i2));
		
		System.out.println("i1.compareTo(i2) = " + i1.compareTo(i2));
		// 실제 인스턴스에 저장된 값들의 비교 - 뺄셈 연산으로 비교 앞의 숫자가 크면 양수 뒤에 숫자가 크면 음수 반환
		// 같으면 0 반환
	}
}
