package Server.test;

import Server.net.SimpleServer;

public class TestServer {
	public static void main(String [] args) {
		SimpleServer ss = new SimpleServer();
		ss.run();
	}
}
