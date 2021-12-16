package EndTerm;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class MainProgram {
	//���ڴ����û�����
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
	//ע�����¼�������
	private static void registerAndLog() {
		Scanner operInput = new Scanner(System.in);
		while(true) {
			System.out.print("����\"register\"ע�������\"log\"��¼: ");
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
				System.out.print("δʶ����ȷ�����룬������");
				continue;
			}
		}
		return;
	}
	//����ע��
	private static void register() {
		Scanner operInput = new Scanner(System.in);
		boolean flag = false;
		User newUser = new User();
		System.out.print("�������û���(��Ҫ�˳�������������\"back\"): ");
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
			System.out.print("����������(��Ҫ�˳�������������\"back\"): ");
			temp = operInput.next();
			if(temp.equals("back")) {
				return;
			}
			newUser.setPassWord(temp);
			users.add(newUser);
		}
		else {
			System.out.println("���û����ѱ�ע�ᣬ������ע����¼");
		}
		return;
	}
	//���е�¼
	private static void log() {
		Scanner operInput = new Scanner(System.in);
		int i;
		//����������û����Ƿ��Ѿ�ע��
		while(true) {
			i = 0;
			System.out.print("�������û���(��Ҫ�˳�������������\"back\"): ");
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
				System.out.print("δע����û�����");
				continue;
			}
		}
		//�������������Ƿ���������û���ƥ��
		while(true) {
			System.out.print("����������(��Ҫ�˳�������������\"back\"): ");
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
				System.out.print("�������,");
				continue;
			}
		}
		return;
	}
	//���������
	private static void mainInterface() {
		Scanner operInput = new Scanner(System.in);
		while(true) {
			System.out.print("������\"study\"����ѧϰ������\"answer\"���д���: ");
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
	//ѧϰģ��
	private static void study() {
		System.out.print("start to study");
	}
	//����ģ��
	private static void answer() {
		System.out.print("start to answer");
		Scanner operInput = new Scanner(System.in);
		String temp;
		for(Question tempQuestion : questions) {
			tempQuestion.printQuestions();
			temp = operInput.next();
			if(temp.matches("[abcdABCD]")) {
				if(tempQuestion.judge(temp)) {
					System.out.println("�ش���ȷ");
				}
				else {
					System.out.println("�ش������ȷ����" + tempQuestion.getAnsower());
				}
			}
			else {
				System.out.println("����𰸸�ʽ����");
			}
		}
	}
}
