package Server.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import Server.parser.Parser;

public class ToothServer implements Runnable{
	Socket socket = null;
	public ToothServer(Socket socket) {
		this.socket = socket;
	}
	private void service() {
		
		try {
		DataInputStream in = new DataInputStream(socket.getInputStream());
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		
		String requestStr = in.readUTF();
		System.out.println("server get message:"+requestStr);
		
		String responseStr = getResponseStr(requestStr);//"ÑÀ³Ý";
		out.writeUTF(responseStr);
		//System.out.println("server response:"+responseStr);
		
		in.close();
		out.close();
	 }catch(IOException e) {
		e.printStackTrace();}
	}
	
	
	private String getResponseStr(String requestStr) {
		// TODO Auto-generated method stub
		Parser par = new Parser();
		return par.run(requestStr);
	}

	
	public void run(){
		service() ;
	}
	
}
