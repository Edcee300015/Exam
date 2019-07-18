package picture;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	private JFrame window;
	private ClientContext clientContext;
	
	public LoginFrame() {
		window=new JFrame();
		init();
	}
	
//	public static void main(String args[]) {
//		LoginFrame p = new LoginFrame();		
//	}
		
	public void init() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		

		Icon icon=new ImageIcon("D:/code1/Exam/src/picture/ty.jpg.jpg");
		JLabel l=new JLabel();
		icon=new ImageIcon("D:/code1/Exam/src/picture/ty.jpg.jpg");     //�ڴ�ֱ�Ӵ�������,ע��Ŀ¼֮��ķָ�����˫б��
		l.setIcon(icon);
		l.setBounds(6, 0, icon.getIconWidth(),icon.getIconHeight());
			
	
		
		panel.add(creatLabel("����ϵͳ",245,20,400,60,new Font("΢���ź�",1,20)));
		panel.add(creatLabel("�˺ţ�",150, 90,50,50,new Font("΢���ź�",1,15))); 
		panel.add(creatLabel("���룺",150, 160,50,50,new Font("΢���ź�",1,15))); 
		JButton login=creatButton("Login",150,280,100,30);
		panel.add(login); 
		JButton cancel=creatButton("Cancel",330,280,100,30);
		panel.add(cancel); 
		idField=creatTextField(200,100,200,30);
		panel.add(idField);
		pwdField=creatPasswordField(200,170,200,30);
		panel.add(pwdField);
		panel.add(l,new Integer(Integer.MAX_VALUE));
		window.add(panel);
		window.setSize(600,400);
		window.setTitle("����ϵͳ");
		window.setResizable(false);
		window.setLocationRelativeTo(null);
//		window.setVisible(true);
		
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int option=JOptionPane.showConfirmDialog(window, "ȷ���˳���");
				if(option==JOptionPane.YES_OPTION) {
					System.exit(0);
				}else {
					window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
		
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientContext.login();
			}
			
		});
		
	}

	private JPasswordField creatPasswordField(int x,int y,int width,int height) {
		JPasswordField pf = new JPasswordField();
		pf.setLocation(x, y);
		pf.setSize(width, height);		
		return pf;
//		new String(pf.getPassword());
	}
	private JTextField creatTextField(int x,int y,int width,int height) {
		JTextField jf = new JTextField();
		jf.setLocation(x, y);
		jf.setSize(width, height);		
		return jf;
	}

	public JFrame getWindow() {
		return window;
	}

	public void setWindow(JFrame window) {
		this.window = window;
	}

	private JButton creatButton(String str,int x,int y,int width,int height) {
		JButton button = new JButton(str);
		button.setLocation(x, y);
		button.setSize(width, height);		
		return button;
	}

	private JLabel creatLabel(String str,int x,int y,int width,int height,Font font) {
		JLabel label = new JLabel(str);
		label.setLocation(x, y);
		label.setSize(width, height);
		label.setFont(font);
		return label;
	}
	
	private JTextField idField;

	private JPasswordField pwdField;

	private JLabel message;
	
	public int getUserId() {
		return Integer.parseInt(idField.getText());
	}

	public String getUserPassWord() {
		char[] pwd = pwdField.getPassword();
		return new String(pwd);
	}

	public void showMessage(String message) {
//		this.message.setText(message);
	}

	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
	}
}
