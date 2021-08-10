package days19;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

class JBorderLayout extends JFrame
{
	JBorderLayout()
	{
		Container con = getContentPane();
		con.setLayout(new BorderLayout(10, 10));
		// 각 지역(동서남북중앙)간의 간격 가로세로 10px
	}
}

public class Swing07 
{
	public static void main(String[] args)
	{
		new JBorderLayout();
	}
}
