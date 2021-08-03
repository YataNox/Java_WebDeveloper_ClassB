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
		
		// 간단한 연산을 컴퓨터에게 시키고 그 결과를 포함한 내용을 출력할 수 있습니다.
		System.out.printf("56 x 69 = %d\n", 56*69);
		
		// % 이스케이스 문자는 갯수에 상관없이 필요한 만큼 구성하여 사용이 가능합니다.
		System.out.printf("%d x %d = %d\n", 23, 87, 23*87);
		// " " 안의 % 갯수과 순서대로 출력될 데이터를 나열하면 순서대로 매칭 출력됩니다.
		
		//소수점이 있는 실수의 출력
		System.out.printf("%d ÷ %d = %f\n", 26, 13, 27/13.0);
		// ÷ : 출력되기 위한 연산 기호, 실제 연산과는 무관
		// / : 실제 연산을 위한 연산기호,
		// 덧셈 : +, 뺄셈 : -, 곱셈 : *, 나눗셈 : /
		
		// %f는 별도의 표시가 없다면 최대 소수점 아래 여섯자리까지 표시합니다.
		// 소수점을 조절하여 출력하려면 아래와 같이 씁니다.
		System.out.printf("%d ÷ %d = %.2f\n", 26, 13, 27/13.0);
		// 소수점 조절에 의해 자리수가 조절되고, 없어지는 곳은 반올림 됩니다.
	}
}