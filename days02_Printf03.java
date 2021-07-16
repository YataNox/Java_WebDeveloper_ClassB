package days02;

public class Printf03
{
	public static void main(String[] args)
	{
		// JavaFourth.java에 출력했던 성적표를 정확한 총점과, 평균을 계산하여
		// 출력하세요.
		// 평균을 출력할 때 소수점은 한 자리만 출력하세요.
		// /t를 두 번 쓰는 곳이 없도록 자리수를 조절하세요
		System.out.println("\t\t  ###성적표###");
		System.out.println("--------------------------------------------------");
		System.out.printf("%s\t%-10s\t %-2s\t %-2s\t %-2s\t %-2s\t %-2s\n", "번호", "성명", "국어", "영어", "수학", "총점", "평균");
		System.out.println("--------------------------------------------------");
		System.out.printf("1\t%-10s\t %-2d\t %-2d\t %-2d\t %-2d\t %-2.1f\n", "홍길동", 85, 56, 78, 85+56+78, (85+56+78) / 3.0);
		System.out.printf("2\t%-10s\t %-2d\t %-2d\t %-2d\t %-2d\t %-2.1f\n", "Gildong" ,84, 87, 85, 84+87+85, (84+87+85) / 3.0);
		System.out.printf("3\t%-10s\t %-2d\t %-2d\t %-2d\t %-2d\t %-2.1f\n", "HongGil", 58, 87, 89, 58+87+89, (58+87+89) / 3.0);
		System.out.println("--------------------------------------------------");
	}
}
