package EntityContext;

public class User {
	private Integer Id;
	private String name;
	private String passWord;
	private String num;
	private String email;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", passWord=" + passWord + ", num=" + num + ", email=" + email
				+ "]";
	}
	public User() {
		super();
	}
	
	
	
}
