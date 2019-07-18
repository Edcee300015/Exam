package picture;

import EntityContext.EntityContext;
import EntityContext.User;
import topic.MY;

public class Controller {
	
	private EntityContext entityContext;
	private ClientContext clientContext;
	private MY my;
	private Integer i;
	
	public Controller() {
		i=0;

	}
	
	public void setMy(MY my) {
		this.my = my;
	}

	public User login(int id,String passWord)throws IdOrPwdException  {
		User user = entityContext.getUserById(id);
		if(user==null) {
			//��ʾid����
			throw new IdOrPwdException("�û�������");
		}else if(!user.getPassWord().equals(passWord)) {
			//��ʾ�������
			throw new IdOrPwdException("�������");
		}else {
			return user;
		}
			//System.out.println(user);
	
		
	}

	public void setEntityContext(EntityContext entityContext) {
		this.entityContext = entityContext;
	}
	
	public String showMyExam() {

		String exam=my.qq.get(0).toString();
		return exam;
	}
	

}
