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
		// 구입 물품 검사
		if(p instanceof Computer || p instanceof Tv || p instanceof Audio)
		{
			// 제품을 살 정도로 잔액이 충분한가 검사
			if(this.money < p.price)
			{
				System.out.println("잔액이 부족합니다.");
				System.out.println();
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
				item.add(p);
				// 자식 인스턴스를 저장하고 잇는 부모 레퍼런스가 상속되고 오버라이딩 된
				// 메서드를 실행하면 자식에게 오버라이딩된 메서드가 우선 실행됩니다.
				// Vector 클래스의 멤버 메서드 public void add(Object obj){}
			}
		}
	}
	
	// 지출 총액 및 구입 목록 표시
	public void summury()
	{
		int sum = 0; // 지출 총액 변수
		String itemList = ""; // 구매 목록을 저장할 변수
		if(item.isEmpty())
		{
			// item.isEmpty() : Vector 객체인 item이 비어 있으면 true 리턴
			System.out.println("구입하신 제품이 없습니다.");
			System.out.println();
			return;
		}
		
		for(int i = 0; i < item.size(); i++)
		{
			// item.size() : 저장된 요소의 갯수 리턴
			Product p1 = (Product)item.get(i);
			sum += p1.price; // 구입 금액 합산
			itemList = itemList + " " + p1;
			// itemList = itemList + " " p1.toString();
		}
		System.out.println("지출 총액 : " + sum + ", 구매 목록 : " + itemList /*item.toString()*/);
		System.out.println();
	}
	
	// 물품 환불 메소드
	public void refund(Product p)
	{
		// item.remove(p) : item에서 p를 삭제 - remove하려는 p가
		// 존재하여 잘 지워졌다면 true 리턴
		if(item.remove(p))
		{
			// buyer 잔액에 상품 가격 합산
			// 보너스 포인트 차감
			// 환불 상품 안내 "~~을(를) 반품하셨습니다."
			this.money += p.price;
			this.bonusPoint -= p.bonusPoint;
			System.out.println(p + "을(를) 반품하셨습니다.");
		}
		else
		{
			System.out.println("구입하신 물품 중에 해당 제품이 없습니다.");
			System.out.println();
		}
	}
	
	// 현재 구입 목록, 현재 잔액, 보유 보너스 확인
	public void prn()
	{
		System.out.println("구입 목록 : " + this.item.toString());
		System.out.println("현재 보유 금액 : " + this.money);
		System.out.println("현재 보유 보너스 : " + this.bonusPoint);
		System.out.println();
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
		b1.buy(t2);
		b1.buy(new Computer());
		b1.buy(c);
		b1.buy(a);
		b1.prn();
		b1.summury();
		b1.refund(c);
		b1.summury();
	}
}
