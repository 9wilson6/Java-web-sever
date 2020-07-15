/**
 *
 * @author Abhinav Goud Gilakathula 
 * @ author id999900841
 */
package java_web_server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HttpRes {
    HttpReq req ;
	
	String res;
	
//	String root = "E:/root";
        String root = "./pages";

	
	
	public HttpRes(HttpReq req) {
		// TODO Auto-generated constructor stub
		this.req = req;
		
		File file = new File(root + req.filename);
                if(file.length()==0){
                    file = new File(root + "/default.html");
                }
                
		try{
			//To read the file for sending res
			FileInputStream fis = new FileInputStream(file);

                        res = "HTTP/1.1 200 \r\n"; 
			res  += "Server: Java Server/1.0 \r\n";
			res += "Content-Type: text/html \r\n"; 
			res += "Connection: close \r\n";
			res += "Content-Length: "+file.length() + " \r\n"; 
			res += "\r\n"; 
			
			int s;
			//Reading Html File..........
			while ( (s = fis.read()) != -1){
				res += (char)s;
			}			
		}catch(FileNotFoundException e){
			// 404 error if file not found 
			res = res.replace("200", "404");			
		}catch(Exception e){
			//500 error for any other internal sever error
			res = res.replace("200", "500");		
		}		
	}
}
