package days09;

import java.util.Random;
import java.util.Scanner;

public class Array12 
{
	public static void main(String[] args)
	{
		// baseball game
		// 상대가 나에게 알려주지 않은 숫자를 질문과 답변을 총해 맞춰가는 게임
		// 나에게 알려주지 않은 숫자 : 6 5 7 같은 한 자리 숫자 세개
		// 질문 : 3 6 7 같은 한 자리 숫자 세개
		// 답변 : 같은 숫자가 자리수까지 같으면 S 숫자만 같으면 B
		// 숫자 하나는 0~9 까지 세개의 숫자 중 중복 숫자 없음
		// 1. 컴퓨터가 기억 할 숫자를 저장할 배열, 사용자가 입력한 숫자를 저장할 배열 생성
		// 2. 컴퓨터가 나에게 알려주지 않은 숫자 세 개를 결정 -> 생성한 배열에 저장
		// 3. 컴퓨터에게 사용자가 맞추고자 하는 숫자를 입력
		// 4. 입력 받은 숫자와 저장한 컴퓨터 숫자를 비교하여 스트라이크와 볼을 카운트
		// 5. 스트라이크와 볼을 출력
		// 6. 3~5를 컴퓨터 숫자와 동일한 숫자를 입력할 때까지 반복
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 변수 생성
		int[] rNum = new int[3];
		int[] uNum = new int[3];
		int ball =0, strike = 0;
		
		// 3개의 랜덤 값 생성
		for(int i = 0; i < rNum.length; i++)
		{
			rNum[i] = rd.nextInt();
				
			if(rNum[i] < 0)
				rNum[i] *= -1;
						
			rNum[i] = rNum[i] % 10; // rNum[i] = (rd.nextInt() * 10);
			
			// 중복 검사
			int j;
			for(j = 0; j < i; j++)
				if(rNum[j] == rNum[i]) // 중복이 나왔을 때
					break;
			if(i == j) // 그 중복이 현재 작성한 마지막 숫자일 경우 그냥 계속 진행
				continue;
			else if (i != j) // 아닐 경우 이전 숫자 재생성
				i--;
		}
		
		// 게임 시작
		while(true)
		{
			// 사용자 숫자 3개 입력
			System.out.printf("숫자를 입력하세요 : ");
			for(int i = 0; i < rNum.length; i++)
				uNum[i] = sc.nextInt();
			
			/*
			 String num = sc.nextLint();
			 for(int i = 0; i < uNum.length; i++)
			 	uNum[i] = num.charAt(i) - '0'; // '4' - '0' = 4;
			 */
			
			// S와 B 검사
			for(int i = 0; i < rNum.length; i++)
				for(int j = 0; j < uNum.length; j++)
					if(uNum[j] == rNum[i]) // 같은 숫자가 있을 때
						if(i == j) // 자리 위치도 같으면 S
							strike++;
						else // 위치가 다르면 B
							ball++;
			
			// B,S의 총 개수 출력
			System.out.printf("B : %d, S : %d\n", ball, strike);
			
			// 숫자 3개를 모두 맞췄을 경우 게임 종료
			if(strike == 3)
			{
				System.out.println("정답입니다.");
				for(int i = 0; i < rNum.length; i++)
					System.out.printf("%d ", rNum[i]);
				
				break;
			}
			
			// 못 맞췄을 시 다음을 위해 B와 S값 초기화
			ball = 0;
			strike = 0;
		}
		sc.close();
	}
}
