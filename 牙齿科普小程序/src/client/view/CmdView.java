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
		System.out.println("牙齿科普小程序：");
		System.out.println("1.了解牙齿信息");
		System.out.println("2.牙齿的重要性");
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
			System.out.println("介绍如下"+intro);
		}
		else if(n==2) {
			
		}
		else if(n==0) {
			flag = false;
		}
		else {
			System.out.println("请在0~2之间做选择！");
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
		System.out.println("请输入牙齿名称：");
		Scanner na = new Scanner(System.in);
		String Na= na.nextLine();
		String result = code + "-" + Na;
		
		return result;
	}
	

}
		

