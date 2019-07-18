package topic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MY {
	public Map<Integer,List<Question>> map=new HashMap<Integer,List<Question>>();
	public List<Question> qq;
	private int[] allNum;
	private Question20 qu20;
	public Map<Integer,String> map20;
	private int num;
	private List<String> list20;
	
	
//	public static void main(String args[]) throws Exception {
//		MY my=new MY();
//		my.run();
//		my.showExam();
//	}
	public MY() throws Exception {
		map20=new HashMap<Integer,String>();
		num=0;
		run();
		showExam();
	}
		
	public void run() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\x64\\text\\corejava.txt")));
		while(true) {
			String str1=br.readLine();
			String str2=br.readLine();
			String str3=br.readLine();
			String str4=br.readLine();
			String str5=br.readLine();
			String str6=br.readLine();
			if(str1==null) {
				break;
			}
			
			String[] num=str1.split(",");
			String answer=num[0].substring(num[0].indexOf("=")+1);
			
				if(answer.equals("1")) {
					answer="A";
				}else if(answer.equals("2")) {
					answer="B";
				}else if(answer.equals("3")){
					answer="C";
				}else if(answer.equals("4")) {
					answer="D";
				}else if(answer.equals("1/2")) {
					answer="AB";
				}else if(answer.equals("1/3")) {
					answer="AC";
				}else if(answer.equals("1/4")) {
					answer="AD";
				}else if(answer.equals("2/3")) {
					answer="BC";
				}else if(answer.equals("2/4")) {
					answer="BD";
				}else if(answer.equals("3/4")) {
					answer="CD";
				}else if(answer.equals("1/2/3")) {
					answer="ABC";
				}else if(answer.equals("1/2/4")) {
					answer="A/B/D";
				}else if(answer.equals("2/3/4")) {
					answer="BCD";
				}
			
			
			int score=Integer.parseInt(num[1].substring(num[1].indexOf("=")+1));
			int level=Integer.parseInt(num[2].substring(num[2].indexOf("=")+1));
			
			Question q=new Question(str1,str2,str3,str4,str5,str6,answer,score,level);
			
			List<Question> list=map.get(level);
			if(list==null) {
				list=new ArrayList<Question>();
				list.add(q);
				map.put(level, list);
			}else {
				list.add(q);
				map.put(level, list);
			}
						
		}
	}
	public void showExam() {
		qq=new ArrayList<Question>();
		allNum=new int[20];//等级1~10中每个难度选两道题的顺序
		int mm=1;
		int n=0;
		for(int i=1;i<=10;i++) {
			int[] m=num(i);			
			int j1=m[0];
			int j2=m[1];
			Question num1=map.get(i).get(j1);
			int nn=num1.getStr1().indexOf(",");
			String answer=num1.getStr1().substring(8, nn);
			String an=answer(answer);
			
			//System.out.println(num1.getStr1());
			//System.out.println(answer);
			map20.put(mm++, an);
//			String answer1=map.get(i).get(j1).getStr2();
//			list20.add(answer1);
			Question num2=map.get(i).get(j2);
			int nnn=num2.getStr1().indexOf(",");
			String answer2=num2.getStr1().substring(8, nnn);
			String an2=answer(answer2);
			
			//System.out.println(num2.getStr1());
			//System.out.println(answer2);
//			String answer2=map.get(i).get(j2).getStr2();
//			list20.add(answer2);
			map20.put(mm++, an2);
			qq.add(num1);
			qq.add(num2);
			
			//System.out.println(qq.get(index));
//			System.out.println(num2);
		}
		//System.out.println(map20);
		//int index=(int)(Math.random()*20);
		//System.out.println(qq.get(index));
		//return qq.get(i++).toString();
//		return qq;
		//System.out.println(qq.get(1));
	}
	
	private void qu20(Question num1, String answer) {
		// TODO Auto-generated method stub
		
	}

	public Map<Integer, List<Question>> getMap() {
		return map;
	}

	public void setMap(Map<Integer, List<Question>> map) {
		this.map = map;
	}

	public List<Question> getQq() {
		return qq;
	}

	public void setQq(List<Question> qq) {
		this.qq = qq;
	}

	public int[] num(int i) {
		while(true) {
			int j1=(int)(Math.random()*(map.get(i).size()-1));
			int j2=(int)(Math.random()*(map.get(i).size()-1));
			if(j1!=j2) {
				int[] n=new int[2];
				n[0]=j1;
				n[1]=j2;				
				return n;
			}
		}
	}

	public int[] getAllNum() {
		return allNum;
	}

	public void setAllNum(int[] allNum) {
		this.allNum = allNum;
	}
	public void init() {
		list20=new ArrayList<String>();
//		list.add(answer);
		//list.add(UserAnswer);
//		map.put(num, list);
	}
	public void add(int i,String str) {
//		map.get(i).add(str);
	}

	public List<String> getList20() {
		return list20;
	}

	public void setList20(List<String> list20) {
		this.list20 = list20;
	}
	public String answer(String answer) {
		if(answer.equals("1")) {
			answer="A";
		}else if(answer.equals("2")) {
			answer="B";
		}else if(answer.equals("3")){
			answer="C";
		}else if(answer.equals("4")) {
			answer="D";
		}else if(answer.equals("1/2")) {
			answer="AB";
		}else if(answer.equals("1/3")) {
			answer="AC";
		}else if(answer.equals("1/4")) {
			answer="AD";
		}else if(answer.equals("2/3")) {
			answer="BC";
		}else if(answer.equals("2/4")) {
			answer="BD";
		}else if(answer.equals("3/4")) {
			answer="CD";
		}else if(answer.equals("1/2/3")) {
			answer="ABC";
		}else if(answer.equals("1/2/4")) {
			answer="A/B/D";
		}else if(answer.equals("2/3/4")) {
			answer="BCD";
		}
		return answer;
	}
	
}
