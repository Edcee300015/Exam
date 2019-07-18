package picture;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RuleFrame {
	
	public JFrame window;

	public RuleFrame() throws Exception {
		window=new JFrame();
		init();
	}
	
	public void init() throws IOException {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("øº ‘πÊ‘Ú");
		label.setLocation(210,10);
		label.setSize(320, 80);
		label.setFont(new Font("Œ¢»Ì—≈∫⁄",1,40));
		panel.add(label);
		
		JTextArea ja = new JTextArea();
		ja.setLocation(23, 80);
		ja.setSize(550, 260);
		ja.setFont(new Font("Œ¢»Ì—≈∫⁄",1,15));
		panel.add(ja);
		
		String path=RuleFrame.class.getResource("rule.txt").getFile();
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(path),"GBK"));
		
				String str1=br.readLine();
				String str2=br.readLine();
				String str3=br.readLine();
				String str4=br.readLine();
				String str5=br.readLine();
				String str6=br.readLine();
				String str7=br.readLine();
				String str8=br.readLine();
				String str9=br.readLine();
				String str10=br.readLine();
				Rule rule = new Rule(str1,str2,str3,str4,str5,str6,str7,str8,str9,str10);
				ja.setText(rule.toString());				
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			br.close();
			e.printStackTrace();
		}
		
		ja.setLineWrap(true);
		window.add(panel);
		window.setSize(600,400);
		window.setTitle("÷∏’Î–≈œ¢‘⁄œﬂ≤‚∆¿");
		//window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
	}

	public JFrame getWindow() {
		return window;
	}

	public void setWindow(JFrame window) {
		this.window = window;
	}
	
//	public static void main(String args[]) throws Exception {
//		RuleFrame rf = new RuleFrame();
//		rf.init();
//	}
	
	
}
