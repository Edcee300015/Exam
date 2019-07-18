package picture;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;

import topic.MY;
import topic.Question20;

public class ExamFrame{
	private JFrame window;
	private ClientContext clientContext; 
	private MY my;
	private JTable table;
	private JLabel lab;
	private JTextArea ta;
	private Controller controller;
	private JLabel lab1;
	private Integer i;
	private String nn;
	private Map<Integer,String> map;
	private JLabel bb1;
	private JLabel clock;
	private Question20 question20;
	private JCheckBox A;
	private JCheckBox B;
	private JCheckBox C;
	private JCheckBox D;
	private Map<Integer,Boolean> mm1;
	private Map<Integer,Boolean> mm2;
	private Map<Integer,Boolean> mm3;
	private Map<Integer,Boolean> mm4;
	
	public ExamFrame() {
		window=new JFrame();
		map=new HashMap<Integer,String>();
		mm1=new HashMap<Integer,Boolean>();
		mm2=new HashMap<Integer,Boolean>();
		mm3=new HashMap<Integer,Boolean>();
		mm4=new HashMap<Integer,Boolean>();
		nn=null;
		for(int n=0;n<20;n++) {
			mm1.put(n, false);
			mm2.put(n, false);
			mm3.put(n, false);
			mm4.put(n, false);
		}
		i=0;
		init();
	}
	
	public void init(){
		JPanel panel=new JPanel();
		panel.setLayout(null);
		window.add(panel);
		
		Mode m=new Mode();
		
		Font font=new Font("微软雅黑",1,20);
		panel.add(m.setlab("指针在线测评系统",430,20, 320, 80,new Font("微软雅黑",1,40)));
		lab=m.setlab("姓名：XXX",50,30,200,200,font);
		panel.add(lab);
		bb1=m.setlab("编号：XXXX",250,30,200,200,font);
		panel.add(bb1);
		panel.add(m.setlab("考试时间：10分钟",400,30,200,200,font));
		panel.add(m.setlab("考试科目：javaSE阶段测试1",650,30,300,200,font));
		panel.add(m.setlab("题目数量：20",950,30,200,200,font));
		lab1=m.setlab(null,100,550,200,200,font);
		panel.add(lab1);
		clock=m.setlab("剩余时间：XX-XX",1000,550,200,200,font);
		panel.add(clock);		
		panel.add(m.setlab("A：",400,575,60,60,new Font("微软雅黑",1,30)));
		panel.add(m.setlab("B：",500,575,60,60,new Font("微软雅黑",1,30)));
		panel.add(m.setlab("C：",600,575,60,60,new Font("微软雅黑",1,30)));
		panel.add(m.setlab("D：",700,575,60,60,new Font("微软雅黑",1,30)));
		JButton up=m.setbutton("上一题",400,650,100,30,new Font("微软雅黑",1,30));
		panel.add(up);
		JButton down=m.setbutton("下一题",550,650,100,30,new Font("微软雅黑",1,30));
		panel.add(down);
		JButton over=m.setbutton("交卷",700,650,100,30,new Font("微软雅黑",1,30));
		panel.add(over);
		A =m.setcb(450,600,20,20);
		//A.setLabel("A:");.setSelected(true);
		A.setSelected(false);
		mm1.put(i, A.isSelected());
		panel.add(A);
		B=m.setcb(550,600,20,20);
		B.setSelected(false);
		mm2.put(i, B.isSelected());
		panel.add(B);
		C=m.setcb(650,600,20,20);
		C.setSelected(false);
		mm3.put(i, C.isSelected());
		panel.add(C);
		D=m.setcb(750,600,20,20);
		D.setSelected(false);
		mm4.put(i, D.isSelected());
		panel.add(D);
		ta=m.setta(50, 150, 1100, 400,new Font("微软雅黑",1,40));
		ta.setLineWrap(true);
		panel.add(ta);
		
		
		down.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				++i;
				if(i==20) {
					i=19;
				}
				
				ta.setText(my.qq.get(i).toString());
				updateView2();
				boolean aa=A.isSelected();
				boolean bb=B.isSelected();
				boolean cc=C.isSelected();
				boolean dd=D.isSelected();
				clientContext.exam(aa,bb,cc,dd,i);
			}
			
		});
		
		up.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				--i;
				if(i== -1) {
					i=0;
				}
				ta.setText(my.qq.get(i).toString());
				updateView2();
				boolean aa=A.isSelected();
				boolean bb=B.isSelected();
				boolean cc=C.isSelected();
				boolean dd=D.isSelected();
				clientContext.exam(aa,bb,cc,dd,i);
				//updateView6();
			}
			
		});
		
		A.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				nn="A";
		
				boolean a=A.isSelected();
				mm1.put(i, a);
			}
			
		});
		B.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				nn=nn+"B";
				boolean b=B.isSelected();
				mm2.put(i, b);
			}
			
		});
		C.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				nn=nn+"c";
				boolean c=C.isSelected();
				mm3.put(i, c);
			}
			
		});
		D.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				nn=nn+"D";
				boolean d=D.isSelected();
				mm4.put(i, d);
			}
			
		});
		over.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean aa=A.isSelected();
				boolean bb=B.isSelected();
				boolean cc=C.isSelected();
				boolean dd=D.isSelected();
				clientContext.theEnd(aa, bb, cc, dd, i);
			}
			
		});
		//question20.add(i, nn);
		//map.put(i, nn);     //存放每道题的得分
		//System.out.println(map);
		nn=null;
		//System.out.println(map.get(i));
//		Icon icon=new ImageIcon("D:/code1/Exam/src/picture/003.jpg");
//		JLabel l=new JLabel();
//		icon=new ImageIcon("D:/code1/Exam/src/picture/003.jpg");     //在此直接创建对象,注意目录之间的分隔符是双斜线
//		l.setIcon(icon);
//		l.setBounds(6, 0, icon.getIconWidth(),icon.getIconHeight());
//		panel.add(l,new Integer(Integer.MAX_VALUE));
		
		
		window.setSize(1200, 760);
		window.setTitle("指针信息在线测评");
		//window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);	
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int option=JOptionPane.showConfirmDialog(window, "确定退出吗？");
				if(option==JOptionPane.YES_OPTION) {
					System.exit(0);
				}else {
					window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
	}
	public void updateView(String message) {
		ta.setText(message);
	}

	public void setMy(MY my) {
		this.my = my;
	}

	public JFrame getWindow() {
		return window;
	}

	public void setWindow(JFrame window) {
		this.window = window;
	}

	public ClientContext getClientContext() {
		return clientContext;
	}

	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
	}

	public void updateView1(String name) {		
		lab.setText(name);
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	
	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public void updateView2() {
		lab1.setText("20个题目的第"+(i+1)+"题");
	}
	
	public void updateView3(int num) {
		bb1.setText("编号："+num);
	}
	
	public void updateView4(String name) {
		lab.setText("姓名："+name);
	}
	
	public void clock() {
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				DateFormat sdf = new SimpleDateFormat("mm:ss");
				long time=20*60*1001;
				while(time>0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					time -=1000;
					Date date = new Date(time);
					clock.setText("剩余时间："+sdf.format(date));
					clock.setForeground(Color.red);
					
				}
				
				
			}
			
		});	t.start();
	}
	
	public void updateView5(DateFormat df) {
	}

	public void setQuestion20(Question20 question20) {
		this.question20 = question20;
	}
	
	public void updateView6() {
		
		A.setSelected(mm1.get(i));
		B.setSelected(mm2.get(i));
		C.setSelected(mm3.get(i));
		D.setSelected(mm4.get(i));

	}
	
}
