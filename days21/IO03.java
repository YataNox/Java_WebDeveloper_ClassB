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
		System.out.println(size_1 + " " + size_2);
	}
}
