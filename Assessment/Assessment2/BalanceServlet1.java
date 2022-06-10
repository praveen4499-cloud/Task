package com.vastpro.SecondExercise;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BalanceServlet1
 */
@WebServlet("/BalanceServlet1")
public class BalanceServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//int balance=500;
	public static int basic=25000;
       
    /**
     * @see HttpServlet#HttpServlet()
     *///		 balance=basic-a;
	
    public BalanceServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		double balance=0;
         PrintWriter pw = response.getWriter();
		String wd=request.getParameter("withdra");
	double b= Double.parseDouble(wd);
		//pw.print(withdraw);
		 balance=basic-b;
		pw.print("your balance is " + balance);
		//pw.print(b);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
