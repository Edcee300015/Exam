package picture;

public class Rule {
	private String str1;
	private String str2;
	private String str3;
	private String str4;
	private String str5;
	private String str6;
	private String str7;
	private String str8;
	private String str9;
	private String str10;

	public Rule(String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10) {
		this.str1=str1;
		this.str2=str2;
		this.str3=str3;
		this.str4=str4;
		this.str5=str5;
		this.str6=str6;
		this.str7=str7;
		this.str8=str8;
		this.str9=str9;
		this.str10=str10;
	}

	@Override
	public String toString() {
		return str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5
				+ "\n" + str6 + "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 ;
	}
	
	
	
}
