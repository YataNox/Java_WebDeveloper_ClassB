package days23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Sender extends Thread
{
	DataOutputStream out; // 메세지 전송(송신)용 출력 스트림
	Sender(Socket s)
	{
		
	}
}

class Receiver extends Thread
{
	DataInputStream in; // 메시지 전송(수신)용 입력 스트림
	Receiver(Socket s)
	{
		
	}
}

public class TcpipServer03 
{
	public static void main(String[] args)
	{
		ServerSocket sS = null;
		Socket s = null;
		try 
		{
			sS = new ServerSocket(5555);
			System.out.println("서버가 준비되었습니다.");
			s = sS.accept();
			// 앞선 예제에서는 DataOutputStream에 s를 사용하여 출력
			// 또는 DataInputStream에 s를 활용하여  입력
			// 그러나 본 예제는 s를 Sender와 Receiver의 생성자에 전달 인수로 보내서
			// 현재 연결의 입력 출력을 자유롭게 가능하게 제작합니다.
			Sender send = new Sender(s);
			Receiver receiver = new Receiver(s);
			send.start();
			receiver.start();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
