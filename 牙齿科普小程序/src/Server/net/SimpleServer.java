package Server.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import Server.parser.Parser;
import Server.thread.ToothServer;

public class SimpleServer {
	 public void run() {
		 ServerSocket server = null;
			Socket sockets = null;
			InetAddress iaddress = null;
			int port = 4330;
			try {
			 server = new ServerSocket(port); 
			System.out.println("Server started,waiting for request...");
		   }catch(IOException e) {
			   e.printStackTrace();
		   }
			
			while(true) {
				try {
					sockets = server.accept();
					
					Runnable tooServer =new ToothServer(sockets);
					Thread thd = new Thread(tooServer);
					thd.start();
					
					
				}catch(IOException e) {
					e.printStackTrace();}
			}			
	 }

	private String getResponseStr(String requestStr) {
		// TODO Auto-generated method stub
		Parser par = new Parser();
		return par.run(requestStr);
	}

}
