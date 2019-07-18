package EntityContext;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;



public class EntityContext {
	private static Map<Integer,User> Users=new HashMap<Integer,User>();
	
	public static void main(String args[]) throws Exception {
		EntityContext ec=new EntityContext();
		ec.loadUser();
		System.out.println(Users);

	}
	public EntityContext() {
		loadUser();
	}
	public void loadUser() {
		String path=EntityContext.class.getResource("user.txt").getFile();		
		BufferedReader br=null;
		String str=null;
		
		try {
			br=new BufferedReader(new InputStreamReader(new FileInputStream(path),"GBK"));
			while((str=br.readLine())!=null) {
				if(str.startsWith("#")||str.trim().equals("")) {
					continue;
				}
				String[] s=str.split(":");		
				User user=new User();
				
				user.setId(Integer.parseInt(s[0]));
				user.setName(s[1]);
				user.setPassWord(s[2]);
				user.setNum(s[3]);
				user.setEmail(s[4]);
				Users.put(user.getId(), user);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public User getUserById(int id) {
		//System.out.println(Users.get(id));
		return Users.get(id);
	}

	public Map<Integer, User> getUsers() {
		return Users;
	}

	public void setUsers(Map<Integer, User> users) {
		Users = users;
	}
	

}
