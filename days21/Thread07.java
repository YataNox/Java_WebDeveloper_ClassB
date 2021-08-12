package days21;

class ThreadC2 extends Thread
{
	private boolean state = true;
	public void setState(boolean s)
	{
		this.state = s;
	}
	public void run()
	{
		for(int i = 10; i > 0 && this.state == true ; i--)
		{
			System.out.println(i);
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
// 스레드를 계속할 지 아니면 멈출지를 결정할 boolean 변수가 멤버변수로 추가 됩니다.
// 스레드를 계속하려면 true 멈추려면 false로 값을 대입하는 setState 메소드도 추가됩니다.
// run 메소드는 실행 중간 중간 또는 반복 실행의 조건에서 state 변수가 true인지 검사합니다.
// false이면 멈추고,  true이면 계속합니다.

public class Thread07 
{
	public static void main(String[] args)
	{
		
	}
}
