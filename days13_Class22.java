package days13;

// 인스턴스 메서드에서는 인스턴스 변수를 사용할 수 있습니다.
// 인스턴스 메서드는 스태틱 변수를 사용할 수 있습니다.
// 스태틱 메서드는 인스턴스 변수 사용할 수 있습니다.
// 스태틱 메서드는 스태틱 변수르 사용할 수 있습니다.

class MemberCall
{
	// 인스턴스 변수 : 객체가 생성될 때 iv 변수가 생성 -> 10으로 초기화
	int iv = 10; 
	// 스태틱 변수 : 프로그램이 시작할 때 sc가 생성 -> 20으로 초기화
	static int sv = 20;
	// 인스턴스 변수 : 객첵 생성될 때 iv2가 생성 -> 이미 만들어져서 20을 저장하고 잇는
	// cv 값으로 초기화 -> 가능
	int iv2 = sv;
	static int sv2 = iv; // 에러 : iv가 언제 생성될지 모르므로, sv2에 값을 전달할 수 없다.
}

public class Class22 
{
	public static void main(String[] args)
	{
		
	}
}
