package days17;

import java.text.DecimalFormat;

public class Formatter03 
{
	public static void main(String[] args)
	{
		
		DecimalFormat df = new DecimalFormat("0000");
		double number = 123.123456;
		
		System.out.printf("%19s : %f -> %s\n", "0000", number, df.format(number));
		
		// 양식문자 0 : 표시할 숫자들의 자리 표현. 0 : 숫자 한 자리 00 : 숫자 두 자리 등
		// 표시할 숫자는 많은 데 0의 갯수가 모자르면 필요한 만큼 0의 갯수를 자동 추가 적용
		// 숫자 12345, 양식  "000" -> 표시 12345
		// 숫자 자리수보다 0의 갯수가 많은 만큼 0으로 채워서 표시
		// 숫자 123, 양식"00000" -> 표시 00123
		// 소수점 아래에 대해서는 반대로 0의 갯수만큼만 소수점 아래 자리수를 표시.
		// 0 갯수로 인해 표시되지 못하는 소수점 자리 중 가장 윗 자리에서 반올림
		// 남는 자리에 강제로 0으로 채우는 방식은 동일 0.1234(0.00) -> 0.12 0.1(0.00) -> 0.10
		
		number = 123456.71289;
		df = new DecimalFormat("0.000");
		System.out.printf("%19s : %f -> %s\n", "0.000", number, df.format(number));
		
		number = 123456789.0;
		df = new DecimalFormat("0,000"); // 천단위 구분 기호 표시 패턴
		System.out.printf("%19s : %f -> %s\n", "0,000", number, df.format(number));
		
		number = 89.0;
		df = new DecimalFormat("0,000"); // 천단위 구분 기호 표시 패턴
		System.out.printf("%19s : %f -> %s\n", "0,000", number, df.format(number));
		
		df = new DecimalFormat("#,###"); // 무효의 0을 표시하지 않는 #을 0대신 사용
		df = new DecimalFormat("#,###"); 
		System.out.printf("%19s : %f -> %s\n", "#,###", number, df.format(number));
		// 십의 자리든 100의 자리든 표시할 숫자가 있을 때만 표시 - 강제 0표시 안함
		// 표시할 숫자가 1000을 넘어갈때만 (,)를 표시
		
		number = 123456.0;
		System.out.printf("%19s : %f -> %s\n", "#,###", number, df.format(number));
		
		// #을 이용한 소수점 표시 : #의 갯수보다 표시할 숫자가 많으면 # 갯수만큼 표시
		// #의 갯수보다 표시할 숫자가 적으로 숫자있는 만큼만 표시
		number = 123456.7128;
		df = new DecimalFormat("#,###.###");
		System.out.printf("%19s : %f -> %s\n", "#,###.###", number, df.format(number));
		number = 123456.7;
		System.out.printf("%19s : %f -> %s\n", "#,###.###", number, df.format(number));
		
		number = 1234;
		df = new DecimalFormat("￦#,###원"); // 단위 또는 기호 첨가
		System.out.printf("%19s : %f -> %s\n", "￦#,###원", number, df.format(number));
		
	}
}
