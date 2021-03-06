package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO14 
{
	public static void main(String[] args) throws IOException
	{
		// 폴더 안의 이클립스 파일을
		// copy폴더로 복사
		// 이진 형식으로 읽어 바로 써넣는 방식
		
		File dir = new File("C:\\Users\\USER\\Desktop\\JAVA_Programing_workspace\\temp");
		File dir2 = new File("C:\\Users\\USER\\Desktop\\JAVA_Programing_workspace\\copy");
		if(!dir.exists())
			dir.mkdirs();
		if(!dir2.exists())
			dir2.mkdirs();
		/*
		File file_text = new File(dir, "abc.txt");
		File file_text2 = new File(dir2, "abc2.txt");
		
		FileInputStream bis = new FileInputStream(file_text);
		FileOutputStream bos = new FileOutputStream(file_text2);
		
		int n;
		while((n = bis.read()) != -1)
			bos.write((char)n);
		bos.flush();
		bis.close();
		bos.close();*/
		
		String Filename = "eclipse-inst-jre-win64.exe";
		String CopyPath = "C:\\Users\\USER\\Desktop\\JAVA_Programing_workspace\\copy";
		String originPath = "C:\\Users\\USER\\Desktop";
		
		File originDir = new File(originPath); // 경로 설정
		File fileOriginal = new File(originDir, Filename); // 파일 설정
		
		File copyDir = new File(CopyPath); // 경로 설정
		if(!copyDir.exists())
			copyDir.mkdirs();
		File fileCopy = new File(copyDir, Filename); // 파일 설정
		
		BufferedInputStream bis = new  BufferedInputStream(new FileInputStream(fileOriginal));
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileCopy));
		
		/*int data;
		while((data = bis.read()) != -1)
		{
			bos.write(data);
		}*/
		
		byte[] data = new byte[1024];
		int size;
		while((size = bis.read(data)) != -1)
			bos.write(data, 0, size);
		
		bis.close();
		bos.close();
	}
}
