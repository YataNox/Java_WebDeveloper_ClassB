package days02;

public class Printf02
{
	public static void main(String[] args) 
	{
		// printf 안에서 %와 d, f, s 사이에 숫자 옵션을 넣어서 표시할 자리 수를 조절합니다.
		// 정수의 자리수 조절
		// %와 d 사이에 숫자를 안 쓴 경우 : 표시될 데이터의 자리수만큼 확보한 후 출력
		System.out.printf("정수%d정수\n", 123);
		// %와 d 사이에 숫자를 쓴 경우 : 쓴 숫자만큼 자리 확보 후 출력 데이터를 출력
		// 만약 자리가 모자르다면 자동 추가. 자리가 남는 다면 공백을 채워 출력합니다.
		System.out.printf("정수%3d정수\n", 12345);
		System.out.printf("정수%10d정수\n", 12345);
		// 출력될 자리 확보 후 왼쪽 정렬
		System.out.printf("정수%-10d정수\n", 12345);
		
		// 문자의 자리수 조절
		// 숫자를 안 쓴 경우 : 출력 데이터만큼 자리 확보
		System.out.printf("문자:%s꽃이 피었습니다.\n", "무궁화");
		// 숫자를 썼지만 자리가 모자른 경우 : 필요한 만큼 자동 추가 확보
		System.out.printf("문자:%2s꽃이 피었습니다.\n", "무궁화");
		// 숫자를 쓰고 자리가 남는 경우 : 공백으로 채움
		System.out.printf("문자:%10s꽃이 피었습니다.\n", "무궁화");
		// 왼쪽정렬
		System.out.printf("문자:%-10s꽃이 피었습니다.\n", "무궁화");
	}
}
