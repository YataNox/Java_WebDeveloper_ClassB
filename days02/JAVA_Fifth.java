package days02;

public class JAVA_Fifth 
{
	public static void main(String[] args) 
	{
		/*
		 	\b : 백스페이스 - 커버 왼쪽으로 이동하면서 앞 글자를 한 글자씩 삭제
		 						- 다만 이클립스 콘솔창에서는 정상 작동하지 않습니다.
		 	\' : 작은 따옴표 출력
		 	\" : 큰 따옴표 출력
		 	%% : % 출력
		 	\\ : 백슬래쉬 출력
		*/
		System.out.printf("겁나 쉬운 \"자바 프로그래밍~!\"\n");
		// 큰 따옴표를 화면에 직접 출력하려면 \" 라고 서야 큰 따옴표만 출력됩니다.
		// \ 없이 " 만 사용한다면 끝나는 따옴표로 인식되어 오류를 발생시킵니다.
		System.out.println("대통령은 조약을 \"체결-비준\"하고,");
		System.out.println("외교 사절을 \"신임-접수\" 또는 \"파견\"하며,");
		System.out.println("\'선전포고\'와 \'강화\'를 한다.\n");
		System.out.println("대통령의 임기가 만료되는 때에는");
		System.out.println("임기만료 70% 내지 40% 전에 후임자를 선거한다.");
	}
}
 
