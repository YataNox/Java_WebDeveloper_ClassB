package days19;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 이미지 apple.jpg persimmon.jpg pear.jpg banana.jpg cherry.jpg
// 다섯 개의 이미지를 아이콘으로 만들고 버튼 다섯 개를 이미지와 함께 생성하세요
// 그리드 레이아웃을 이용하여 3행 2열로 배치하고
// 액션 리스너를 붙여서 버튼 클릭시에 이미지에 해당하는 과일 이름이 result 라벨에 나오도록 작성하세요'
// 생성할 클래스 이름은 GridFruts입니다.

// 버튼을 클릭하면 과일 이름이 result 라벨에 표시되도록 해주세요
// "사과를 선택하셨습니다."

class GridFruts extends JFrame implements ActionListener
{
	JLabel result;
	
	GridFruts()
	{
		// 라벨, 아이콘 생성
		result = new JLabel("");
		ImageIcon apple = new ImageIcon("images/apple.jpg");
		ImageIcon persimmon = new ImageIcon("images/persimmon.jpg");
		ImageIcon pear = new ImageIcon("images/pear.jpg");
		ImageIcon banana = new ImageIcon("images/banana.jpg");
		ImageIcon cherry = new ImageIcon("images/cherry.jpg");
		
		// 버튼 생성 및 이미지 삽입
		JButton appleBtn = new JButton("사과", apple);
		JButton persimmonBtn = new JButton("감", persimmon);
		JButton pearBtn = new JButton("배", pear);
		JButton bananaBtn = new JButton("바나나", banana);
		JButton cherryBtn = new JButton("체리", cherry);
		
		// 컨테이너 생성 및 위젯 추가
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));
		con.add(appleBtn);	
		con.add(persimmonBtn);
		con.add(pearBtn);
		con.add(bananaBtn);
		con.add(cherryBtn);
		con.add(result);
		
		// 버튼 이벤트 처리
		appleBtn.addActionListener(this);
		persimmonBtn.addActionListener(this);
		pearBtn.addActionListener(this);
		bananaBtn.addActionListener(this);
		cherryBtn.addActionListener(this);
		
		// 컨테이너 설정
		setTitle("grid ImageButton 실습");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 300);
		setVisible(true);
	}
	// 버튼 클릭 이벤트
	public void actionPerformed(ActionEvent e) 
	{
		result.setText(e.getActionCommand() + "를(을) 선택하셨습니다.");
	}
}

public class Swing09 
{
	public static void main(String[] args)
	{
		new GridFruts();
	}
}
