package days18;

public class Exception04 
{
	public static void main(String[] args)
	{
		try
		{
			// 예외상황 고의 발생
			ArithmeticException e = new ArithmeticException("ArithmeticException 고의발생");
			throw e;
		}
		catch(ArithmeticException e)
		{
			System.out.printf("ArithmeticException - ");
			System.out.println("에러 메시지 : " + e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.printf("RuntimeException - ");
			System.out.println("에러 메시지 : " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.printf("Exception - ");
			System.out.println("에러 메시지 : " + e.getMessage());
		}
		
		try
		{
			// 예외상황 고의 발생
			RuntimeException e = new RuntimeException("RuntimeException 고의 발생");
			throw e;
		}
		catch(ArithmeticException e)
		{
			System.out.printf("ArithmeticException - ");
			System.out.println("에러 메시지 : " + e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.printf("RuntimeException - ");
			System.out.println("에러 메시지 : " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.printf("Exception - ");
			System.out.println("에러 메시지 : " + e.getMessage());
		}
	}
}
