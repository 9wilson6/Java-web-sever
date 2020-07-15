Name: Abhinav Goud Gilakathula 
ID:999900841

App Name: Java_Web_Server

IDE used: The application is developed in Netbeans IDE 
Dependencies: No external packages required.


Description: To start the server on particular port, ServerSocket(int port) constructor is used. Once the actual socket is created on particular port we have to check for incoming requests on the initialized port continuously till the server is running . Client on entering the resource as String in web browser sends this request to the server which has to be parsed, so as to understand what response should be given back (eg: http://localhost:32000). Implementation of web server is done at a very basic level as the core objective of this project was to understand how requests and responses are parsed in client-server architecture. Thus the code written will only work on static html 1.0 webpages. 


App execution: In order to test the application, several html files including; index.html, default.html and page2.html have been created. these files are within the pages directory included in this application directory. more pages can be created here and accessed on the server. by default the default.html file is loaded if no particular file is requested by the client as well in cases where the requested file isn't available in the server.



Technology: Java Socket Programming, Multithreading, Client-Server Architecture

