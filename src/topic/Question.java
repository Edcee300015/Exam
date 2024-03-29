package topic;

import java.util.LinkedList;
import java.util.List;

public class Question {
	private String str1;
	private String str2;
	private String str3;
	private String str4;
	private String str5;
	private String str6;
	private Integer level;
	private String answer;
	private Integer score;
	
	public Question(String str1,String str2,String str3,String str4,String str5,String str6,String answer,int score,int level) {
		this.str1=str1;
		this.str2=str2;
		this.str3=str3;
		this.str4=str4;
		this.str5=str5;
		this.str6=str6;
		this.answer=answer;
		this.score=score;
		this.level=level;
	}

	public Question() {
		super();
	}



	@Override
	public String toString() {
		return str2 + "\nA:" + str3 + "\nB:" + str4 + "\nC:" + str5
				+ "\nD:" + str6 + "\n";
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public String getStr4() {
		return str4;
	}

	public void setStr4(String str4) {
		this.str4 = str4;
	}

	public String getStr5() {
		return str5;
	}

	public void setStr5(String str5) {
		this.str5 = str5;
	}

	public String getStr6() {
		return str6;
	}

	public void setStr6(String str6) {
		this.str6 = str6;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	

	
	
	
}
