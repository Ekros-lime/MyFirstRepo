package EndTerm;

public class User {
	private String _userName;
	private String _passWord;
	
	public User() {
		this._userName = "userName";
		this._passWord = "passWord";
	}
	
	public void setUserName(String userName) {
		this._userName = userName;
	}
	
	public String getUserName() {
		return this._userName;
	}
	
	public void setPassWord(String passWord) {
		this._passWord = passWord;
	}
	
	public String getPassWord() {
		return this._passWord;
	}
}
