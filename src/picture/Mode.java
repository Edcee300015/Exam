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
		tf=new JTextField();			//单行文本框
		pf=new JPasswordField();		//密码框
		rb=new JRadioButton();			//单选按钮
		tab=new JTable();				//表格
		ta=new JTextArea();				//多行文本域
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
		cb=new JCheckBox();				//复选按钮
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
