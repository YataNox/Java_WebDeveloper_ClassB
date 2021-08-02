package days13;

//멤버 메소드의 오버로딩
class Sum
{
	private int a;
	private int b;
	
	Sum(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int add(){return a + b;}
	public int add(int n) {return a+b+n;}
	public int add(int n, int m) {return a+b+n+m;}
	public int add(int n, int m, int l) {return a+b+n+m+l;}
}

public class Class13 
{
	public static void main(String[] args)
	{
		Sum s = new Sum(25, 36);
		System.out.println("s.add()의 결과 : " + s.add());
		System.out.println("s.add()의 결과 : " + s.add(23));
		System.out.println("s.add()의 결과 : " + s.add(59, 65));
		System.out.println("s.add()의 결과 : " + s.add(59, 65, 85));
	}
}
