package days21;

import java.io.IOException;

public class IO03 
{
	public static void main(String[] args) throws IOException
	{
		// System.in 객체를 사용하여 더하기 연산을 수행하는 프로그램을 작성하세요.
		// 첫 번째 정수 : 123, 두 번째 정수 : 25 결과 : 123 + 25 = 148
		
		byte [] firstNumber = new byte[10];
		byte [] secondNumber = new byte[10];
		
		System.out.print("첫 번째 정수 : ");
		int size_1 = System.in.read(firstNumber);
		System.out.print("두 번째 정수 : ");
		int size_2 = System.in.read(secondNumber);
		
		// 입력한 글자들외에 데이터의 끝을 표시하는 글자와 입력한 엔터까지 저장되어서 \0\n
		// 배열에 저장된 데이터 갯수 + 2개의 size가 출력됩니다.
		/*System.out.println(size_1);
		for(int i = 0; i < firstNumber.length; i++)
			System.out.printf("%c", (char)firstNumber[i]);
		System.out.println();
		System.out.println(size_2);
		for(int i = 0; i < secondNumber.length; i++)
			System.out.printf("%c", (char)secondNumber[i]);*/
		
		// 165 입력했을 경우 firstNumber[0] = '1' firstNumber[1] = '6' firstNumber[2] = '5'
		// ('5' - '0')*1 + ('6' - '6')*10 + ('1' -'1') * 100
		int i, m, n1 = 0, n2 = 0; // i : 배열의 인덱스 m : 각 자리에 곱셈이 될 10의 지승
		
		// i는 1의 자리 숫자가 있는 첨자부터 0번째(가장 큰 자리 수 숫자가 있는 곳)까지 반복
		// 1234 입력시 size가 6이고, i변수는 size-3번째 (6-3부터) 0까지 반복합니다.
		// 그 처음이 '4' 해당하는 글자 1의 자리 글자입니다.
		// 그렇게 지목된 1의 자리 글자부터 '0'글자를 뺄셈해서 아스키 코드값의 차로 해당 숫자를 얻고
		// 각 반복마다 10이 계속 곱해지는(1, 10, 100, 1000)m 값을 곱해서 각 자리수를 만듭니다.
		// 또한 그것을 n1 변수에 누적합니다.
		
		for(i = size_1 - 3, m = 1; i >= 0; i--, m*=10)
		{
			n1 += ((firstNumber[i] - '0') * m);
			//System.out.println(n1);
			System.out.printf("firstNumber[%d]-%d \t", i, firstNumber[i]-'0');
			System.out.printf("%d x %d => %d\t", firstNumber[i]-'0',m,(firstNumber[i]-'0')*m);
			System.out.println(n1);
		}
		for(i = size_2 - 3, m = 1; i >= 0; i--, m*=10)
		{
			n2 += ((secondNumber[i] - '0') * m);
			// System.out.println(n2);
			System.out.printf("secondNumber[%d]-%d \t", i, secondNumber[i]-'0');
			System.out.printf("%d x %d => %d \t", secondNumber[i]-'0',m,(secondNumber[i]-'0')*m);
			System.out.println(n2);
		}
		System.out.println(n1+n2);
	}
}
