package days18;

import java.util.ArrayList;

// 컬렉션 클래스 저장 방식
// 모든 컬렉션 클래스들은 기본적으로 Object 타입을 저장/반환할 수 있습니다.

// Object 타입을 매개변수 사용하는 모든 컬렉션 클래스들은 타입에 상관없이 저장할 수 있음
// 하지만, 저장된 데이터를 반환받는 과정에서 런타임에러가 발생할 수 있습니다.
// Object -> 자식 클래스의 타입 : 강제형 변환

public class Collection02 
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		// 다양한 타입을 저장할 수 있는 컬렉션 클래스의 객체
		a.add(10);
		a.add(1.1);
		a.add("Hello");
		
		Integer i0 = (Integer)a.get(0);
		
		// 컬렉션 내부의 데이터를 추출하는 과정에서 일치하지 않는 타입으로 형변환이 일어나는 경우
		// 런타임 에러가 발생되어 프로그램이 강제 종료
		// Integer i1 = (Integer)a.get(1); // 에러
		Double i1 = (Double) a.get(1);
		// String i2 = a.get(2); // 에러
		String i2 = (String)a.get(2);
		
		System.out.printf("i0 -> %d\n", i0);
		System.out.printf("i0 -> %.1f\n", i1);
		System.out.printf("i0 -> %s\n", i2);
		
	}
}
