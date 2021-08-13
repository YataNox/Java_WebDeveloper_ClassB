package days22;
// 수정 필요
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;

public class IO12 
{
	public static void main(String[] args)
	{
		File dir = new File("C:\\Users\\USER\\Desktop\\JAVA_Programing_workspace\\temp");
		if(!dir.exists())
			dir.mkdirs();
		File file_binary = new File(dir, "binary_data_using_buffer.dat");
		File file_text = new File(dir, "text_data_using_buffer.txt");
		
		//FileOutputStream fis_binary = new FileOutputStream(file_binary);
	/*	BufferedWriter bw_text = new BufferedWriter(file_text);
		
		// 버퍼의 내용을 출력
		// 버퍼에 출력된 데이터는 해당 스트림이 close 되거나 해당 스트림 객체에 대해서 flush 메소드가
		// 호출되면 실제 스트림을 통해서 출력됩니다.
		bos_binary.write(255);
		bos_binary.write(22);
		// flush 메소드는 버퍼에 쌍여 있는 데이터를 출력하는 메소드( 버퍼를 비우는 명령을 실행)
		bos_binary.flush();
		
		b2_text.write("Hello ");
		b2_text.write("World");
		bw_text.flush();
		
		bos_binary.close();
		bw_text.close();*/
	}
}
