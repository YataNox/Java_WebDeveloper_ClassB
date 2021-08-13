package days22;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IO21 
{
	public static void main(String[] args) throws IOException
	{
		// 특정 날짜를 입력 받아서 그 날짜 파일만 출력하세요
		// 날짜 입력 양식을 청해서 잘못된 입력은 다시 입력 받게 설정해주세요
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String inputDate;
		
		System.out.print("출력할 날짜를 입력하세요.(2020-01-01) : ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			try
			{
				inputDate = in.readLine();
				Date d = sdf1.parse(inputDate);
				break;
			}
			catch(ParseException e)
			{
				System.out.println("잘못 입력했어요. 2020-01-01 형식으로 입력하세요.");
			}
		}
		
		// 읽어올 파일 경로 설정
		File dir = new File("D:\\JAVA02\\Java_se\\temp");
		if(!dir.exists())
			dir.mkdirs();
		
		// 폴더에서 모든 파일 목록 불러옴
		String[] f = dir.list();
		//for(String fn : f)
		//	System.out.println(fn);
		
		// 파일 명들을 이용한 반복 실행문을 실행하여 입력한 파일만 대상으로 내용을 읽은 후 화면 출력
		for(int i = 0; i < f.length; i++)
		{
			
		}
	}
}
