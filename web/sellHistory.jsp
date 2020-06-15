<%-- 
    Document   : sellHistory
    Created on : Dec 16, 2016, 3:49:16 PM
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
        <title>Sell history</title>
    </head>
    <body>
    <%
        String dbURL = "jdbc:oracle:thin:@localhost:1521:ORDB";
        String username1 = "sakhawat";
        String password = "noob";
        int mem_id=0;
        Connection con = null;
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(dbURL, username1, password);
            if(con!=null) System.out.println("Connection successfully established.");
            else System.out.println("Could not establish connection");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String user = (String) session.getAttribute("username");
        String St2 = "select member_id from member where username=?";
        PreparedStatement stmt5 = con.prepareStatement(St2);
        stmt5.setString(1,user);
        ResultSet rsett = stmt5.executeQuery();
        while(rsett.next()){
            mem_id = rsett.getInt(1);}
        
        String St = "select bo.name,s.sell_price,s.selling_date from selldata s join books bo on (bo.book_id=s.book_id) join member m on(m.member_id=? and s.member_id=?)";
        PreparedStatement stmt = con.prepareStatement(St);
        stmt.setInt(1,mem_id);
        stmt.setInt(2,mem_id);
        ResultSet rs = stmt.executeQuery();
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
                <a href="advancedSearch.jsp">Advanced Search</a>|
                <a href="/">Help</a>
            </td>
        </tr>
    </table>
    <table width="1000" border="10" align="center" cellpadding="10" cellspacing="10" bgcolor="#f8f4eb" >
        <tr>
            <th> BOOK NAME</th>
            <th> SELLING PRICE</th>
            <th> SELLING DATE</th>
        </tr>
        <% while(rs.next()){ %>
        <tr>
            <td>
                <%= rs.getString(1) %>
            </td>
            <td>
                <%= rs.getString(2) %>
            </td>
            <td>
                <%= rs.getString(3) %>
            </td>
        </tr>
        <% } %>
    </table>
    </body>
</html>

