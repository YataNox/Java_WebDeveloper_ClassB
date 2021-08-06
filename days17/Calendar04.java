package days17;

import java.util.Calendar;

public class Calendar04 
{
	public static String toDate(Calendar c)
	{
		String cDate = c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONTH) + 1) + "월 "
				+ c.get(Calendar.DATE) + "일 ";
		return cDate;
	}
	public static void main(String [] args)
	{
		Calendar date = Calendar.getInstance();
		date.set(2021, 7, 31);
		System.out.println(toDate(date));
		
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toDate(date));
		// add 메소드의 증감은 하나의 요소를 변경하지만, 그로인해 다른 필드에 영향을 줄 수 있습니다.
		// 일을 변경하여 달이 바뀌거나, 월을 변경하여 연도가 바뀌는 변경 등
	}
}
