package days02;

public class Println01 
{
	public static void main(String args[])
	{
		// println()은 printf("\n")와 같은 동작을 합니다.
		// println은 \n이 없어도 모든 출력 후 자동으로 줄바꿈을 한 번 실행해줍니다.
		// System.out.println(\n"); <- 두 줄바꿈
		// printf 와 같이 format 양식 글자를 사용하지 못합니다. 
		// 다만 prinft보다 출력이 간단합니다.
		System.out.println(10); // 10 출력
		System.out.println(12.123); // 12.123출력
		System.out.println("Java Programming"); // 문자 출력
	}
}
