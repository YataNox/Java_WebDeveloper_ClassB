package days04;

// 산술 - 사(오)칙연산자) +,-*,/,%
// 관계연산자 - 비교연산자) >,<,>=,<=,==,!=
// 논리 연산자) &&(And),||(Or),!(Not)

public class Operator01 
{
	public static void main(String args[])
	{
		 int n1 = 10, n2 = 7, result1;
		 double result2, result3;
		 result1 = n1 + n2;
		 System.out.println(n1 + " + " + n2 + " = " + result1);
		 result1 = n1 - n2;
		 System.out.println(n1 + " - " + n2 + " = " + result1);
		 result1 = n1 * n2;
		 System.out.println(n1 + " * " + n2 + " = " + result1);
		 result2 = n1 / (double)n2;
		 System.out.println(n1 + " / " + n2 + " = " + result2);
		 // 1.4285714285714286 * 100 -> 142.85714285714286
		 // (int)142.85714285714286 -> 142
		 // 142 / 100.0 -> 1.42
		 result3 = (int)(result2 * 100) / 100.0;
		 System.out.println(n1 + " / " + n2 + " = " + result3);
	}
}
