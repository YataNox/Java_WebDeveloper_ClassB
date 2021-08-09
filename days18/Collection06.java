package days18;

import java.util.HashSet;
import java.util.Iterator;

public class Collection06 
{
	public static void main(String[] args)
	{
		// 로또 번호를 저장하기 위해서 HashSet 클래스를 활용하는 예제
		// (중복을 허용하지 않는 특징을 활용)
		HashSet<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6)
		{
			// int temp = (int)(Math.random() *45 + 1);
			// lotto.add(temp);
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		// HashSet 타입의 객체 내부를 순회하는 방법
		// 1. Iterator 객체를 사용하는 방법
		// - Iterator 객체는 컬렉션 내부의 데이터를 순회할 수 있는 객체
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext())
			System.out.printf("%d		", iter.next());
	} 
}
