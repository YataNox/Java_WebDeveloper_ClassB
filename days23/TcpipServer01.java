package days23;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipServer01 
{
	public static void main(String[] args)
	{
		String serverIp = "192.168.0.92";
		
		try 
		{
			// Socket : 클라이언트가 연결을 요청하면 그를 수락해줄 역할의 하드웨어 또는 소프트웨어
			// serverIp : 현재 서버의 클라이언트가 요청할 연결의 목적지 주소
			// 7777 : 서버에서 관리할 연결의 그룹 번호
			//소켓이 생성되면, sc.nestInt()가 입력을 무한히 기다리듯, 연결 요청을 무한히 기다립니다.
			Socket s = new Socket(serverIp, 7777);
			
			// 연결이 성공하면 아래 문장을 실행. 실패하면 catch 구문 실행
			InputStream in = s.getInputStream(); // 소켓에서 입력/출력 스트림을 전달받아 입출력도구로 사용
			// InputStream의 단순 아스키코드 입출력을 생성자에 넣은
			// 서버 클라이언트 통신에 사용가능한 스트림을 생성합니다.
			DataInputStream dis = new DataInputStream(in);
			// 연결을 요청한 클라이언트로부터 전달된 메시지를 저장합니다.
			String m = dis.readUTF();
			// 소켓으로부터 받은 데이터를 출력한다.
			System.out.println("받은 메시지 : " + m);
			System.out.println("연결을 종료합니다.");
			// 스트림과 소켓을 닫습니다.
			dis.close();
			s.close();
			System.out.println("연결이 종료되었습니다.");
		} catch (UnknownHostException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
