package days22;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Car implements Serializable
{
	private String carNumber;
	private String enterDateTime;
	
	Car(String carNumber)
	{
		this.carNumber = carNumber; // 전달된 차 번호를 멤버변수에 저장
		// "yyyy-MM-dd_HH:mm" 날짜 포맷 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		// 캘린더에서 날짜를 얻어오고 Date 형식으로 저장
		Date now = Calendar.getInstance().getTime();
		// 날짜 포멧에 now 변수에 있는 날짜를 적용 -> ""를 이어붙이기 해서 String 형으로 변환
		String enterDT = sdf.format(now) + ""; // 2020-11-26_12:14
		// String enterDT = String.valueOf(sdf.format(now));
		this.enterDateTime = enterDT; // 오늘자를 변형한 입차시간을 멤버 변수에 저장
	}
	public String toString()
	{
		return this.carNumber + " # " + this.enterDateTime;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Car))
			return false;
		Car target = (Car)obj;
		boolean result = this.carNumber.equals(target.carNumber);
		return result;
	}// 차넘버만 같으면 true
	public String getCarNumber()
	{
		return carNumber;
	}
	public String getEnterDateTime()
	{
		return enterDateTime;
	}
	public void setCarNumber(String carNumber)
	{
		this.carNumber = carNumber;
	}
	public void setEnterDateTime(String enterDateTime)
	{
		this.enterDateTime = enterDateTime;
	}
}

public class ParkingSystem 
{
	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		Scanner sc = new Scanner(System.in);
	
		File dir = new File("D:\\JAVA02\\Java_se\\parking");
		if(!dir.exists())
			dir.mkdirs();
		File file = new File(dir, "parking.dat");
		
		ArrayList<Car> list; // 입차하는 차들이 저장될 리스트
		
		// 파일이 있으면 열어서 파일의 내용을 읽어서 리스트 저장, 최초 실행이라 파일이 없으면 새로 리스트 생성
		if(!file.exists())
			list = new ArrayList<Car>();
		else
		{
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
			list = (ArrayList<Car>)ois.readObject();
			ois.close();
		}
		
		while(true)
		{
			System.out.printf("메뉴를 선택하세요>> ");
			System.out.println("1. 입차\t2. 출차\t3. 주차상황\t4. 종료");
			System.out.printf("입력 : ");
			int input = sc.nextInt();
			if(input == 4)
				break; // 4번 입력시 while문 종료 리스트를 파일에 저장 후 프로그램도 종료
			switch(input)
			{
				case 1:
					enterCar(list);
					break;
				case 2: 
					outCar(list);
					break;
				case 3: 
					prnCar(list);
					break;
			}
		}
		System.out.println("프로그램이 종료합니다.");
	}
	private static void enterCar(ArrayList<Car> list)
	{
		
	}
	private static void outCar(ArrayList<Car> list)
	{
		
	}
	private static void prnCar(ArrayList<Car> list)
	{
		
	}
}
