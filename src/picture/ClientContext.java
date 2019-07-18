package picture;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import EntityContext.EntityContext;
import EntityContext.User;
import topic.MY;
import topic.Question;

public class ClientContext {
	public void setEntityContext(EntityContext entityContext) {
		this.entityContext = entityContext;
	}


	private LoginFrame loginFrame;
	private MenuFrame menuFrame;
	private ExamFrame examFrame;
	private EntityContext ec;
	private Controller controller;
	private MY my;
	private Integer id;
	private RuleFrame rf;
	private EntityContext entityContext;
//	private int score=0;
	private Map<Integer,String> map=new HashMap<Integer,String>();
	private OverFrame overFrame;
	private int scoreAll=0;
	private Score score;
	
	
	public void setOverFrame(OverFrame overFrame) {
		this.overFrame = overFrame;
	}


	public void login() {
		try {
			id=loginFrame.getUserId();
			String passWord=loginFrame.getUserPassWord();
		
			User loginUser=controller.login(id, passWord);

			menuFrame.updateView(loginUser.getName());
			loginFrame.getWindow().setVisible(false);
			menuFrame.getWindow().setVisible(true);
		}catch (IdOrPwdException e) {
			// 处理用户名/密码错误的异常提示
			loginFrame.showMessage(e.getMessage());
		} catch (NumberFormatException e) {
			// 处理用户名不合法异常
			loginFrame.showMessage("用户名不合法！");
		}
		
		
	}
	
	
	public void showMe() {
		loginFrame.getWindow().setVisible(true);
	}
	
	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame=loginFrame;
	}
	
	public void setMenuFrame(MenuFrame menuFrame) {
		this.menuFrame=menuFrame;
	}


	public void menu() {
//		int id=loginFrame.getUserId();
//		String passWord=loginFrame.getUserPassWord();
//		User loginUser=controller.login(id, passWord);
//		examFrame.updateView(loginUser.getName());
		//examFrame.updateView2(i);
		examFrame.updateView(controller.showMyExam());
		User name=entityContext.getUserById(id);
		examFrame.updateView3(id);
		examFrame.updateView4(name.getName());
		examFrame.updateView2();
		examFrame.clock();
		//examFrame.updateView1(my.map.get(id).get(1).toString());
		menuFrame.getWindow().setVisible(false);
		examFrame.getWindow().setVisible(true);
	}
	
	public void exam(boolean aa,boolean bb,boolean cc,boolean dd,int i) {
		examFrame.updateView6();
		String answer="";
		int num=i;
		
		boolean A=aa;
		boolean B=bb;
		boolean C=cc;
		boolean D=dd;
		if(A==true) {
			answer=answer+"A";
		}
		if(B==true) {
			answer=answer+"B";
		}
		if(C==true) {
			answer=answer+"C";
		}
		if(D==true) {
			answer=answer+"D";
		}
		map.put(num, answer);
		//System.out.println(map);
		int score=right(num);
		//System.out.println(score);
		
	}
	public void theEnd(boolean aa,boolean bb,boolean cc,boolean dd,int i) {
		examFrame.updateView6();
		String answer="";
		int num=i;
		
		boolean A=aa;
		boolean B=bb;
		boolean C=cc;
		boolean D=dd;
		if(A==true) {
			answer=answer+"A";
		}
		if(B==true) {
			answer=answer+"B";
		}
		if(C==true) {
			answer=answer+"C";
		}
		if(D==true) {
			answer=answer+"D";
		}
		map.put(num, answer);
		//System.out.println(map);
		int score=right(num);
		scoreAll=score;
		overFrame.updateView(scoreAll);
		examFrame.getWindow().setVisible(false);
		menuFrame.getWindow().setVisible(true);
		overFrame.getWindow().setVisible(true);
		//System.out.println(score);
		
		
	}
	public int right(int i) {
		int score=0;
		for(int h=1;h<=i;h++) {
			String str1=my.map20.get(h);
			//System.out.println(str1);
			String str2=map.get(h);
			//System.out.println(str2);
			if(my.map20.get(h).equals(map.get(h))){
				score=score+5;
			}
		}
		return score;
	}
	
	
	
	
	public void TrueOrFalse() {
//		for(int i=1;i<=20;i++) {
		int i=0;
			String ss=examFrame.getMap().get(i);  //每道题的选项
			for(int j=1;j<=10;j++) {
				List<Question> list=my.map.get(j);       //每个难度等级的题目
				int[] num=my.getAllNum();
				String str=list.get(num[i++]).getAnswer();
			}
		
	}
	
	

	
	public void rule() {
		rf.getWindow().setVisible(true);
	}


	public void setExamFrame(ExamFrame examFrame) {
		this.examFrame=examFrame;
		
	}


	public Controller getController() {
		return controller;
	}


	public void setController(Controller controller) {
		this.controller = controller;
	}


	public void setMy(MY my) {
		this.my = my;
	}


	public void setRf(RuleFrame rf) {
		this.rf = rf;
	}


	public void score() {
		
		score.getWindow().setVisible(true);
		score.updateView(scoreAll);
	}


	public void setScore(Score score) {
		this.score = score;
	}


	public Score getScore() {
		return score;
	}
	
}
