package days19;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonEvent extends JFrame implements ActionListener
{
	JLabel result = new JLabel(""); // 버튼 클릭에 의해서 실행 결과가 담길 라벨 
	
	ButtonEvent()
	{
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은?");
		
		Container con = getContentPane(); 
		con.setLayout(new FlowLayout()); 
		
		con.add(label);
		con.add(male);
		con.add(female);
		con.add(result);
		
		setTitle("버튼 이벤트 테스트"); 
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 창 초기 위치 설정
		Dimension frameSize = this.getSize(); // 프레임 사이즈
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // 모니터 사이즈
		this.setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2); // 화면 중앙
		
		male.addActionListener(this);
		female.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand(); // 클릭된 버튼의 표시된 값이 문자 변수 s에 저장
		result.setText(s);
	}
}

public class Swing03 
{
	public static void main(String[] args)
	{
		new ButtonEvent();
	}
}
