package days16;

import java.util.Calendar;

public class Calendar01 
{
	public static void main(String[] args)
	{
		Calendar today = Calendar.getInstance();
		// 싱글톤 방식의 클래스
		// 생성자가 private로 접근 차단됨(외부에서 접근 금지. ->
		// 외부에서 new Calendar() 사용 안됨)
		// 유일하게 실행된 new Calendar()는 클래스 내부에서 실행되어
		// 클래스 내부에 단 하나만 존재하게끔 생성된 레퍼런스 변수에 주소를 저장합니다.
		// 그리고 그 레퍼런스 변수가 갖고 잇는 주소를 리턴하는 public static 형태의
		// getInstance 메소드로 인스턴스의 주소를 리턴 받아씁니다.
		// 이 후 다시 getInstance() 메소드가 실행되도 현재 HEAP에 이미 있느 ㄴ
		// 인스턴스의 주소가 리턴됩니다.
	}
}
