package days18;

import java.util.HashSet;

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
	}
}
