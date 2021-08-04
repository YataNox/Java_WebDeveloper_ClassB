package days15;

class SuperF
{
	int superNum;
}

class SubF extends SuperF
{
	int subNum;
}

public class Extends09_TypeCasting02 
{
	public static void main(String[] args)
	{
		// 부모 클래스의 객체 생성
		SuperF super1 = new SuperF();
		// 자식 클래스의 객체 생성
		SubF sub1 = new SubF();
		
		// 1. 자식 클래스의 레퍼런스 변수의 값은 부모 클래스의 레퍼런스 변수에 저장이 가능합니다.
		super1 = sub1;
		super1 = new SubF();
		// 부모 <- 자식 O
		
		// 2. 부모 클래스의 레퍼런스 변수 값을 자식 클래스의 레퍼런스 변수에 저장할 수는 없습니다.
		super1 = new SuperF();
		// sub1 = super1; // 에러
		// sub1 = new SuperF(); // 에러
		// 자식 <- 부모 X
		
		// 3. 1번에서 자식 인스턴스를 저장하고 있는 부모 레퍼런스는 
		//		부모가 상속해준 멤버 변수에만 접근이 가능합니다.
		// ex1)
		SuperF super2 = new SubF();
		super2.superNum = 100; // O
		// super2.subNum = 100; // X
		
		// ex2)
		SubF sub2 = new SubF();
		super2 = sub2;
		super2.superNum = 200; // O
		//super2.subNum = 300; // X
		
		// 4. 만약 부모 클래스의 인스턴스 주소를 자식 클래스의 레퍼런스 변수에 저장하려면
		// 강제 캐스팅을 이용하여 저장은 할 수 있습니다.
		SuperF super3 = new SuperF();
		SubF sub3 = (SubF)super3;
		// 현재는 에러가 없는 걸로 나타나지만, 실행 시에 런타임 에러가 발생합니다.
		
		// 실제 Heap 저장된 인스턴스의 타입이 자식 클래스가 아니면 프로그램 실행 중
		// 런타임 에러가 발생되어 프로그래밍 종료 됩니다.
		
		// 따라서 부모 레퍼런스 값을 자식 레퍼런스에 넣을 수 있는 경우를 선별해야 하는데
		// 현재의 부모 레퍼런스 변수가 저장한 주소에 자식 인스턴스가 저장된 경우로 제한합니다.
		SuperF super4 = new SubF();
		SubF sub4 = (SubF)super4;
		// 자식 레퍼런스 <- (타입 캐스팅) 부모 레퍼런스 <- 자식 인스턴스의 주소
	}
}
