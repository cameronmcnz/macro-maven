package com.mcnz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
To build an executable JAR file, run the following command in the same folder as the POM:

mvn clean install tomcat7:exec-war-only

NOTE: Before you run the executable jar, make sure Jenkins isn't running on port 8080. 
Also, make sure any other Tomcat instances you have started are stopped.
If port 8080 is in use, the JAR file will not start.

To run the executable file, run the following command in the same folder as the executable.jar file, which should be the \target subfolder:

mvn clean install tomcat7:exec-war-only

 */
@WebServlet(name = "playthegame", urlPatterns = { "/playthegame" })
public class NumberGuesserGame extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In play the game doGet");
		String textToDisplay = null;
		if (true) {
			textToDisplay = getWebpage().replace("Would you like to play a game?", "Game Under Construction");
			response.getWriter().append(textToDisplay);
			return;
		}

	}
	
	public static String getWebpage() {
		
		String page = "<html>\r\n"
				+ "   <head>\r\n"
				+ "      <title>The Number Guesser Game</title>\r\n"
				+ "      <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">"
				+ "   </head>\r\n"
				+ "   <body style=\"padding:50\">\r\n"
				+ "      <h3><font color=\"navy\">Would you like to play a game?</font></h3>\r\n"
				+ "      <p>Pick a number between <b>1</b> and <b>10</b>?\r\n"
				+ "      <p/>\r\n"
				+ "         <a href=\"playthegame?guess=1\" class=\"disabled btn btn\"> 1 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=2\" class=\"disabled btn btn\"> 2 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=3\" class=\"disabled btn btn\"> 3 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=4\" class=\"disabled btn btn\"> 4 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=5\" class=\"disabled btn btn\"> 5 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=6\" class=\"disabled btn btn\"> 6 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=7\" class=\"disabled btn btn\"> 7 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=8\" class=\"disabled btn btn\"> 8 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=9\" class=\"disabled btn btn\"> 9 </a> &nbsp;\r\n"
				+ "         <a href=\"playthegame?guess=10\" class=\"disabled btn btn\">10</a> &nbsp;\r\n"
				+ "      <div id=\"results\">The gameplay results will appear here.</div>\r\n"
				+ "   </body>\r\n"
				+ "</html>";
		return page;
	}
}
