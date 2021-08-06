package days17;

import java.math.BigInteger;

public class WrapperEx02 
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 30; i++)
		{
			System.out.printf("%d! = %s\n", i, calFactorial(i));
		}
	}
	public static String calFactorial(int i)
	{
		String result = null;
		BigInteger n = BigInteger.valueOf(i); // 전달된 int 형의 i 값을 BigInteger으로 변환
		BigInteger fact = BigInteger.ONE; // fact 변수 생성 -> 1초기화
		
		// for(int j = 1; j < n; j++
		for(BigInteger j = BigInteger.ONE; j.compareTo(n) <= 0; j = j.add(BigInteger.ONE))
			fact = fact.multiply(j);
		
		result = fact.toString(); // 결과 문자열로 변환
		return result; // 결과 리턴	
	}
}
