package days13;

// this의 용도1
// : 멤버메서드내에 존재하면서, 메소드를 호출하는 호출 객체의 레퍼런스 값을 저장하는
// 숨어있는 레퍼런스 변수

// this의 용도2
// : 오버로딩된 형제 생성자를 재호출하기 위한 호출 이름. 반드시 호출하는 형태(매개변수형태)
// 생성자가 오버로딩 되어 있어야 함.

class ThisB
{
	private int num1;
	private int num2;
	private int num3;
	
	ThisB(int n)
	{
		this.num1 = n;
		System.out.println("ThisB클래스의 생성자1이 호출되었습니다.");
	}
	
	ThisB(int n1, int n2)
	{
		// this.num1 = n1;
		this(n1); // this라는 이름으로 자신의 형제 생성자를 호출합니다.
		this.num2 = n2;
		System.out.println("ThisB클래스의 생성자2가 호출되었습니다.");
	}
}

public class Class15 
{
	public static void main(String[] args)
	{
		ThisB b1 = new ThisB(10);
		ThisB b2 = new ThisB(10, 20);
	}
}
