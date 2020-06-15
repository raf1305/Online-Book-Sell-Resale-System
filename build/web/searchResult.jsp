<%-- 
    Document   : searchResult
    Created on : Dec 16, 2016, 8:00:18 PM
    Author     : sakhawat
--%>

<%@page import ="java.io.*"%>
<%@page import ="java.sql.Connection" %>
<%@page import ="java.sql.DriverManager" %>
<%@page import ="java.sql.PreparedStatement" %>
<%@page import ="java.sql.ResultSet" %>
<%@page import ="java.sql.SQLException" %>
<%@page import ="javax.servlet.RequestDispatcher" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Advanced Search Result</title>
    </head>
    <body>
    <% 
        String dbURL = "jdbc:oracle:thin:@localhost:1521:ORDB";
        String username = "sakhawat";
        String password = "noob";
      
        Connection con = null;
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(dbURL, username, password);
            if(con!=null) System.out.println("Connection successfully established.");
            else System.out.println("Could not establish connection");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }    
        String name=request.getParameter("bookName");
        System.out.println(name);

        String St = "select * from books where name like ?";
        PreparedStatement stmt = con.prepareStatement(St,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
        stmt.setString(1, name+"%");
       
        ResultSet rset = stmt.executeQuery();
        
        if(!rset.next())
        {
            RequestDispatcher rd = request.getRequestDispatcher("booknotfound.jsp");
            rd.forward(request, response);
        }
        if(rset.isFirst()){rset.beforeFirst();}
        
    %>
    <center><img src="Head.jpg" width="1000" height="100"/></center>
    <table width="1000" align="center" bgcolor="#038fd6">
        <tr>
            <td>
                <form method="post" action="searchResult.jsp"> 
                    &nbsp; &nbsp;
                    Search for books: <input type="text" name="bookName" size="40">
                    <input type="submit" value="Search">
                </form>
            </td>
            <td>
                &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
                <a href="home.jsp">Home</a>|
                <a href="advancedSearch.jsp">Advanced Search</a>|
                <a href="login.jsp">Log In</a>|
                <a href="register.jsp">Register</a>|
                <a href="/">Help</a>
            </td>
        </tr>
    </table> 
    <table width="1000" border="0" align="center" cellpadding="0" cellspacing="10" bgcolor="#f8f4eb">
        <% while(rset.next()){ %>
        <tr>
            <td>
                <table width="400" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#e0dffb">
                    <tr>
                        <td>
                            <table>
                                <tr><td> <strong>Book:</strong> <%= rset.getString(2) %> </td></tr>
                                <tr><td> <strong>Author:</strong>  <%= rset.getString(3) %> </td></tr>
                                <tr><td> <strong>Publisher:</strong>  <%= rset.getString(4)%> </td></tr>
                                <tr><td> <strong>Edition:</strong>  <%= rset.getString(5)%> </td></tr>
                                <tr><td> <strong>ISBN:</strong>  <%= rset.getString(6)%> </td></tr>
                            </table>
                        </td>
                        <td>
                            <table>
                                <tr><td> <a href="sellold.jsp?value=<%=rset.getString(1)%>">Sell</a> at  <%= rset.getString(7)%> tk.</td></tr>
                                <tr><td> <a href="buy.jsp?value=<%=rset.getString(1)%>">Buy </a> at  <%= rset.getString(8)%> tk.</td></tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <% } %>
    </table>
    </body>
</html>

