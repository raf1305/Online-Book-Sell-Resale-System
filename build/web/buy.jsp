<%-- 
    Document   : buy
    Created on : Dec 15, 2016, 3:46:08 PM
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
        <title>Buy a book</title>
    </head>
    <body>
        <%
            String username = (String) session.getAttribute("username");
            if(username==null)
            {
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
            
            String bookId=request.getParameter("value");
            System.out.println("inside buy jsp "+bookId);
            
            String dbURL = "jdbc:oracle:thin:@localhost:1521:ORDB";
            String username2 = "sakhawat";
            String password = "noob";
            Connection con = null;
        
            try
            {
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection(dbURL, username2, password);
                if(con!=null) System.out.println("Connection successfully established.");
                else System.out.println("Could not establish connection");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            int d=0;
            String bookname="";
            int q=0;
            String st="select discount from discount where book_id=?";
            PreparedStatement stm=con.prepareStatement(st);
            stm.setInt(1,Integer.parseInt(bookId));
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
            d= Integer.parseInt(rs.getString(1));
            }
            
            String st2="select name from books where book_id=?";
            PreparedStatement stm2=con.prepareStatement(st2);
            stm2.setInt(1,Integer.parseInt(bookId));
            ResultSet rs2 = stm2.executeQuery();
            while(rs2.next()){
            bookname=rs2.getString(1);
            }
            
            String st3="select quantity from books where book_id=?";
            PreparedStatement stm3=con.prepareStatement(st3);
            stm3.setInt(1,Integer.parseInt(bookId));
            ResultSet rs3 = stm3.executeQuery();
            while(rs3.next()){
            q=rs3.getInt(1);
            }
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
                <a href="home2.jsp">Home</a>|
                <a href="advancedSearch.jsp">Advanced Search</a>|
                <a href="/">Help</a> 
            </td>
        </tr>
    </table>
    <table width="1000" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#f8f4eb">
        <tr>
            <td>
                <table width="220" align="left" bgcolor="#dbfafb">
                    <tr><th bgcolor="0888d6"><strong><font color="#FFFFFF">Category Listing </font></strong></th></tr>
                    <tr>
                        <td>
                            <a href="Category.jsp?value=Novel">Novels</a><br>
                            <a href="Category.jsp?value=Stories"> Stories</a> <br>
                            <a href="Category.jsp?value=Science fictions"> Science fictions</a> <br>
                            <a href="Category.jsp?value=Comics"> Comics</a> <br>
                            <a href="Category.jsp?value=Poetry"> Poetry</a> <br>
                            <a href="Category.jsp?value=History"> History</a> <br>
                            <a href="Category.jsp?value=Biography"> Biography</a> <br>
                            <a href="Category.jsp?value=Romance"> Romance</a> <br>
                            <a href="Category.jsp?value=Mystery"> Mystery</a> <br>
                            <a href="Category.jsp?value=Journals"> Journals</a> <br>
                            <a href="Category.jsp?value=Diaries"> Diaries</a> <br>
                            <a href="Category.jsp?value=Series"> Series</a> <br>
                            <a href="Category.jsp?value=Text Book"> Text Book</a> <br>
                        </td>
                    </tr>
                    <tr><th bgcolor="0888d6"><strong><font color="#FFFFFF">Information</font></strong></th></tr>
                    <tr>
                        <td>
                            <a href="/"> Contact</a> <br>
                            <a href="/"> Privacy & Security</a> <br>
                            <a href="/"> Payment Methods</a> <br>  
                            <a href="/"> Customer care</a> <br>
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <p align="left">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <strong>Buy <font color="#007009"><%= bookname %></font> </strong>
                </p>
                <form method="post" action="payment.jsp">
                    <input type="hidden" name="bk id" value=<%= bookId %> /><br>
                    <input type="hidden" name="dscnt" value=<%= d %> /><br>
                    This book has 
                    <font color="red"><%= d %> % </font>
                    discount available.<br><br>
                    This book has 
                    <font color="red"><%= q %> </font>
                    copies available.<br><br>
                    No of Copy <input type="number" name="copies" min="0" max="<%= q %>"/> <br/><br>
                    <input type="submit" value="Done" />
                </form>
           
            </td>
        </tr>
    </table>
    </body>
</html>
