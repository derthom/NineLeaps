/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;

/**
 *
 * @author Derrick
 */
public class Employee
{
	private Connection con=null;
	private PreparedStatement pstmt=null;
	private ResultSet res=null;
    private String name;
    private String eid;
    private String desig;
    private String mana;
    
    public Employee()
    {
    	try
    	{
    		Class.forName("oracle.jdbc.drive.OracleDriver");
    		con=DriverManager.getConnection("jdbc:oracle:thin://@localhost/1521/XE","system","system");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        try
        {
        	pstmt=con.prepareStatement("insert into emp values(?,?,?,?)");
        	pstmt.setString(1,name);
        	pstmt.setString(2, eid);
        	pstmt.setString(3,desig);
        	pstmt.setString(4,mana);
        	res=pstmt.executeQuery();
        	}
        catch(Exception f)
        {
        	f.printStackTrace();
        }
        
    }
    public String getName()
    {
        return name;
    }
    public String getEid()
    {
        return eid;
    }
    public String getDesig()
    {
        return desig;
    }
    public String getMana()
    {
        return mana;
    }
    public Employee(String name,String eid,String desig,String mana)
    {
        this.name=name;
        this.eid=eid;
        this.desig=desig;
        this.mana=mana;
    }
}