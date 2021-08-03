package days13;

class Gugudan
{
	int dan;
	
	Gugudan()
	{
		dan = 0;
	}
	Gugudan(int dan)
	{
		this.dan = dan;
	}
	
	public void print()
	{
		if(this.dan == 0)
		{
			for(int i = 1; i <= 9; i++)
			{
				for(int j = 1; j <=9; j++)
					System.out.printf("%d x %d = %d\n", i, j , i*j);
				System.out.println();
			}
		}
		else
		{
				for(int i = 1; i <=9; i++)
					System.out.printf("%d x %d = %d\n", dan, i , dan*i);
				System.out.println();
		}
	}
	
}

public class Class12 
{
	public static void main(String[] args)
	{
		// int형 데이터 하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩 된 생성자를 
		// 갖는 클래스 제작
		// 멤버 필드로는 int dan; 하나 생성
		// 멤버 메소드 : dan 값이 0dlaus 1~9단의 구구단 모두 출력, 0이 아니면 해당 구구단만
		// 출력하는 메서드 제작
		// 디폴트 생성자는 dan 변수를 0으로 저장, 전달인수가 있는 생성자는 dan 변수를 전달인수
		// 값으로 저장
		// 메서드 이름 : print()
		// 클래스 이름 Gugudan
		
		Gugudan g1 = new Gugudan(8);
		Gugudan g2 = new Gugudan();
		g1.print();
		g2.print();
	}
}

/*
package days13;

class Gugudan
{
	int dan;
	
	Gugudan(){dan = 0;	}
	Gugudan(int dan){this.dan = dan;	}
	
	public void print()
	{
		if(this.dan == 0)
			for(int i = 1; i <= 9; i++)
				makedan(i);
		else
				makedan(dan);
	}
	
	void makedan(int dan)
	{
		for(int i = 1; i <=9; i++)
			System.out.printf("%d x %d = %d\n", dan, i , dan*i);
		System.out.println();
	}
	
}

public class Class12 
{
	public static void main(String[] args)
	{
		// int형 데이터 하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩 된 생성자를 
		// 갖는 클래스 제작
		// 멤버 필드로는 int dan; 하나 생성
		// 멤버 메소드 : dan 값이 0dlaus 1~9단의 구구단 모두 출력, 0이 아니면 해당 구구단만
		// 출력하는 메서드 제작
		// 디폴트 생성자는 dan 변수를 0으로 저장, 전달인수가 있는 생성자는 dan 변수를 전달인수
		// 값으로 저장
		// 메서드 이름 : print()
		// 클래스 이름 Gugudan
		
		Gugudan g1 = new Gugudan(8);
		Gugudan g2 = new Gugudan();
		g1.print();
		g2.print();
	}
	
}

*/
