package days19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

class JPanelTest extends JFrame
{
	JPanelTest()
	{
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel  jp1 = new JPanel();
		JPanel  jp2 = new JPanel();
		
		jp1.setLayout(new GridLayout(5,1));
		jp2.setLayout(new GridLayout(4,1));
		
		setTitle("JPanel Test");
		setSize(500,400);
		setLocation(700,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

public class Swing12 
{
	public static void main(String[] args)
	{
		
	}
}
