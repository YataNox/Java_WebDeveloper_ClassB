package days19;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// 액션리스너를 사요하지 않고 버튼 자체에 존재하는 이벤트 메소드를 사용
class JButtonEvent extends JFrame
{
	JButtonEvent()
	{
		ImageIcon korea = new ImageIcon("images/korea1.gif");
		ImageIcon germany = new ImageIcon("images/germany.gif");
		ImageIcon usa = new ImageIcon("images/usa.gif");
		// 이미지 3개, 버튼은 1개
		
		JButton eventButton = new JButton(korea); // korea 이미지 아이콘으로 버튼 생성
		
		// 버튼 위에 마우스가 올려질 때의 이벤트
		eventButton.setRolloverIcon(usa);
		// 버튼을 누를 시의 이벤트
		eventButton.setPressedIcon(germany);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(eventButton);
		
		setTitle("버튼 자체 이벤트 처리 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Swing05 
{
	public static void main(String[] args)
	{
		new JButtonEvent();
	}
}
