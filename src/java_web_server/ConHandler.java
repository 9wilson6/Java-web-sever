/**
 *
 * @author name: Abhinav Goud Gilakathula 
 * @ author id: 999900841
 */
package java_web_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConHandler extends Thread{
    
    Socket s;
	
	   PrintWriter pw;
	
	   BufferedReader br;
	
	public ConHandler(Socket s) throws Exception{
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		pw = new PrintWriter(s.getOutputStream());
	}
	
	public void run(){
		try{
		
			String reqS = "";
		
			while(br.ready() || reqS.length() == 0){
				reqS += (char)br.read();
			}
			
			System.out.println(reqS);
		
			//Passing the request String to Request class for processing
			HttpReq req = new HttpReq(reqS);
		
			//Sending Request Object to HttpResponse Class
			HttpRes res = new HttpRes(req);
			
			//write the final output to pw
			pw.write(res.res.toCharArray());
			
			pw.close();
			br.close();
			s.close();
			
		}catch(Exception e){
			
		}
		
	}	
    
}
