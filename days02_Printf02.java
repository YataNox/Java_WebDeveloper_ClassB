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
	}
}
