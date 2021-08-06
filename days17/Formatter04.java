package days17;

import java.text.MessageFormat;

public class Formatter04 
{
	public static void main(String[] args)
	{
		String msg = "Name : {0}		Tel : {1}	Age : {2}	Birthday : {3}";
		Object[] value = {"이자바", "02-123-1234", 27, "07-09"};
		String r = MessageFormat.format(msg, value); // 메세지 포맷의 메소드에 의한 배열 병합 작업
		System.out.println(r);
	}
}
