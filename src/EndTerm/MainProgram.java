package EndTerm;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class MainProgram {
	//用于储存用户数据
	public static List<User> users = new ArrayList<User>();
	public static List<Question> questions = new ArrayList<Question>();
	public static void main(String[] args) {
		Question question1 = new Question();
		Question question2 = new Question();
		Question question3 = new Question();
		questions.add(question1);
		questions.add(question2);
		questions.add(question3);
		registerAndLog();
	}
	//注册与登录界面操作
	private static void registerAndLog() {
		Scanner operInput = new Scanner(System.in);
		while(true) {
			System.out.print("输入\"register\"注册或输入\"log\"登录: ");
			String temp = operInput.next();
			if(temp.equals("register")) {
				register();
				continue;
			}
			else if(temp.equals("log")) {
				log();
				break;
			}
			else {
				System.out.print("未识别到正确的输入，请重新");
				continue;
			}
		}
		return;
	}
	//进行注册
	private static void register() {
		Scanner operInput = new Scanner(System.in);
		boolean flag = false;
		User newUser = new User();
		System.out.print("请输入用户名(如要退出操作，请输入\"back\"): ");
		String temp = operInput.next();
		if(temp.equals("back")) {
			return;
		}
		for(User tempUser : users) {
			if(temp.equals(tempUser.getUserName())) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			newUser.setUserName(temp);
			System.out.print("请输入密码(如要退出操作，请输入\"back\"): ");
			temp = operInput.next();
			if(temp.equals("back")) {
				return;
			}
			newUser.setPassWord(temp);
			users.add(newUser);
		}
		else {
			System.out.println("该用户名已被注册，请重新注册或登录");
		}
		return;
	}
	//进行登录
	private static void log() {
		Scanner operInput = new Scanner(System.in);
		int i;
		//查找输入的用户名是否已经注册
		while(true) {
			i = 0;
			System.out.print("请输入用户名(如要退出操作，请输入\"back\"): ");
			String temp = operInput.next();
			if(temp.equals("back")) {
				registerAndLog();
				return;
			}
			for(User tempUser : users) {
				if(tempUser.getUserName().equals(temp)) {
					break;
				}
				i++;
			}
			if(i < users.size()) {
				break;
			}
			else {
				System.out.print("未注册的用户名，");
				continue;
			}
		}
		//检查输入的密码是否与输入的用户名匹配
		while(true) {
			System.out.print("请输入密码(如要退出操作，请输入\"back\"): ");
			String temp = operInput.next();
			if(temp.equals("back")) {
				registerAndLog();
				return;
			}
			if(temp.equals(users.get(i).getPassWord())) {
				mainInterface();
				break;
			}
			else {
				System.out.print("密码错误,");
				continue;
			}
		}
		return;
	}
	//主界面操作
	private static void mainInterface() {
		Scanner operInput = new Scanner(System.in);
		while(true) {
			System.out.print("请输入\"study\"进行学习或输入\"answer\"进行答题: ");
			String temp = operInput.next();
			if(temp.equals("study")) {
				study();
				break;
			}
			else if(temp.equals("answer")){
				answer();
				break;
			}
			else {
				continue;
			}
		}
		return;
	}
	//学习模块
	private static void study() {
		System.out.print("start to study");
	}
	//答题模块
	private static void answer() {
		System.out.print("start to answer");
		Scanner operInput = new Scanner(System.in);
		String temp;
		for(Question tempQuestion : questions) {
			tempQuestion.printQuestions();
			temp = operInput.next();
			if(temp.matches("[abcdABCD]")) {
				if(tempQuestion.judge(temp)) {
					System.out.println("回答正确");
				}
				else {
					System.out.println("回答错误正确答案是" + tempQuestion.getAnsower());
				}
			}
			else {
				System.out.println("输入答案格式错误");
			}
		}
	}
}
