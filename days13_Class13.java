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
	/*public int add(int n) {return a+b+n;}
	public int add(int n, int m) {return a+b+n+m;}
	public int add(int n, int m, int l) {return a+b+n+m+l;}*/
	public int add(int...n)
	{
		int tot = 0;
		System.out.println("매개변수 4");
		for(int i = 0; i < n.length; i++)
			tot += n[i];
		return a+b+tot;
	}
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
		System.out.println("s.add()의 결과 : " + s.add(59, 65, 85, 78, 36));
	}
}
