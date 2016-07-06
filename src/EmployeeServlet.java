/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Derrick
 */
public class EmployeeServlet extends HttpServlet {
	private String name1;
    private String eid1;
    private String desig1;
    private String mana1;
    
    Employee e=new Employee();

    
	
	public void Service(HttpServletRequest x,HttpServletResponse y)
	{
	
    try
    {
    
    name1=e.getName();
    eid1=e.getEid();
    desig1=e.getDesig();
    mana1=e.getMana();
    HttpSession hs=x.getSession(true);
    hs.setAttribute("NAME", name1);
    hs.setAttribute("EID",eid1);
    hs.setAttribute("DESIG",desig1);
    hs.setAttribute("MANA",mana1);
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
	}
    
}
