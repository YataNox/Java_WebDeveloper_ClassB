package days23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread
{
	DataOutputStream out; // 메세지 전송(송신)용 출력 스트림
	Socket socket;
	String name;
	
	Sender(Socket s) // main에서 연결하고 전달해준 통신 소켓을 생성자의 매개변수로 받습니다.
	{
		this.socket = s; // 전달받은 통신 소켓을 멤버변수에 저장해서 클래스 전역에서 사용할 수 있게합니다.
		try 
		{
			// OutputStream o = socket.getOutputStream();
			// out = new DataOutputStream(o);
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + " : " + socket.getPort() + "] : ";
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		while(out != null)
		{
			try 
			{
				String message = sc.nextLine();
				// out.writeUTF(name + message);
				out.writeUTF(name + message); // 화면에 입력한 내용을 만들어둔 말머리와 함께 전송
				System.out.println("[" + socket.getInetAddress() + " : " + socket.getPort() + "] : " + message);
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class Receiver extends Thread
{
	DataInputStream in; // 메시지 전송(수신)용 입력 스트림
	Socket socket;
	
	Receiver(Socket s)
	{
		this.socket = s;
		try 
		{
			in = new DataInputStream(socket.getInputStream());
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void run()
	{
		while(in != null)
		{
			try
			{
				System.out.println(in.readUTF());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
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
			// 현재 연결의 입력 출력을 양방향 자유롭게 가능하게 제작합니다.
			// 각 클래스는 Thread를 사옥 받아, 동시 실행이 가능하게 합니다.1
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
