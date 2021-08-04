package days15;

class Product
{
	int price;
	int bonusPoint;
	Product(int p)
	{
		this.price = p;
		this.bonusPoint = p / 10;
	}
}

class Computer extends Product
{
	Computer()
	{
		super(150);
	}
	public String toString() {return "Computer";}
}

class Tv extends Product
{
	Tv()
	{
		super(100);
	}
	public String toString() {return "Tv";}
}

class Audio extends Product
{
	Audio()
	{
		super(60);
	}
	public String toString() {return "Audio";}
}

public class Extends10_Object05 
{
	public static void main(String[] args)
	{
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
	}
}
