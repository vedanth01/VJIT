package webPack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.sql.*;

public class DemoServlet8 extends HttpServlet 
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	
		int v1	  = Integer.parseInt(request.getParameter("eid"));
		String v2 = request.getParameter("ename");
		String v3 = request.getParameter("gen");
		int v4    = Integer.parseInt(request.getParameter("job"));
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url="jdbc:oracle:thin:@localhost:1521:XE";
			
			Connection con = DriverManager.getConnection(url,"system","root");
			
			PreparedStatement pst = con.prepareStatement("Insert into emp1 values(?,?,?,?)");
			
			pst.setInt(1, v1);
			pst.setString(2, v2);
			pst.setString(3, v3);
			pst.setInt(4, v4);
			
			pst.executeUpdate();
			out.println("Employee info is stored");
			
			pst.close();
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
}