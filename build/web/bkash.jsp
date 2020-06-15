<%-- 
    Document   : bkash
    Created on : Dec 15, 2016, 3:33:42 AM
    Author     : sakhawat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bkash</title>
    </head>
    <body>
        <% 
            String bookID=request.getParameter("b_id");
            String totalp=request.getParameter("tp");
            String cop=request.getParameter("b_c");
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
    <table width="1000" height="500" border="0" align="center" cellpadding="0" cellspacing="10" bgcolor="#f8f4eb"> 
        <tr>
            <td align="center">
                <center><img src="bkash.jpg" width="140" height="60"/></center>
                <strong><font color="green">Pay via Your bKash Account</font></strong><br><br>
                <form method="post" action="bkashPaymentupdate">
                    Account holder: <input type="text" name="account_name" /><br><br>
                    Mobile no: <input type="text" name="account_no" /><br><br>
                    <input type="hidden" name="boi" value=<%= bookID %> /> 
                    <input type="hidden" name="teka" value=<%= totalp %> /> 
                    <input type="hidden" name="num" value=<%= cop %> />
                    <input type="submit" value="Enter" /> <br><br>
                </form>
            </td>
        </tr>
        <tr bgcolor="#f5e7ea">
            <td>
                <p><font size="2">
                    <strong>1.</strong>
                    Please send your total amount via bKash and write down your Transaction ID (TrxID). 
                    You do not need to pay bKash fees from your side. You must provide the full TrxID. 
                    We do not accept (partial) phone number for payment validation.</font>
                </p>       
            </td>
        </tr>
        <tr bgcolor="#f5e7ea">
            <td>
                <p><font size="2">
                    <strong>2.</strong>
                    Our bKash number is a MERCHANT NUMBER. Our numbers are NOT AGENT/PERSONAL number.
                </p>
            </td>            
        </tr>
        <tr bgcolor="#f5e7ea">
            <td>
                <p><font size="2">
                    <strong>3.</strong>
                    Our bKash number <strong><font color="red">01537053864</font></strong>
                </p>
            </td>
        </tr>
    </table>    
    </body>
</html>
