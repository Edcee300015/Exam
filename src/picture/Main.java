package picture;

import EntityContext.EntityContext;
import topic.MY;
import topic.Question20;

public class Main {
	public static void main(String args[]) throws Exception {
		ClientContext clientContext = new ClientContext();
		LoginFrame loginFrame = new LoginFrame();
		MenuFrame menuFrame = new MenuFrame();
		Controller controller = new Controller();
		ExamFrame examFrame=new ExamFrame();
		EntityContext entityContext=new EntityContext();
		MY my=new MY();
		RuleFrame ruleFrame = new RuleFrame();
		Question20 question20 = new Question20(0, null);
		OverFrame overFrame = new OverFrame();
		Score score = new Score();
		
		clientContext.setLoginFrame(loginFrame);
		clientContext.setMenuFrame(menuFrame);
		clientContext.setExamFrame(examFrame);
		loginFrame.setClientContext(clientContext);
		menuFrame.setClientContext(clientContext);
		examFrame.setClientContext(clientContext);
		clientContext.setController(controller);
		controller.setEntityContext(entityContext);
		clientContext.setMy(my);
		examFrame.setMy(my);
		examFrame.setController(controller);
		controller.setMy(my);
		clientContext.setRf(ruleFrame);
		clientContext.showMe();
		clientContext.setEntityContext(entityContext);
		examFrame.setQuestion20(question20);
		clientContext.setOverFrame(overFrame);
		clientContext.setScore(score);
	}
}
