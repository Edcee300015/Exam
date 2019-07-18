package picture;

import topic.MY;

public class End {
	private MY my;
	private ExamFrame ef;
	private Integer score;
	
	public End() {
		score=0;
		my=my;
		ef=ef;
		init();
	}
	
	public void init() {
		int m=1;
		for(int i=1;i<=10;i++) {
			int[] n=my.getAllNum();
			String trueAnswer=my.map.get(i).get(n[--i]).getAnswer();
			String answer=ef.getMap().get(m++);
			if(trueAnswer.equals(answer)) {
				score=score+5;
			}
			
		}
		
	}
		
	

	public MY getMy() {
		return my;
	}

	public void setMy(MY my) {
		this.my = my;
	}

	public ExamFrame getEf() {
		return ef;
	}

	public void setEf(ExamFrame ef) {
		this.ef = ef;
	}
	
	
	
}
