package picture;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mode {
	private JButton button;
	private JLabel lab;
	private JTextField tf;
	private JPasswordField pf;
	private JCheckBox cb;
	private JRadioButton rb;
	private JTable tab;
	private JTextArea ta;
	
	public Mode() {
		tf=new JTextField();			//�����ı���
		pf=new JPasswordField();		//�����
		rb=new JRadioButton();			//��ѡ��ť
		tab=new JTable();				//���
		ta=new JTextArea();				//�����ı���
	}	
	
	public JButton setbutton(String str,int x,int y,int a,int b,Font font) {
		button=new JButton(str);
		button.setToolTipText(str);
		button.setLocation(x,y);
		button.setSize(a,b);
		return button;
	}
	
	public JLabel setlab(String str,int x,int y,int a,int b,Font font) {
		lab=new JLabel(str);
		lab.setLocation(x,y);
		lab.setSize(a, b);
		lab.setFont(font);
		return lab;
	}
	
	public JCheckBox setcb(int x,int y,int w,int h) {
		cb=new JCheckBox();				//��ѡ��ť
		cb.setLocation(x, y);
		cb.setSize(w,h);
		return cb;
	}
	
	public JRadioButton setrb(int x,int y,int w,int h) {
		rb=new JRadioButton();
		rb.setLocation(x,y);
		rb.setSize(w, h);
		
		return rb;
	}
	
	public JTextArea setta(int x,int y,int w,int h,Font font) {
		ta.setLocation(x,y);
		ta.setSize(w, h);
		ta.setFont(font);
		return ta;
	}
	
	public JTable setta1(int x,int y,int w,int h,Font font) {
		tab.setLocation(x, y);
		tab.setSize(w, h);
		tab.setFont(font);
		return tab;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
