<%-- 
    Document   : novels
    Created on : Dec 14, 2016, 6:47:06 PM
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
        <title>Novels</title>
    </head>
    <body>
    <% 
        String dbURL = "jdbc:oracle:thin:@localhost:1521:ORDB";
        String username = "sakhawat";
        String password = "noob";
        String bookType = "";
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
        
        if(request.getParameter("value").equals("Novel")){bookType = "Novel";}
        else if(request.getParameter("value").equals("Stories")){bookType = "Stories";}
        else if(request.getParameter("value").equals("Science fictions")){bookType = "Science fictions";}
        else if(request.getParameter("value").equals("Comics")){bookType = "Comics";}
        else if(request.getParameter("value").equals("Poetry")){bookType = "Poetry";}
        else if(request.getParameter("value").equals("History")){bookType = "History";}
        else if(request.getParameter("value").equals("Biography")){bookType = "Biography";}
        else if(request.getParameter("value").equals("Romance")){bookType = "Romance";}
        else if(request.getParameter("value").equals("Mystery")){bookType = "Mystery";}
        else if(request.getParameter("value").equals("Journals")){bookType = "Journals";}
        else if(request.getParameter("value").equals("Diaries")){bookType = "Diaries";}
        else if(request.getParameter("value").equals("Series")){bookType = "Series";}
        else if(request.getParameter("value").equals("Text Book")){bookType = "Text Book";}
        
        String St = "select * from books where type=?";
        PreparedStatement stmt = con.prepareStatement(St);
        stmt.setString(1, bookType);
        ResultSet rset = stmt.executeQuery();  
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
