package com.sample.clientportal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sample.address.managment.MonitorAddressBeanLocal;

/**
 * Servlet implementation class AddressController
 */
public class AddressController extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private TempSessionLocal tempSessionLocal; 
	private MonitorAddressBeanLocal monitorAddressBeanLocal; 
    
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddressController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {  
    	super.init(config); 
    	try {  
    		Context context = new InitialContext();  
    		
    		
    		monitorAddressBeanLocal = (MonitorAddressBeanLocal) context.lookup("MonitorAddressBean/local");
    	//	Context context = new InitialContext();  
    	//	tempSessionLocal = (TempSessionLocal) context.lookup("TempSession/local"); 
    	}catch (NamingException e) { 
    		e.printStackTrace();  
    	}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	//	String result= addressProcessingBeanLocal.sayHello();
	//	String result= tempSessionLocal.sayHello();
		
	/*	String result= addressProcessingBeanLocal.AddCompany();
		boolean br = addressProcessingBeanLocal.updateCompany();
		System.out.println("update Company"+ br);
		String comName = addressProcessingBeanLocal.fetchCompany();
		System.out.println("fetch Company"+ comName);
		int size = addressProcessingBeanLocal.fetchAllCompany();
		System.out.println("fetch All Company"+ size); */
		
	//	String result= addressProcessingBeanLocal.addAddress();
		
	//	String result= addressProcessingBeanLocal.fetchActiveAddress();
		
		boolean result = monitorAddressBeanLocal.monitorURL("http://www.regis24.de/impressum.php");
		
		PrintWriter out = response.getWriter();
		if(result)
			out.println("There is New Address!");
		else
			out.println("It was old Address");
	}

}
