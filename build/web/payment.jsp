<%-- 
    Document   : payment
    Created on : Dec 15, 2016, 9:12:05 PM
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
        <title>Payment</title>
    </head>
    <body>
        <% 
            String bookID=request.getParameter("bk id");
            String cop=request.getParameter("copies");
            String dis=request.getParameter("dscnt");
            
            String bookname="";
            int price=0,ds;
            int totalprice=0;
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
            
            String st="select name from books where book_id=?";
            PreparedStatement stm=con.prepareStatement(st);
            stm.setInt(1,Integer.parseInt(bookID));
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                bookname=rs.getString(1);
            }
            
            String st2="select selling_price from books where book_id=?";
            PreparedStatement stm2=con.prepareStatement(st2);
            stm2.setInt(1,Integer.parseInt(bookID));
            ResultSet rs2 = stm2.executeQuery();
            while(rs2.next()){
                price=rs2.getInt(1);
            }
            ds=Integer.parseInt(dis);
            totalprice=(price-price*ds/100)*Integer.parseInt(cop);            
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
    <table width="1000" height="500" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#f8f4eb">
        <tr>
            <td align="center">
                Book Name : <%= bookname %> <br><br>
                Price : <%= price %> <br><br>
                Quantity: <%= cop %> <br><br>
                Discount: <%= dis %> % <br><br>
                Total Price: <%= totalprice %> <br><br>
                Please choose one of the payment methods from below:<br><br>
                <table>
                    <tr>
                        <td>
                            <form method="post" action="bkash.jsp">
                                <input type="hidden" name="b_id" value=<%= bookID %> /><br>
                                <input type="hidden" name="tp" value=<%= totalprice %> /><br>
                                <input type="hidden" name="b_c" value=<%= cop %> /><br>
                                <input type="submit" value="Bkash" />
                            </form>
                        </td>
                        <td>
                            <form method="post" action="creditcard.jsp">
                                <input type="hidden" name="b_id" value=<%= bookID %> /><br>
                                <input type="hidden" name="tp" value=<%= totalprice %> /><br>
                                <input type="hidden" name="b_c" value=<%= cop %> /><br>
                                <input type="submit" value="Credit/Debit Card" />
                            </form>
                        </td>
                    </tr>
                </table>   
            </td>            
        </tr> 
    </table>    
    </body>
</html>
