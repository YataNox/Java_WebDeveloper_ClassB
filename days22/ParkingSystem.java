package days22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
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
	public int payCount() throws ParseException
	{
		// this. <- cars[k-1];
		// 현재시간(출차시간) 생성(Calendar) - 입차시간과의 차를 구하기 위한 동작
		// (출차시간 밀리초 - 입차시간 밀리초)/1000 -> 초(second) 단위로 주차시간 계산
		// 주차비 계산 : 현재 시간을 출차 시간으로 하여 밀리초끼리의 뺄셈 연산 후 다시 시분초로 환산
		// 시간 당 2000원, 10분당 400원
		
		// 강사님 코드-------------------------------------------------------------------
		int pay = 0;
		Calendar outTime = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		// 입차 시간(enterDateTime - Sting자료) sdf.parse로 Date형태로 전환
		Date eT = sdf.parse(this.enterDateTime);
		// 입차 시간 변수 생성(Calendar)
		Calendar enterTime = Calendar.getInstance();
		// Date 형태로 전환된 입차시간을 Calendar 형 변수에 세트
		enterTime.setTime(eT);
		
		long dif = (outTime.getTimeInMillis() - enterTime.getTimeInMillis()) / 1000;
		// 입차시간부터 출차시간까지의 차가 초단위로 변환되어서 dif변수에 저장
		
		int min = (int)(dif / 60.0);
		int hour = (int)(min / 60.0);
		pay = hour * 2000;
		pay = pay + (((min % 60) / 10) * 400); // 시간 금액 + ((잔여분 금액) / 10)(10분단위 계산)
		return pay;
		
		
		// 혼자 생각해본 코드(오류 존재)---------------------------------------------------
		/*Date now2 = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
		String outTime = sdf.format(now2);
		
		// 흐른 시간 계산
		int y = Integer.valueOf(outTime.substring(0,4)) - Integer.valueOf (enterDateTime.substring(0,4));
		int m = Integer.valueOf(outTime.substring(5,7)) - Integer.valueOf (enterDateTime.substring(5,7));
		int d = Integer.valueOf(outTime.substring(8,10)) - Integer.valueOf (enterDateTime.substring(8,10));
		int h = Integer.valueOf(outTime.substring(11,13)) - Integer.valueOf (enterDateTime.substring(11,13));
		int mm = Integer.valueOf(outTime.substring(14,16)) - Integer.valueOf (enterDateTime.substring(14,16));
		y = y * 365; // 년을 일로 치환
		m = m * 30; // 월을 일로 치환
		d = d + m + y; // 총 일 수 계산
		d = d * 24; // 일 수 만큼 시간 치환
		h = (d + h) * 2000; // 시간 차만큼 금액 합산 및 계산
		mm = ((mm / 10) * 400); // 10분 단위의 가격 계산
		//System.out.printf("%d %d %d %d %d", y, m, d, h, mm);
		return h + mm;*/
	}
}

public class ParkingSystem 
{
	public static void main(String[] args) throws ClassNotFoundException, IOException, ParseException
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
			System.out.println("1. 입차\t2. 출차\t3. 주차상황\t4. 종료\t");
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
				case 5:
					for(int i = 0; i < list.size(); i++)
						list.get(i).setEnterDateTime("2021-08-17_10:00");
			}
		}
		System.out.println("프로그램이 종료합니다.");
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
		oos.writeObject(list); // 주차중인 차를 담고 있는 리스트를 파일에 저장
		oos.close();
	} 
	private static void enterCar(ArrayList<Car> list)
	{
		// if문과 list.size()를 이용하여 현재 주차중인 차의 댓수가 10대이면 만차
		// 더이상 주차 할 수 없습니다. 메세지와 함께 메소드 종료
		if(list.size() == 10)
		{
			System.out.println("만차 ~ 더이상 주차할 수 없습니다.\n\n");
			return;
		}
		// 차량 번호 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입차 : 차량번호를 입력하세요 : ");
		String num = sc.nextLine();
		
		// Car 객체 생성 : 생성자를 이용한 멤버 변수 초기화 기능 실행
		Car c = new Car(num);
		// 리스트에 차량 추가
		list.add(c);
	}
	private static void outCar(ArrayList<Car> list) throws ParseException
	{
		// 리스트 사이즈가 0이면 출차할 차가 없습니다. 라는 메시지와 함께 메소드 종료
		if(list.size() == 0)
		{
			System.out.println("출차할 차가 없습니다.");
			return;
		}
		// 차량 번호 입력(뒤 숫자 네자리만 입력)
		System.out.println("출차할 차의 차량 번호 뒷자리 4자리를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		Car[] cars = new Car[10]; // 중복된 차량 리스트를 담을 배열
		for(int i = 0; i < list.size(); i++)
			if(list.get(i).getCarNumber().indexOf(num) != -1)
				// num 값이 현재 차의 번호의 일부로 존재 한다면
				cars[i] = list.get(i); // 현재 차량의 저장되 리스트 주소값을 cars 배열의 같은 위치에 저장 
		
		if(cars.length == 0)
		{
			System.out.println("찾는 차량이 없습니다.");
			return;
		}
		for(int i = 0; i < cars.length; i++)
			if(cars[i] != null) // cars 배열값들중 널이 아닌것들만 화면에 번호와  함계 출력
				System.out.println((i+1) + ". " + cars[i].toString());
		
		// 출력된 리스트(1개 이상)에서 출차할 차량의 순번 입력
		System.out.println("출차할 차의 주차 순번을 입력하세요");
		int k = sc.nextInt();
		
		// 요금 계산
		int pay = cars[k-1].payCount(); // 요금 계산
		// 요금 출력
		System.out.println("주차 요금은 " + pay + "원입니다.");
		// 출차
		list.remove(k-1);
	}
	private static void prnCar(ArrayList<Car> list)
	{
		System.out.println("주차 중인 차량 목록-------------------------------");
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("\n");
	}
}
