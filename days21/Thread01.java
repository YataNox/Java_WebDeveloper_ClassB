package days21;

// Thead : 프로그램의 명령을 실행하게끔 해주는 실행 주체
// 개발자가 별도의 Thread를 생성하지 않는다면,
// 한 프로그램에 하나의 Thread가 존재하여 해당 명령을 차례 차례 순서대로 실행 시킴

class ThreadA1
{
	public void run() 
	{
		for(int i = 0; i <= 10; i++)
			System.out.printf("ThreadA1 : i -> %d\n ", i);
	}
}

class ThreadA2
{
	public void run()
	{
		for(int i = 0; i <= 10; i++)
			System.out.printf("ThreadA2 : i -> %d\n ", i);
	}
}

public class Thread01 
{
	public static void main(String[] args)
	{
		ThreadA1 t1 = new ThreadA1();
		ThreadA2 t2 = new ThreadA2();
		t1.run();
		t2.run();
		for(int i = 0; i <= 10; i++)
			System.out.printf("Main : i -> %d\n ", i);
	}
}
