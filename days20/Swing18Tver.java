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

// 실행화면과 같이 화면을 구성해주세요
// 확인 버튼을 클릭하면 입력 내용이 콘솔창에 나란히 표시되도록 해주세요
// 클래스 이름은 Resume 입니다
class Resume1 extends JFrame implements ActionListener{

	JTextField jt_name;
	JRadioButton jr1;
	JRadioButton jr2;
	JCheckBox jc1;
	JCheckBox jc2;
	JCheckBox jc3;
	JCheckBox jc4;
	JComboBox<String> jcb;
	JTextField jt_phone2;
	JTextField jt_phone3;
	JComboBox<String> jcb2;
	
	Resume1(){
		Font f = new Font("굴림", Font.BOLD, 20);
		Container con = getContentPane();   // 메인 컨테이너
		con.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();   // 메인 컨테이너에 올라갈 패널1
		JPanel jp2 = new JPanel();   // 메인 컨테이너에 올라갈 패널2
		jp1.setLayout(new GridLayout(6,1));
		jp2.setLayout(new GridLayout(6,1));
		
		JLabel lb1 = new JLabel("  성        명  : ");
		JLabel lb2 = new JLabel("  성        별  : ");
		JLabel lb3 = new JLabel("  취        미  : ");
		JLabel lb4 = new JLabel("  전 화 번 호  : ");
		JLabel lb5 = new JLabel("  거 주 지 역  : ");
		lb1.setFont(f);		lb2.setFont(f);		lb3.setFont(f);		lb4.setFont(f);		lb5.setFont(f);
		jp1.add(lb1);		jp1.add(lb2);		jp1.add(lb3);		jp1.add(lb4);		jp1.add(lb5);
		con.add(jp1, BorderLayout.WEST);
		
		
		
		JPanel jp21 = new JPanel();
		JPanel jp22 = new JPanel();
		JPanel jp23 = new JPanel();
		JPanel jp24 = new JPanel();
		JPanel jp25 = new JPanel();
		JPanel jp26 = new JPanel();
		jp21.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp22.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp23.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp24.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp25.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		jp26.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		jt_name = new JTextField(10);
		jt_name.setFont(f);
		jp21.add(jt_name);
		jp2.add(jp21);
		
		ButtonGroup bg = new ButtonGroup();
		jr1 = new JRadioButton("남성");
		jr2 = new JRadioButton("여성");
		jr1.setFont(f); 	jr2.setFont(f);
		bg.add(jr1); 	bg.add(jr2);
		jp22.add(jr1);   jp22.add(jr2);
		jp2.add(jp22);
		
		
		jc1 = new JCheckBox("스포츠");
		jc2 = new JCheckBox("영화");
		jc3 = new JCheckBox("독서");
		jc4 = new JCheckBox("기타");
		jc1.setFont(f); 	jc2.setFont(f); 	jc3.setFont(f); 	jc4.setFont(f);
		jp23.add(jc1); 	jp23.add(jc2);		jp23.add(jc3);		jp23.add(jc4);
		jp2.add(jp23);
		
		jcb =new JComboBox<String>();
		jcb.addItem("010"); jcb.addItem("02");	jcb.addItem("032"); jcb.addItem("031");
		jcb.setFont(f);
		jt_phone2 = new JTextField(8); 	jt_phone3 = new JTextField(8);
		jt_phone2.setFont(f); 	jt_phone3.setFont(f);
		
		jp24.add(jcb);		jp24.add(new JLabel("-")).setFont(f);;		jp24.add(jt_phone2);
		jp24.add(new JLabel("-")).setFont(f);		jp24.add(jt_phone3);
		jp2.add(jp24);
		
		jcb2 =new JComboBox<String>();
		jcb2.addItem("서울"); 		jcb2.addItem("경기도");		jcb2.addItem("강원도");		
		jcb2.addItem("충청도");		jcb2.addItem("경상도");		jcb2.addItem("전라도");
		jcb2.addItem("제주도");
		jcb2.setFont(f);
		jp25.add(jcb2);
		jp2.add(jp25);
		
		JButton jb = new JButton("확인");
		jb.setFont(f);
		jp26.add(jb);
		jp2.add(jp26);
		
		jb.addActionListener(this);
		
		con.add(jp2, BorderLayout.CENTER);
		
		setTitle("구성  실습");
		setSize(650,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s;
		System.out.println("성명 : " + jt_name.getText() );
		
		if(jr1.isSelected()) s = "남성";
		else s = "여성";
		System.out.println("성별 : " + s);
		
		s = "";
		if(jc1.isSelected()) s = s + jc1.getText() + "  ";
		if(jc2.isSelected()) s = s + jc2.getText() + "  ";
		if(jc3.isSelected()) s = s + jc3.getText() + "  ";
		if(jc4.isSelected()) s = s + jc4.getText() + "  ";
		System.out.println("취미 : " + s);
		
		s = (String) jcb.getSelectedItem();
		s = s + "-" + jt_phone2.getText();
		s = s + "-" + jt_phone3.getText();
		System.out.println("전화번호 : " + s);
		
		System.out.println("거주지역 : " + jcb2.getSelectedItem());
	}
	
}
public class Swing18Tver {

	public static void main(String[] args) {
		new Resume1();
	}

}

