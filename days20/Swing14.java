package days20;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTextFieldTextArea extends JFrame implements ActionListener
{
	JTextField jtf;
	JTextArea jta;
	
	JTextFieldTextArea()
	{
		jtf = new JTextField(10); // 최대 표시 10글자(가로크기) .... 텍스트 필드
		jta = new JTextArea(7,20); // 7행 20열 (20글자)
		
		Font f= new Font("굴림", Font.BOLD, 20);
		jtf.setFont(f);
		jta.setFont(f);
		
		JButton okBtn = new JButton("확인");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(jtf);
		con.add(jta);
		con.add(okBtn);
		
		okBtn.addActionListener(this);
		
		setTitle("텍스트 필드 텍스트 에일리어");
		setSize(400, 300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		jta.append(jtf.getText() + "\n"); // 텍스트 필드의 텍스트에어리어 뒤 쪽에 내용을 이어붙이기
		jtf.setText("");
	}
}

public class Swing14 
{
	public static void main(String[] args)
	{
		new JTextFieldTextArea();
	}
}
