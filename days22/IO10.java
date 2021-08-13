package days22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IO10 
{
	public static void main(String[] args) throws IOException
	{
		File dir = new File("C:\\Users\\USER\\Desktop\\JAVA_Programing_workspace\\temp");
		if(!dir.exists())
			dir.mkdirs();
		File file_text = new File(dir, "abc.txt");
		FileWriter fos_text = new FileWriter(file_text);
		
		fos_text.write("선거에 있어서 최고 득표자가 2인 이상인때에는 국회의 재적의원 과반수가 출석한"
				+ "공개회의에서 다수표를 얻은 자를 당선자로 한다. 이 헌법시행 당시의 법령과 조약은 이 헌법에"
				+ "위배되지 않는 한 그 효력을 지속한다.");
		fos_text.close();
	}
}
