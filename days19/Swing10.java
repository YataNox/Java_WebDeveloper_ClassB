package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JTextFieldTest extends JFrame implements ActionListener
{
	JTextField jtf;
	JTextFieldTest()
	{
		jtf = new JTextField(30);
		JButton btn1 = new JButton("반갑습니다.");
		JButton btn2 = new JButton("안녕하세요.");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jtf);
		con.add(btn1);
		con.add(btn2);
		
		jtf.setText("안녕하세요 반갑습니다.");
		// 명령어로 값을 꺼내고 할때는 String s = jtf.getText();
		btn1.addActionListener(this);
		btn2.addActionListener(this);
				
		setTitle("텍스트 필드 테스트");
		setSize(500, 100);
		setLocation(800,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		String s1 = jtf.getText();
		jtf.setText(s1 + e.getActionCommand());
	}
}

public class Swing10 
{	
	public static void main(String[] args)
	{
		new JTextFieldTest();
	}
}
