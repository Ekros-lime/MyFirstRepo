package EndTerm;

public class Question {
	private int _answer;
	private String[] _questions = new String[5];
	
	public Question() {
		this._questions[0] = "describe";
		this._questions[1] = "A:option1";
		this._questions[2] = "B:option2";
		this._questions[3] = "C:option3";
		this._questions[4] = "D:option4";
		this._answer = 0;
	}
	
	public Question(String d, String q1, String q2, String q3, String q4, int a) {
		this._questions[0] = d;
		this._questions[1] = q1;
		this._questions[2] = q2;
		this._questions[3] = q3;
		this._questions[4] = q4;
		this._answer = a;
	}
	
	public void setQuestion(String d, String q1, String q2, String q3, String q4, int a) {
		this._questions[0] = d;
		this._questions[1] = q1;
		this._questions[2] = q2;
		this._questions[3] = q3;
		this._questions[4] = q4;
		this._answer = a;
	}
	
	public void printQuestions() {
		for(int i = 0; i < this._questions.length; i++) {
			System.out.println(this._questions[i]);
		}
		System.out.print("请输入答案： ");
	}
	
	public String getAnsower() {
		switch(this._answer) {
			case 0:
				return "A";
			case 1:
				return "B";
			case 2:
				return "C";
			case 3:
				return "D";
			default:
				return "没有找到答案";
		}
	}
	
	public boolean judge(String a) {
		int answer = -1;
		if(a.matches("[a|A]")) {
			answer = 0;
		}
		else if(a.matches("[b|B]")) {
			answer = 1;
		}
		else if(a.matches("[c|C]")) {
			answer = 2;
		}
		else if(a.matches("[d|D]")) {
			answer = 3;
		}
		return answer == this._answer?true:false;
	}
}
