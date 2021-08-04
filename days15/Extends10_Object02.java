package days15;

// toString 메소드의 사용
// toString 메소드는 클래스의 객체 정보를 문자열로 반환 :
// 객체의 클래스명 + '@' + 해시코드 값(16진수)
// 사용자 정의 클래스(직접 개발한 클래스)에 toString 메소드를 오버라이딩하여
// 클래스의 정보를 문자열로 제공하도록 변형할 수 있습니다.
class UserClass_B // toString 메소드를 오버라이딩 하지 않은 클래스
{
	
}

class Point // toString 메소드를 오버라이딩한 클래스
{
	private int x;
	private int y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	
	public String toString()
	{
		return "x = " + this.x + ", y = " + this.y; // "x = 값, y = 값" 리턴	
	}
}

public class Extends10_Object02 
{
	public static void main(String[] args)
	{
		
	}
}
