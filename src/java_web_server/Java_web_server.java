/**
 *
 * @author name: Abhinav Goud Gilakathula 
 * @ author id: 999900841
 */
package java_web_server;

import java.net.ServerSocket;
import java.net.Socket;

public class Java_web_server {

   //class makes server
	   ServerSocket serverSocket;
	
	//main method
	public static void main(String[] args) throws Exception {
		/*
		 *	This is equivalent to  
		 * Java_web_server java_web_server = new Java_web_server();
		 * Java_web_server.runServer();
		*/
		new Java_web_server().runServer();	
		
	}
	
	public void runServer() throws Exception{
		System.out.println("Server Started");
		serverSocket = new ServerSocket(32000);
		acceptRequests();
	}
	
	private void acceptRequests() throws Exception{
		while(true){
			Socket socket = serverSocket.accept();
			
			ConHandler conHandler = new ConHandler(socket);
			
			conHandler.start();			
		}
	}
    
}
