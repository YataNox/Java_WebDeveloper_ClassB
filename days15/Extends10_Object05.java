package days15;

import java.util.Vector;

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

class Buyer
{
	private int money = 1000;
	private int bonusPoint = 0;
	
	Vector item = new Vector();
	// 벡터란 배열의 확장형 리스트 구조. - 객체들을 저장할 수 있는 배열이라고
	// 이해해도 무방함
	// 사용자가 만든 클래스의 객체(메모리를 할당 받은 레퍼런스 값) 등이 저장되는
	// 다형성 객체 저장 리스트입니다.
	public void buy(Product p)
	{
		if(p instanceof Computer || p instanceof Tv || p instanceof Audio)
		{
			// 제품을 살 정도로 잔액이 충분한가 검사
			if(this.money < p.price)
			{
				System.out.println("잔액이 부족합니다.");
				return;
			}
			else
			{
				// 제품 가격 만큼 money 차감
				// 제품의 bonusPoint를 this.bonusPoint에 가산
				this.money -= p.price;
				this.bonusPoint += p.bonusPoint;
				// 제품 객체를 item리스트 객체에 추가
				System.out.println(p + "을(를) 구입하셨습니다.");
				item.add(p.toString());
				// 자식 인스턴스를 저장하고 잇는 부모 레퍼런스가 상속되고 오버라이딩 된
				// 메서드를 실행하면 자식에게 오버라이딩된 메서드가 우선 실행됩니다.
				// Vector 클래스의 멤버 메서드 public void add(Object obj){}
			}
		}
	}
	
	public void summury()
	{
		int sum = 0; // 지출 총액 변수
		String itemList = ""; // 구매 목록을 저장할 변수
		if(item.isEmpty())
		{
			// item.isEmpty() : Vector 객체인 item이 비어 있으면 true 리턴
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
	}
	
	public void prn()
	{
		System.out.println(this.item.toString());
		System.out.println(this.money);
		System.out.println(this.bonusPoint);
	}
}

public class Extends10_Object05 
{
	public static void main(String[] args)
	{
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		Buyer b1 = new Buyer();
		b1.buy(t1);
		b1.buy(new Computer());
		b1.buy(c);
		b1.buy(a);
		b1.prn();
	}
}
