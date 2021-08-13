package days22;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IO13 
{
	public static void main(String[] args) throws IOException
	{
		File dir = new File("C:\\Users\\USER\\Desktop\\JAVA_Programing_workspace\\temp");
		if(!dir.exists())
			dir.mkdirs();
		File file_binary = new File(dir, "binary_data_using_buffer.dat");
		File file_text = new File(dir, "text_data_using_buffer.txt");
		
		// 파일로부터 이진 데이터를 읽어올 수 있는 스트림 객체 생성
		BufferedInputStream bis_binary = new BufferedInputStream(new FileInputStream(file_binary));
		int input;
		while((input = bis_binary.read()) != -1)
			System.out.printf("%d ", input);
		//while((input = br_text.read()) != -1)
			//System.out.printf("");
		bis_binary.close();
	}
}
