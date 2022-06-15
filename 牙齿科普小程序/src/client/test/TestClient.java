package client.test;

import client.view.CmdView;
import client.view.mainFrm;

public class TestClient{
	public static void main(String [] args) {
		run();
	}
	public static void run() {
		//CmdView cd = new CmdView();
		//cd.run();
		mainFrm cd=new mainFrm();
		cd.run();
	}
}