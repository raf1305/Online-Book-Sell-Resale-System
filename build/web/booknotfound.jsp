<%-- 
    Document   : booknotfound
    Created on : Dec 16, 2016, 8:27:50 PM
    Author     : sakhawat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>book not found</title>
    </head>
    <body>
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
                <a href="login.jsp">Log In</a>|
                <a href="register.jsp">Register</a>|
                <a href="/">Help</a> 
            </td>
        </tr>
    </table>
    <table width="1000" height="500" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#f8f4eb">
        <tr>
            <td>
                <pre>
                    <font face="verdana" size="5" color="#565b57">
                             The book you are looking for could not be found. 
                    You can search later or sell this book and enrich our collection.<br>
                    </font>
                </pre>
                <table width="150" align="center" bgcolor="#f8f4eb">
                    <tr>
                        <td >
                            <a href="sellnew.jsp"><strong>SELL BOOKS</strong></a>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        
    </table>
    </body>
</html>
