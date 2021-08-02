package days13;

class Std
{
	private int bun;
	private String name;
	private int [] scores;
	static int count = 0;
	
	Std()
	{
		scores = new int[3];
		count++;
		bun = count;
	}
	Std(String name)
	{
		this();
		this.name = name;
	}
	Std(String name, int kor, int eng, int mat)
	{
		this(name);
		this.scores[0] = kor;
		this.scores[1] = eng;
		this.scores[2] = mat;
	}
	Std(Std tmp)
	{
		this();
		this.name = tmp.name;
		for(int i = 0; i < scores.length; i++)
			this.scores[i] = tmp.scores[i];
	}
	// main에서 호출된 생성자 4개를 제작해주세요. count  변수를 이용, 번호를 입력하세요.
	// 디폴트 생성자에서는 scores 배열의 공간을 할당해주시고,
	// 그 외 생성자에 this()를 활용해주세요
	public void prn() 
	{
		System.out.println(this.bun + " : " + this.name + " : " + this.scores[0]
				 + " : " + this.scores[1] + " : " + this.scores[2]);
	}
}

public class Class19 
{
	public static void main(String[] args)
	{
		Std s1 = new Std();
		Std s2 = new Std("홍길동");
		Std s3 = new Std("홍길남", 98, 69, 87);
		Std s4 = new Std(s3);
		s1.prn(); s2.prn(); s3.prn(); s4.prn();
		
	}
}
