package days02;

public class Printf01 
{
	public static void main(String args[]) 
	{
		// 출력하고자 하는 내용을 "" 안에 자유롭게 구성하여 출력할 수 있습니다.
		// 숫자와 문자가 조합된 출력물을 화면에 출력합니다.
		// 키보드가 허락하는 한 어떤 내용이든 구성하여 출력할 수 있습니다.
		System.out.printf("56 x 69 = 1234\n");
		// 이스케이스 문자 - % : 아직 출력의 내용으로 결정되지 않은 데이터의
		// 출력 자리를 마련해 둡니다.
		// %d : 정수, %f : 실수, %s : 문자열 등
		// 그리고 그 자리에 출력될 내용은 "" 가 끝난 후 뒤에 컴마(,)로 구분하고 써줍니다.
		System.out.printf("56 x 69 = %d\n", 1234);
	}
}
