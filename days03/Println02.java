package days03;

public class Println02 
{
	public static void main(String[] args)
	{
		// Print03에서 만들었던 성적표를 Println 명령을 이용하여 출력해주세요.
		// 숫자들의 오른쪽정렬은 하지않아도 됩니다.
		// 소수점 조절도 하지 않아도 됩니다.
		System.out.println("\t\t  ###성적표###");
		System.out.println("--------------------------------------------------");
		System.out.println("번호\t성명\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("--------------------------------------------------");
		System.out.println("1\t홍길동\t\t 85\t 56\t 78\t" + (85+56+78) + "\t" + (85+56+78) / 3.0);
		System.out.println("2\tGildong\t 84\t 87\t 85\t" + (84+87+85) + "\t" + (84+87+85) / 3.0);
		System.out.println("3\tHongGil\t 58\t 87\t 89\t" + (58+87+89) + "\t" + (58+87+89) / 3.0);
		System.out.println("--------------------------------------------------");
	}
}
