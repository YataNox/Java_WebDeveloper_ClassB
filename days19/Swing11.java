package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 윈도우에 텍스트 필드 버튼 버튼 텍스트 필드
// 순서로 배치합니다.
// 버튼 1의 표면에는 ">" 글자 표시, 버튼 2의 표면에는 "<" 글자를 표시합니다.
// 버튼 1을 클릭하면 텍스트 필드1의 글자가 텍스트필드 2로 옮겨집니다.
// 버튼 2을 클릭하면 텍스트 필드2의 글자가 텍스트필드 1로 옮겨집니다.
// 글자가 없는 상태에서 버튼을 클릭하면 아무일도 안일어나게....
// 윈도 클래스 이름은 TextFieldEx로 제작해주세요
// 윈도우 가로 세로 크기는 적절히 조절해주세요

class TextFieldEx extends JFrame implements ActionListener
{
	JTextField jtf1;
	JTextField jtf2;
	
	TextFieldEx()
	{
		// 위젯 생성
		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		JButton btn1 = new JButton(">");
		JButton btn2 = new JButton("<");
		
		// 컨테이너 생성
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(jtf1);
		con.add(btn1);
		con.add(btn2);
		con.add(jtf2);
		
		// 이벤트 추가
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		// 컨테이너 설정
		setTitle("Text Moving Event");
		setLocation(700,200);
		setSize(600,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 버튼 이벤트
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand() == ">" && !jtf1.getText().equals(""))
		{
			jtf2.setText(jtf1.getText());
			jtf1.setText("");
		}
		else if(e.getActionCommand() == "<" && !jtf2.getText().equals(""))
		{
			jtf1.setText(jtf2.getText());
			jtf2.setText("");
		}
		else
			return;
	}
	
}

public class Swing11 
{
	public static void main(String[] args)
	{
		new TextFieldEx();
	}
}
