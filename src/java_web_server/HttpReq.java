/**
 *
 * @author name: Abhinav Goud Gilakathula 
 * @ author id: 999900841
 */
package java_web_server;

public class HttpReq {
    String filename;

	public HttpReq(String request) {
		
		//level one splitting 
		String lines[] = request.split("\n"); 
		
		System.out.println(lines[0]);
		
		//level two spliting
		filename = lines[0].split(" ")[1];
		
		System.out.println(filename);
				
	}
}
