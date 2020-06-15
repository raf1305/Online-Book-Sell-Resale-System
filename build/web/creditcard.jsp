<%-- 
    Document   : creditcard
    Created on : Dec 17, 2016, 1:18:32 AM
    Author     : sakhawat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <center><img src="ccdc.jpg" width="250" height="50"/></center>
                <strong><font color="green">Pay via Your Credit/Debit Card</font></strong><br><br>
                <form method="post" action="ccdcPaymentupdate">
                    Account holder: <input type="text" name="card_name" /><br><br>
                    Card no: <input type="text" name="card_no" /><br><br>
                    CVV no: <input type="text" name="cvv_no" /><br><br>
                    Card type: <select name="cardtype"><option>Credit</option><option>Debit</option></select><br><br>
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
                    By clicking ENTER, you authorize us to charge your credit/debit card <%= totalp %> TK.</font>
                </p>       
            </td>
        </tr>
        <tr bgcolor="#f5e7ea">
            <td>
                <p><font size="2">
                    <strong>2.</strong>
                    Do not provide invalid or expired credit/debit card number.
                </p>
            </td>            
        </tr>
    </table>    
    </body>
</html>
