package days06;

import java.util.Scanner;

public class ControllOpQuestionMartk 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		// 점수가 70점 이상이면 합격, 아니면 불합격을 출력하세요
		
		String prnText;
		
		/*if(score >= 70)
			prnText = "합격";
		else
			prnText = "불합격";*/
		
		prnText = (score >= 70)? "합격" : "불합격"; 
		
		System.out.println("입력한 점수는 " + prnText + "입니다.");
		sc.close();
	}
}
