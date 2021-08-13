package days22;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IO20 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		// 2021_08_13_18_28.dat
		//파일 경로 설정 및 부재시 생성
		File dir = new File("D:\\JAVA02\\Java_se\\temp");
		if(!dir.exists())
			dir.mkdirs();
		
		// 파일 설정
		File file = new File(dir, "2021_08_13_18_28.dat");
	
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		ArrayList<CalculatorResult> list = (ArrayList<CalculatorResult>)ois.readObject();
		
		// 파일 데이터 출력
		for(int i = 0; i < list.size(); i++)
		{
			System.out.printf("%d. %s\n", i+1, list.get(i));
		}
		ois.close();
	}
}
