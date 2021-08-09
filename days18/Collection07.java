package days18;

import java.util.HashMap;
import java.util.Hashtable;

//Hashtable, HashMap 클래스
// 데이터베이스 내부의 키 값을 검색하기 위해서 만들어진 알고리즘을 기반으로 작성된 클래스
// - 검색을 위해서 사용되는 클래스
// - Key, Value를 저장할 수 있는 클래스
// - Key는 중복을 허용하지 않습니다.
// - Value는 중복을 허용합니다.
// 저장 예
// HashMap hm = new HashMap();
// hm.put(1, "One"); hm.put(2, "Two"); hm.put(3, "Three");

public class Collection07 
{
	public static void main(String[] args)
	{
		// Key 값은 문자열, Value 값은 정수로 입력받는 Hashtable 객체 생성
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		// Key 값은 정수, Value 값은 문자열로 입력받는 HashMap 객체 생성
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// 사용 예의 확장1
		// HashMap<Integer, ArrayList<String>> kk = new Hashmap<>();
	}
}
