package topic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question20 {
	private String answer;
	private String UserAnswer;
	private int num;
	private Map<Integer,List<String>> map;

	public Question20(int num, String answer) {
		super();
		this.num=num;
		this.answer = answer;
		UserAnswer=null;
		map=new HashMap<Integer,List<String>>();
		init();
	}

	public void init() {
		List<String> list=new ArrayList<String>();
		list.add(answer);
		//list.add(UserAnswer);
		map.put(num, list);
	}
	public void add(int i,String str) {
		map.get(i).add(str);
	}
	
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUserAnswer() {
		return UserAnswer;
	}
	public void setUserAnswer(String userAnswer) {
		UserAnswer = userAnswer;
	}


	
	
	
	
	
	
	
	
	
}
