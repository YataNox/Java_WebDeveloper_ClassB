package days18;

import java.util.HashMap;
import java.util.Hashtable;

public class Collection08 
{
	public static void main(String[] args)
	{
		Hashtable<String, Integer> ht = new Hashtable<>();
		HashMap<Integer, String> hm = new HashMap<>();
		
		ht.put("One", 1); ht.put("Two", 2); ht.put("Three", 3);
		hm.put(1, "One"); hm.put(2, "Two"); hm.put(3, "Three");
		
		System.out.printf("ht.size() -> %d\n", ht.size());
		System.out.printf("hm.size() -> %d\n", hm.size());
		
		// 중복되지 않은 키 값으로 데이터를 추가
		ht.put("Four", 4); ht.put("Five", 5);
		hm.put(4, "Four"); hm.put(5, "Five");
		System.out.printf("ht.size() -> %d\n", ht.size());
		System.out.printf("hm.size() -> %d\n", hm.size());
	}
}
