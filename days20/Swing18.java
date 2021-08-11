package days20;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// 실행 화면과 같이 화면을 구성해주세요
// 확인 버튼을 클릭하면 입력 내용이 콘솔 창에 나란히 표시되도록 해주세요
// 클래스 이름은 Resume 입니다.

class Resume extends JFrame implements ActionListener
{
	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;
	JRadioButton jrb1;
	JRadioButton jrb2;
	ButtonGroup bg;
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	JComboBox<String> jcb02;
	JComboBox<String> jcb;
	
	Resume()
	{
		jcb = new JComboBox<String>();
		jcb02 = new JComboBox<String>();
		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		jtf3 = new JTextField(10);
		JLabel lb1 = new JLabel(" 성		명 : ");
		JLabel lb2 = new JLabel(" 성		별 : ");
		JLabel lb3 = new JLabel(" 취		미 : ");
		JLabel lb4 = new JLabel("전화번호 : ");
		JLabel lb5 = new JLabel("거주지역 : ");
		jrb1 = new JRadioButton("남자");
		jrb2 = new JRadioButton("여자");
		jcb1 = new JCheckBox("운동");
		jcb2 = new JCheckBox("노래");
		jcb3 = new JCheckBox("독서");
		jcb4 = new JCheckBox("등산");
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jcb.addItem("010"); // jcb.addItem(); 콤보 상자 목록 추가
		jcb.addItem("011");
		jcb.addItem("018");
		jcb.addItem("070");
		jcb02.addItem("서울");
		jcb02.addItem("대전");
		jcb02.addItem("대구");
		jcb02.addItem("부산");
		
		JButton okBtn = new JButton("확인");
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		
		p1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p4.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p5.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p6.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		
		Font f = new Font("굴림", Font.BOLD, 15);
		lb1.setFont(f);
		lb2.setFont(f);
		lb3.setFont(f);
		lb4.setFont(f);
		lb5.setFont(f);
		okBtn.setFont(f);
		jtf1.setFont(f);
		jtf2.setFont(f);
		jtf3.setFont(f);
		jcb.setFont(f);
		jcb1.setFont(f);
		jcb2.setFont(f);
		jcb3.setFont(f);
		jcb4.setFont(f);
		jrb1.setFont(f);
		jrb2.setFont(f);
		
		p1.add(lb1);
		p1.add(jtf1);
		p2.add(lb2);
		p2.add(jrb1);
		p2.add(jrb2);
		p3.add(lb3);
		p3.add(jcb1);
		p3.add(jcb2);
		p3.add(jcb3);
		p3.add(jcb4);
		p4.add(lb4);
		p4.add(jcb);
		p4.add(new JLabel("-"));
		p4.add(jtf2);
		p4.add(new JLabel("-"));
		p4.add(jtf3);
		p5.add(lb5);
		p5.add(jcb02);
		p6.add(okBtn);
		
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		con.add(p5);
		con.add(p6);
		
		okBtn.addActionListener(this);
		
		setTitle("구성 실습");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = "";
		System.out.println("----------------------------------------------------------");
		System.out.println("성\t명 : " + jtf1.getText());
		
		if(jrb1.isSelected())
			System.out.println("성\t별 : " + jrb1.getText());
		else if(jrb2.isSelected())
			System.out.println("성\t별 : " + jrb2.getText());
		
		if(jcb1.isSelected())
			s = s + jcb1.getActionCommand() + " ";
		if(jcb2.isSelected())
			s = s + jcb2.getActionCommand() + " ";
		if(jcb3.isSelected())
			s = s + jcb3.getActionCommand() + " ";
		if(jcb4.isSelected())
			s = s + jcb4.getActionCommand() + " ";
		
		System.out.println("취\t미 : " + s);
		
		System.out.println("전화번호 : " + jcb.getSelectedItem() +"-" + jtf2.getText() + "-" + jtf3.getText());
		
		System.out.println("거주지역 : " + jcb02.getSelectedItem());
		System.out.println("----------------------------------------------------------");
		
	}
}

public class Swing18 
{
	public static void main(String[] args)
	{
		new Resume();
	}
}
package days20;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// 실행 화면과 같이 화면을 구성해주세요
// 확인 버튼을 클릭하면 입력 내용이 콘솔 창에 나란히 표시되도록 해주세요
// 클래스 이름은 Resume 입니다.

class Resume extends JFrame implements ActionListener
{
	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;
	JRadioButton jrb1;
	JRadioButton jrb2;
	ButtonGroup bg;
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	JComboBox<String> jcb02;
	JComboBox<String> jcb;
	
	Resume()
	{
		jcb = new JComboBox<String>();
		jcb02 = new JComboBox<String>();
		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		jtf3 = new JTextField(10);
		JLabel lb1 = new JLabel(" 성		명 : ");
		JLabel lb2 = new JLabel(" 성		별 : ");
		JLabel lb3 = new JLabel(" 취		미 : ");
		JLabel lb4 = new JLabel("전화번호 : ");
		JLabel lb5 = new JLabel("거주지역 : ");
		jrb1 = new JRadioButton("남자");
		jrb2 = new JRadioButton("여자");
		jcb1 = new JCheckBox("운동");
		jcb2 = new JCheckBox("노래");
		jcb3 = new JCheckBox("독서");
		jcb4 = new JCheckBox("등산");
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jcb.addItem("010"); // jcb.addItem(); 콤보 상자 목록 추가
		jcb.addItem("011");
		jcb.addItem("018");
		jcb.addItem("070");
		jcb02.addItem("서울");
		jcb02.addItem("대전");
		jcb02.addItem("대구");
		jcb02.addItem("부산");
		
		JButton okBtn = new JButton("확인");
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		
		p1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p4.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p5.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		p6.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		
		Font f = new Font("굴림", Font.BOLD, 15);
		lb1.setFont(f);
		lb2.setFont(f);
		lb3.setFont(f);
		lb4.setFont(f);
		lb5.setFont(f);
		okBtn.setFont(f);
		jtf1.setFont(f);
		jtf2.setFont(f);
		jtf3.setFont(f);
		jcb.setFont(f);
		jcb1.setFont(f);
		jcb2.setFont(f);
		jcb3.setFont(f);
		jcb4.setFont(f);
		jrb1.setFont(f);
		jrb2.setFont(f);
		
		p1.add(lb1);
		p1.add(jtf1);
		p2.add(lb2);
		p2.add(jrb1);
		p2.add(jrb2);
		p3.add(lb3);
		p3.add(jcb1);
		p3.add(jcb2);
		p3.add(jcb3);
		p3.add(jcb4);
		p4.add(lb4);
		p4.add(jcb);
		p4.add(new JLabel("-"));
		p4.add(jtf2);
		p4.add(new JLabel("-"));
		p4.add(jtf3);
		p5.add(lb5);
		p5.add(jcb02);
		p6.add(okBtn);
		
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		con.add(p5);
		con.add(p6);
		
		okBtn.addActionListener(this);
		
		setTitle("구성 실습");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = "";
		System.out.println("----------------------------------------------------------");
		System.out.println("성\t명 : " + jtf1.getText());
		
		if(jrb1.isSelected())
			System.out.println("성\t별 : " + jrb1.getText());
		else if(jrb2.isSelected())
			System.out.println("성\t별 : " + jrb2.getText());
		
		if(jcb1.isSelected())
			s = s + jcb1.getActionCommand() + " ";
		if(jcb2.isSelected())
			s = s + jcb2.getActionCommand() + " ";
		if(jcb3.isSelected())
			s = s + jcb3.getActionCommand() + " ";
		if(jcb4.isSelected())
			s = s + jcb4.getActionCommand() + " ";
		
		System.out.println("취\t미 : " + s);
		
		System.out.println("전화번호 : " + jcb.getSelectedItem() +"-" + jtf2.getText() + "-" + jtf3.getText());
		
		System.out.println("거주지역 : " + jcb02.getSelectedItem());
		System.out.println("----------------------------------------------------------");
		
	}
}

public class Swing18 
{
	public static void main(String[] args)
	{
		new Resume();
	}
}
