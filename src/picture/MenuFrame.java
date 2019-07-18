package picture;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuFrame{
	private JFrame window;
	private ClientContext clientContext;
	private static JLabel info;

	
	public MenuFrame() {
		window=new JFrame();

		init();
	}
	
		
	public void init(){
		JPanel panel=new JPanel();
		window.add(panel);
		panel.setLayout(null);
			
	
		Mode m=new Mode();
		panel.add(m.setlab("ָ����Ϣ���߲���ϵͳ", 400, 40,400, 50, new Font("΢���ź�",1,40)));
		info=m.setlab("XXXͬѧ��ã�", 530, 200, 200, 40, new Font("΢���ź�",1,20));
		panel.add(info);
		
		Font font=new Font("΢���ź�",1,20);
//		String path=MenuFrame.class.getResource("timg.jpg.gif").getFile();
//		File file=new File(path);
//		ImageIcon icon = new ImageIcon(path); //����ͼƬ
		
		JButton start=button("��ʼ",null, 220, 300, 150, 150,new Font("΢���ź�",1,20));
		//start.setIcon(icon);
		panel.add(start);
		JButton score=button("����",new ImageIcon("D:\\x64\\text\\timg (2)"), 420, 300, 150, 150,font);
		panel.add(score);		
		JButton rules=button("���Թ���",null, 620, 300, 150, 150,font);
		panel.add(rules);
		JButton move=button("�뿪",null, 820, 300, 150, 150,font);
		panel.add(move);		
		Font font1=new Font("΢���ź�",2,200);
		
		panel.getRootPane().setDefaultButton(start);
		
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clientContext.menu();
			}
			
		});
		rules.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clientContext.rule();
			}
			
		});
		score.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clientContext.score();
			}
			
		});
		move.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int option=JOptionPane.showConfirmDialog(window, "ȷ���˳���");
				if(option==JOptionPane.YES_OPTION) {
					System.exit(0);
				}else {
					window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			
			}
			
		});
			

		window.add(panel);
		window.setSize(1200,800);
		window.setTitle("ָ����Ϣ���߲���");
//		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
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
	}
	



	public static JLabel label(String str,int x,int y,int a,int b,Font font) {
		JLabel label=new JLabel(str);
		label.setLocation(x,y);
		label.setSize(a,b);
		label.setFont(font);
		return label;
	}
	
	public JButton button(String str,Icon icon,int x,int y,int a,int b,Font font) {
		JButton button = new JButton(str,icon);
		button.setLocation(x, y);
		button.setSize(a,b);
		button.setFont(font);
		return button;
		
	}
	
	
	public void setClientContext(ClientContext clientContext) {
		this.clientContext=clientContext;
	}
	
	public void updateView(String name) {
		info.setText(name+"ͬѧ��ã�");
	}


	public JFrame getWindow() {
		return window;
	}


	public void setWindow(JFrame window) {
		this.window = window;
	}


	
	
}
