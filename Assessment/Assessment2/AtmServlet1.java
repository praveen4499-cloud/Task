package com.vastpro.SecondExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AtmServlet1
 */
@WebServlet("/AtmServlet1")
public class AtmServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	HashMap<String, String> hm =new  HashMap<String, String>();
    public AtmServlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
    
	
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String cardnumber= request.getParameter("number");
		String cardpin= request.getParameter("pin");
		
		
		
			
		
	    if(Pattern.matches("[0-9]{16}",cardnumber) && (Pattern.matches("[0-9]{4}", cardpin)))
		{
			
			pw.print("valid account number\n");
			//pw.print("accept the number ="+cardnumber+"\n");
			//pw.print("accept the pin ="+ cardpin+"\n");
			
			//pw.print("<table><tr><td><input type=\"submit\" value=\"withdraw\" formaction=\"WithDrawServlet1\"/>");
			//pw.print("<tr><td><input type=\"submit\" value=\"Balance\" formaction=\"BalanceServlet1\"/></table>");
			pw.println("--------------");
			pw.print("<a href='With.html'> <input type='submit' value='withdraw'/></a>");
			
			pw.print("<a href='CheckbookServlet'> <input type='submit' value=' checkbookrequest'/></a>");
			
			
		}
		else
		{
			pw.print("invalid");
			//throw new Invalidcard("invalid cardnumber");
			
			
			
		}
		
		}
		
		
		}
	


