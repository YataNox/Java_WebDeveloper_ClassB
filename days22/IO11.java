package days22;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IO11 
{
	public static void main(String[] args) throws IOException
	{
		// 이전 경로에서 파일을 읽어다가 콘솔창에 출력하세요
		File dir = new File("C:\\Users\\USER\\Desktop\\JAVA_Programing_workspace\\temp");
		if(!dir.exists())
			dir.mkdirs();
		File textp = new File(dir, "abc.txt");
		FileReader fr_text = new FileReader(textp);
		
		int n;
		n = fr_text.read();
		while((n = fr_text.read()) != -1)
			System.out.print((char)n);
	}
}
