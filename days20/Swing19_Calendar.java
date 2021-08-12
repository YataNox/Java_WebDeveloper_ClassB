package days20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calendars extends JFrame implements ActionListener
{
	JTextField y;
	JComboBox<String> m;
	int year = 0;
	int month = 0;
	JTextField[] jt = new JTextField[42]; // 레퍼런스 변수 42개 생성
	
	Calendars()
	{
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		Font f1 = new Font("굴림", Font.BOLD, 20);
		
		JButton b1 = new JButton("일");
		JButton b2 = new JButton("월");
		JButton b3 = new JButton("화");
		JButton b4 = new JButton("수");
		JButton b5 = new JButton("목");
		JButton b6 = new JButton("금");
		JButton b7 = new JButton("토");
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		b6.setFont(f1);
		b7.setFont(f1);
		
		// jp1 설정-----------------------------------------------------------
		jp1.setLayout(new GridLayout(1,7));
		jp1.add(b1).setForeground(Color.RED);
		jp1.add(b2);
		jp1.add(b3);
		jp1.add(b4);
		jp1.add(b5);
		jp1.add(b6);
		jp1.add(b7).setForeground(Color.BLUE);
		
		// jp3 설정-----------------------------------------------------------
		jp3.setLayout(new FlowLayout(FlowLayout.CENTER));
		y = new JTextField(8);
		y.setFont(f1);
		y.setHorizontalAlignment(SwingConstants.CENTER);
		
		m = new JComboBox<>();
		// 반복 실행문을 이용하여 콤보 상자에 1월부터 12월까지의 항목을 i값으로 추가
		for(int i = 1; i <= 12; i++)
			m.addItem(String.valueOf(i));
		m.setFont(f1);
		
		JButton b = new JButton("확인");
		JButton b11 =new JButton("이전달");
		JButton b12 =new JButton("다음달");
		b.setFont(f1);
		b11.setFont(f1);
		b12.setFont(f1);
		
		jp3.add(b11);
		jp3.add(y);
		jp3.add(new JLabel("년 ")).setFont(f1);
		jp3.add(m);
		jp3.add(new JLabel("월 ")).setFont(f1);
		jp3.add(b);
		jp3.add(b12);
		
		// jp2 설정 ----------------------------------------------------------
		jp2.setLayout(new GridLayout(6,7));
		for(int i = 0; i < jt.length; i++)
		{
			jt[i] = new JTextField();
			jt[i].setFont(f1);
			jt[i].setHorizontalAlignment(SwingConstants.RIGHT); // 오른쪽 정렬
			jt[i].setEditable(false); // 임의 편집 금지
			jt[i].setBackground(Color.white); // 배경색 흰색
			jp2.add(jt[i]);
			if(i % 7 == 0)
				jt[i].setForeground(Color.RED);
			else if(i % 7 == 6)
				jt[i].setForeground(Color.BLUE);
			else
				jt[i].setForeground(Color.BLACK);
		}
		
		// 컨테이너에 패널 적재
		con.add(jp1, BorderLayout.NORTH);
		con.add(jp2, BorderLayout.CENTER);
		con.add(jp3, BorderLayout.SOUTH);
		
		// 버튼들의 이벤트 추가
		b.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		
		// 윈도우 화면 표시
		setTitle("스윙 캘린더");
		setLocation(700,300);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Calendar today = Calendar.getInstance();
		y.setText(String.valueOf(today.get(Calendar.YEAR)));
		// int a = today.get(Calendar.YEAR);
		// String b = String.valueOf(a);
		// y.setText(b);
		m.setSelectedIndex(today.get(Calendar.MONTH));
		
		year = Integer.parseInt(y.getText());
		month = Integer.parseInt((String)m.getSelectedItem());
		// String a = (String)m.getSelectedItem();
		// int b = Integer.paresInt(a);
		// month = a;
		
		drawCalendar();
	}
	public void drawCalendar()
	{
		// 시작 날짜와 끝날짜 객체를 생성합니다. (sDay, eDay)
		// year 값과 month 값으로 sDay와 eDay를 설정합니다. 해당 월의 1일과 말일
		// sDay의 요일을 얻습니다.
		// 얻은 요일까지 jt[]를 지나칩니다.
		// 이어지는 jt[]부터 말일까지 ㅣ숫자를 써넣습니다.
		
		// 요일을 출력하기 전 달력 초기화 작업
		int i;
		for(i = 0; i < 42; i++)
			jt.clone()[i].setText(""); // 전체 42칸 비움
		
		Calendar sDay = Calendar.getInstance(); // 출력할 달력의 시작 날짜(1일)
		Calendar eDay = Calendar.getInstance(); // 출력할 달력의 끝 날짜(말일)
		
		// month는 0부터 ~ 11
		// 한 달의 시작일과 말일 계산
		sDay.set(year, month - 1, 1); // year 2021 month 7 date 1
		eDay.set(year, month, 1); // year 2021 month 8 date 1
		eDay.add(Calendar.DATE, -1); // year 2021 month 7 date 31
		
		// 시작날의 요일을 계산
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		// 해당 요일까지 달력의 공백 생성
		for(i = 1; i < START_WEEK; i++)
		{
			jt[i].setText(""); // 해당 요일까지 비움
		}
		// 월요일부터 1일이 시작한다고 가정했을 시 START_WEEK의 값은 2
		// 위의 반복문을 탈출한 i의 값은 2일 것 jk의 인덱스는 0부터 시작하기에 jk[1]부터
		// 1일을 채워넣어야 하기때문에 인덱스로 사용할 i의 값이 -1된 상태로 시작할 필요가 있음
		i--;
		
		// 1일 부터 말일까지 달력에 채움
		for(int k = 1; k <= eDay.get(Calendar.DATE); k++, i++)
			jt[i].setText(String.valueOf(k));
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		
		switch(s)
		{
			// 확인 버튼 시 JTextField y와 JComboBox의 m의 값을 
			// year와 month에 저장한다.
			case "확인" :
				year = Integer.parseInt(y.getText());
				month = Integer.parseInt((String)m.getSelectedItem());
				break;
			// 이전달을 누를 시 현재 year와 month의 값을 알맞게 수정 시킨다.
			case "이전달" :
				if(month == 1)
				{
					year--; 
					month = 12;
				}
				else
					month--;
				break;
			// 다음달을 누를 시 현재 year와 month의 값을 알맞게 수정 시킨다.
			case "다음달" :
				if(month == 12)
				{
					year++;
					month = 1;
				}
				else
					month++;
				break;
		}
		// 이후 달력의 출력을 새로 한다.
		y.setText(String.valueOf(year));
		m.setSelectedIndex(month-1);
		drawCalendar();
	}
}

public class Swing19_Calendar 
{
	public static void main(String[] args)
	{
		new Calendars();
	}
}
