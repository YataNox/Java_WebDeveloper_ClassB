package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		Container con = getContentPane();
		jt = new JTextField(16);
		jt.setText("");
		jt.setHorizontalAlignment(SwingConstants.RIGHT); // 텍스트 필드 오른쪽 정렬
		jt.setEditable(false); //마우스 키보드로 편집할 수 없게 설정
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		Font f = new Font("굴림", Font.BOLD, 20); // 폰트 객체 생성
		jt.setFont(f);
		JButton b = new JButton("폰트");
		b.setFont(f);
		
		con.setLayout(new GridLayout(5,1));
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.setLayout(new GridLayout(1,4));
		p3.setLayout(new GridLayout(1,4));
		p4.setLayout(new GridLayout(1,4));
		p5.setLayout(new GridLayout(1,4));
		
		JButton[] btn = new JButton[10];
		for(int i = 0; i < btn.length; i++)
			btn[i] = new JButton(Integer.toString(i));
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		JButton b5 = new JButton("=");
		JButton b6 = new JButton("C");
		
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
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		con.add(p5);
		
		setTitle("계산기");
		setSize(600,500);
		setLocation(700,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		for(int i = 0; i < btn.length; i++)
			btn[i].addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) 
	{
		int result = 0;
		String s = e.getActionCommand();
		if(!s.equals("C") && !s.equals("="))
		{
			if((jt.getText().endsWith("+") || jt.getText().endsWith("-") || jt.getText().endsWith("*") ||
					jt.getText().endsWith("/")) && (s.equals("+") || s.equals("-") || s.equals("*") 
							|| s.equals("/")))
			{
				jt.setText(jt.getText().substring(0, jt.getText().length()-1) + s);
			}
			else
				jt.setText(jt.getText() + s);
		}
		else if(s.equals("C"))
		{
			jt.setText("");
		}
		else if(s.equals("="))
		{
			jt.setText(Integer.toString(result));
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
