package days21;

import java.io.File;
import java.io.IOException;

public class IO07 
{
	public static void main(String[] args) throws IOException
	{
		// 파일 처리
		// File 클래스 : 파일 또는 디렉토리에 관련되 메타 정보를 제공하는 클래스
		// 파일을 생성, 디렉토리를 생성등의 추가적인 기능을 제공
		
		// D:\\JAVA01\\Java_se\\temp 폴더를 참조하는 File 객체 생성
		File d = new File("D:\\JAVA01\\Java_se\\temp");
		System.out.println("D:\\\\JAVA01\\\\Java_se\\\\temp");
		
		// exists() : 생성자에 입력한 경로가 실제로 있는지 검사 후 있으면 true 없으면 false리턴
		if(d.exists())
			System.out.println("temp 디렉토리 발견~!");
		else
		{
			System.out.println("temp 디렉토리가 없어서 새로 생성합니다.");
			d.mkdirs(); // 디렉토리를 생성하는 메소드
			// mkdir : 최종 타겟 이전의 경로가 존재해야만 동작
			// mkdirs : 최종 타겟 이전의 경로가 존재하지 않아도 전체 경로를 생성
		}
	}
}
