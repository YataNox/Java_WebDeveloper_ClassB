package days17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatter01 
{
	public static void main(String[] args)
	{
		// 날짜 데이터 클래스, Calendar와는 다름
		Date today = new Date(); // java.util.Date
		System.out.println(today);
		
		// 날짜 서식 클래스
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd");
		
		// 날짜 데이터를 서식 데이터에 맞춰서 적용 후 출력
		System.out.println(sdf1.format(today));
		
		// 날짜 서식 레퍼런스 변수들
		SimpleDateFormat sdf2, sdf3, sdf4, sdf5, sdf6, sdf7, sdf8, sdf9;
		
		// 서식 인스턴스 생성 및 저장
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		// today 적용 후 출력
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
	}
}
