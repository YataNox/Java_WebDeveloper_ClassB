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
		
		// 자식 클래스의 레퍼런스 변수의 값은 부모 클래스의 레퍼런스 변수에 저장이 가능합니다.
		super1 = sub1;
		super1 = new SubF();
		// 부모 <- 자식 O
		
		// 부모 클래스의 레퍼런스 변수 값을 자식 클래스의 레퍼런스 변수에 저장할 수는 없습니다.
		super1 = new SuperF();
		// sub1 = super1; // 에러
		// sub1 = new SuperF(); // 에러
		// 자식 <- 부모 X
	}
}
