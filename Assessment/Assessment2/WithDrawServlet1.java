package com.vastpro.SecondExercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WithDrawServlet1
 */
@WebServlet("/WithDrawServlet1")
public class WithDrawServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int basic=25000;
       
    /**
     * @see HttpServlet#HttpServlet()
    // */
   public WithDrawServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubpublic static int basic=25000;
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
//		pw.print("<body>\n"
//				+ "<form>\n"
//				+ "<table>\n"
//				+ "<tr><td>AMOUNT:<input type=\"text\" name=\"withdrawamount\" placeholder=\"enter the withdraw amount\"/></td></tr>\n"
//			    + "<tr><td><input type=\"submit\" value=\"proceed\" formaction=\"WithDrawServlet1\">\n"
//				+ "</table>\n"
//				+ "\n"
//				+ "\n"
//				+ "</form>\n"
//				+ "\n"
//				+ "</body>");
	
		String withDrawAmounts=request.getParameter("withdrawamount");
		int a= Integer.parseInt(withDrawAmounts);
	if(basic >= a)
	{
		pw.print("amount is available \n");
		pw.print("your withdraw amount is : " + a);
		pw.print("<form><input type='hidden' name='withdra'  value=' "+a +"'/>");
		pw.print("<input type='submit' value='checkbalance' formaction='BalanceServlet1'/>");
		pw.print("<input type='submit' value='goback' formaction='Atmfront1.html'/></form>");
	
	}
	else
	{
		pw.print("unavaliable amount");
	}
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
