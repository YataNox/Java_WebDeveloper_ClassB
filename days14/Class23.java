package days14;

class Complex
{
	private int real; // 실수부 자료 저장용 변수
	private int image; // 허수부 자료 저장용 변수
	
	Complex()
	{
		real = 10;
		image = 20;
	}
	
	Complex(int real, int image)
	{
		this.real = real;
		this.image = image;
	}
	
	public Complex plus(Complex c)
	{
		Complex ct = new Complex(this.real + c.real, this.image + c.image);
		return ct;
	}
	
	public Complex minus(Complex c)
	{
		Complex ct = new Complex(this.real - c.real, this.image - c.image);
		return ct;
	}
	
	public void prn()
	{
		System.out.println(real + " + " + image + "i");
	}
}

public class Class23 
{
	public static void main(String[] args)
	{
		Complex c1 = new Complex();
		c1.prn();
		Complex c2 = new Complex(8, 6);
		c2.prn();
		Complex c3;
		c3 = c1.plus(c2); // (5 + 3i) + (2 + 2i) - > (7 + 6i)
		c3.prn();
		Complex c4 = c1.minus(c2); // (5 + 3i) - (2 + 2i) - > (3 + 1i)
		c4.prn();
	}
}
