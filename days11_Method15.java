package days11;

public class Method15 
{
	public static void main(String[] args)
	{
		// cals메서드 생성(전달된 문자열에 따라 입력된 숫자들의 평균 또는 합계를 출력하세요
		cals("합계", 98, 78, 45, 12, 23, 87, 69, 59);
		System.out.println();
		cals("평균", 98, 78, 45, 12, 23, 32, 98, 63, 25, 87);
	}
	
	// 평균, 합계 계산 메서드
	public static void cals(String cal, int... num)
	{
		double value = 0;
		switch(cal)
		{
		 	case "합계" :
		 		for(int i = 0; i < num.length; i++)
		 			value += num[i];
		 		System.out.println("값들의 합계 : " + value); 
		 		break;
		 	case "평균" : 
		 		for(int i = 0; i < num.length; i++)
		 			value += num[i];
		 		System.out.println("값들의 평균 : " + (value / num.length));
		 		break;
		}
	}
}
