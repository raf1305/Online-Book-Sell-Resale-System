<%-- 
    Document   : sell
    Created on : Dec 13, 2016, 5:20:01 PM
    Author     : sakhawat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sell your books</title>
    </head>
    <body>
        <%
            String username = (String) session.getAttribute("username");
            if(username==null)
            {
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
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
                    <strong><font color="#007009">Sell Your BOOKS</font> </strong>
                </p>
                <form method="post" action="userSellBook">
                    Book Name <input type="text" name="bookName" /><br><br>
                    Author  <input type="text" name="author" /> <br/><br>
                    Publisher <input type="text" name="publisher" /> <br/><br>
                    Version <input type="text" name="version" /> <br/><br>
                    ISBN <input type="text" name="isbn" /> <br/><br>
                    Category <input type="text" name="category" /> <br/><br>
                    Selling Price <input type="number" name="sellprice" /> <br/><br>
                    No of Copy <input type="number" name="copies" /> <br/><br>
                    <input type="submit" value="Done" />
                </form>
            
            </td>
        </tr>
    </table>
    </body>
</html>
