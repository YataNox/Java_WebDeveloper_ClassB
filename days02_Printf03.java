package days02;

public class Printf03
{
	public static void main(String[] args)
	{
		// JavaFourth.java에 출력했던 성적표를 정확한 총점과, 평균을 계산하여
		// 출력하세요.
		// 평균을 출력할 때 소수점은 한 자리만 출력하세요.
		// /t를 두 번 쓰는 곳이 없도록 자리수를 조절하세요
		// 각 항목은 모두 오른쪽 정렬되어 출력해주세요
		// (같은 과목의 점수가 89점과 100점이어도 1번 학생과 2번 학생의 점수를 소수점 같은 위치에
		// 맞춰지게 출력)
		System.out.println("\t\t  ###성적표###");
		System.out.println("--------------------------------------------------");
		System.out.printf("%3s\t%10s\t %3s\t %3s\t %3s\t %3s\t %3s\n", "번호", "성명", "국어", "영어", "수학", "총점", "평균");
		System.out.println("--------------------------------------------------");
		System.out.printf("%3d\t%10s\t %3d\t %3d\t %3d\t %3d\t %3.1f\n", 1, "홍길동", 85, 56, 78, 85+56+78, (85+56+78) / 3.0);
		System.out.printf("%3d\t%10s\t %3d\t %3d\t %3d\t %3d\t %3.1f\n", 2, "Gildong" ,84, 87, 85, 84+87+85, (84+87+85) / 3.0);
		System.out.printf("%3d\t%10s\t %3d\t %3d\t %3d\t %3d\t %3.1f\n", 3, "HongGil", 58, 87, 89, 58+87+89, (58+87+89) / 3.0);
		System.out.println("--------------------------------------------------");
	}
}
