package client.view;

import java.util.Scanner;

import client.net.SimpleClient;

public class CmdView {
		public void run() {
			boolean flag = true;
			while(flag) {
				display();
				int n = input();
				flag = process(n);
			}
		}
	
	private void display() {
		System.out.println("���ݿ���С����");
		System.out.println("1.�˽�������Ϣ");
		System.out.println("2.���ݵ���Ҫ��");
		System.out.println("0.Exit");
	}
	
	private int input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
		
	private boolean process(int n) {
		boolean flag = true;
		if(n==1) {
			String intro = getIntro();
			System.out.println("��������"+intro);
		}
		else if(n==2) {
			
		}
		else if(n==0) {
			flag = false;
		}
		else {
			System.out.println("����0~2֮����ѡ��");
		}
		return flag;
	}
	
	private String getIntro() {
		String code = "A01";
		String commandStr = getCommandName(code);
		SimpleClient sc = new SimpleClient("127.0.0.1",4330,commandStr);
		String responseStr = sc.run();
		return responseStr;
	}

	private String getCommandName(String code) {
		System.out.println("�������������ƣ�");
		Scanner na = new Scanner(System.in);
		String Na= na.nextLine();
		String result = code + "-" + Na;
		
		return result;
	}
	

}
		

