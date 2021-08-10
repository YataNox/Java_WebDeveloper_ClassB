package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

class JTextFieldTest extends JFrame implements ActionListener
{
	JTextFieldTest()
	{
		JTextField jtf = new JTextField(30);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jtf);
		
		setTitle("텍스트 필드 테스트");
		setSize(500, 100);
		setLocation(800,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}

public class Swing10 
{	
	public static void main(String[] args)
	{
		new JTextFieldTest();
	}
}
