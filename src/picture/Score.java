package picture;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Score {
	private JFrame window;
	private JLabel score;
	
	
	public Score() {
		window=new JFrame();
		init();
	}
	
	public void init() {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		JLabel la=new JLabel();
		la.setText("���Է���");
		la.setLocation(210,20);
		la.setSize(400,60);
		la.setFont(new Font("΢���ź�",1,40));
		panel.add(la);
		
		
		score=new JLabel();
		score.setText("���Է���");
		score.setLocation(260,150);
		score.setSize(400,60);
		score.setFont(new Font("΢���ź�",1,40));
		panel.add(score);
		
		
		window.add(panel);
		window.setSize(600,400);
		window.setTitle("����ϵͳ");
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		//window.setVisible(true);
		
		
	}
	public JFrame getWindow() {
		return window;
	}

	public void setWindow(JFrame window) {
		this.window = window;
	}

	public static void main(String args[]) {
		new Score().init();
	}
	public void updateView(int n) {
		score.setText(String.valueOf(n));
	}
	
}
