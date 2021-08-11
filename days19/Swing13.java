package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// 컨테이너의 레이아웃 : 5행 1열의 GridLayout
// 1행 : JPanel p1 배치 -> p1에는 FlowLayout으로 TextField 한 개 배치(가로 크기 적당히)
// 2행 : JPanel p2 배치 -> p2에는 GridLayout으로 버튼 네 개(7, 8, 9, +)
// 3행 : JPanel p3 배치 -> p3에는 GridLayout으로 버튼 네 개(4, 5, 6, -)
// 4행 : JPanel p4 배치 -> p4에는 GridLayout으로 버튼 네 개(1, 2, 3, *)
// 5행 : JPanel p5 배치 -> p5에는 GridLayout으로 버튼 네 개(C, 0, =, /)

class Calculator extends JFrame	 implements ActionListener
{
	JTextField jt;
	
	Calculator()
	{
		// 컨테이너 및 패널 생성
		Container con = getContentPane();
		jt = new JTextField(16);
		jt.setText("0.0");
		jt.setHorizontalAlignment(SwingConstants.RIGHT); // 텍스트 필드 오른쪽 정렬
		jt.setEditable(false); //마우스 키보드로 편집할 수 없게 설정
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		
		Font f = new Font("굴림", Font.BOLD, 20); // 폰트 객체 생성
		jt.setFont(f);
		//JButton b = new JButton("폰트");
		//b.setFont(f);
		
		con.setLayout(new GridLayout(6,1));
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.setLayout(new GridLayout(1,4));
		p3.setLayout(new GridLayout(1,4));
		p4.setLayout(new GridLayout(1,4));
		p5.setLayout(new GridLayout(1,4));
		p6.setLayout(new GridLayout(1,4));
		
		// 버튼 생성, 폰트 설정
		JButton[] btn = new JButton[10];
		for(int i = 0; i < btn.length; i++)
		{
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setFont(f);
		}
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		JButton b5 = new JButton("=");
		JButton b6 = new JButton("C");
		JButton b7 = new JButton("◀");
		JButton b8 = new JButton("sqr");
		JButton b9 = new JButton("1/x");
		JButton b10 = new JButton("%");
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		b10.setFont(f);
		
		
		// 각 레이아웃 위젯 추가
		p1.add(jt);
		p2.add(btn[7]);
		p2.add(btn[8]);
		p2.add(btn[9]);
		p2.add(b1);
		p3.add(btn[4]);
		p3.add(btn[5]);
		p3.add(btn[6]);
		p3.add(b2);
		p4.add(btn[1]);
		p4.add(btn[2]);
		p4.add(btn[3]);
		p4.add(b3);
		p5.add(b6);
		p5.add(btn[0]);
		p5.add(b5);
		p5.add(b4);
		p6.add(b7);
		p6.add(b8);
		p6.add(b9);
		p6.add(b10);
		
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		con.add(p5);
		con.add(p6);
		
		// 컨네이터 설정
		setTitle("계산기");
		setSize(300,300);
		setLocation(700,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 이벤트 추가
		for(int i = 0; i < btn.length; i++)
			btn[i].addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) 
	{
		String s = e.getActionCommand();
		// 초기화 버튼이나 연산 버튼을 제외한 버튼을 눌렀을 시 
		if(!s.equals("C") && !s.equals("=") && !s.equals("◀") && !s.equals("1/x") && !s.equals("sqr"))
		{	
			if(jt.getText().equals("-") && (s.equals("+") || s.equals("*") || s.equals("/") || s.equals("%")))
				jt.setText("0.0");
			// 연산자 중복 입력 불가 처리
			else if((jt.getText().endsWith("+") || jt.getText().endsWith("-") || jt.getText().endsWith("*") || jt.getText().endsWith("/") || jt.getText().endsWith("%")) 
					&& (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%")))
				jt.setText(jt.getText().substring(0, jt.getText().length()-1) + s);
			// 그 외 값은 정상 입력
			else
			{
				// 첫 입력 값이 +*/이 아닐 경우 초기 0제거하고 입력
				if(jt.getText().equals("0.0") && !(s.equals("+") || s.equals("*") || s.equals("/") || s.equals("%")))
					jt.setText(s);
				else
					jt.setText(jt.getText() + s);
			}	
		}
		if(s.equals("sqr"))
		{
			double i = Math.sqrt(Double.parseDouble(jt.getText()));
			jt.setText(Double.toString(i));
		}
		if(s.equals("1/x"))
		{
			double i = Double.parseDouble(jt.getText());
			jt.setText(Double.toString(1/i));
		}
		// 백스페이스 버튼
		if(s.equals("◀"))
		{
			jt.setText(jt.getText().substring(0, jt.getText().length()-1));
			if(jt.getText().equals(""))
			{
				jt.setText("0.0");
			}
		}
		// 초기화 버튼
		else if(s.equals("C"))
		{
			jt.setText("0.0");
		}
		// 연산 버튼
		else if(s.equals("="))
		{
			StringTokenizer st = new StringTokenizer(jt.getText(),"+-*/%", true);
			int c = 0;
			double sum = 0;
			String [] num = new String[st.countTokens()];
			
			while(st.hasMoreTokens())
			{
				num[c++] = st.nextToken();
			}
			
			// 음수가 첫 수 일 때 연산
			if(num[0].equals("-"))
			{
				for(int i = 0; i < num.length; i++)
				{
					if(i % 2 == 0 && i == 0)
						sum -= Double.parseDouble(num[1]);
					else if(i % 2 == 0)
					{
						if(num[i].equals("+"))
							sum += Double.parseDouble(num[i+1]);
						if(num[i].equals("-"))
							sum -= Double.parseDouble(num[i+1]);
						if(num[i].equals("*"))
							sum *= Double.parseDouble(num[i+1]);
						if(num[i].equals("/"))
							sum /= Double.parseDouble(num[i+1]);
						if(num[i].equals("%"))
							sum %= Double.parseDouble(num[i+1]);
					}
				}
			}
			// 그 외 연산
			else
			{
				for(int i = 0; i < num.length; i++)
				{
					if(i % 2 == 0 && i == 0)
						sum += Double.parseDouble(num[0]);
					else if(i % 2 == 0 && i != 0)
					{
						if(num[i-1].equals("+"))
							sum += Double.parseDouble(num[i]);
						if(num[i-1].equals("-"))
							sum -= Double.parseDouble(num[i]);
						if(num[i-1].equals("*"))
							sum *= Double.parseDouble(num[i]);
						if(num[i-1].equals("/"))
							sum /= Double.parseDouble(num[i]);
						if(num[i-1].equals("%"))
							sum %= Double.parseDouble(num[i]);
					}
				}
			}
			// 결과 출력
			jt.setText(Double.toString(sum));
		}
	}
}

public class Swing13 
{
	public static void main(String[] args)
	{
		new Calculator();
	}
}
