<%-- 
    Document   : home
    Created on : Dec 5, 2016, 7:45:13 PM
    Author     : sakhawat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Resale</title>      
    </head>
    <body >
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
    <table width="1000" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#f8f4eb" >
        <tr>
            <td>
                <table width="220" align="left" bgcolor="#dbfafb" >
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
                <table width="780" align="left">
                    <tr>
                        <td>
                           <center><img src="books.jpg" width="700" height="100"/></center> 
                        </td>
                    </tr>
                    <tr><td>
                            <p align="center">
                                <strong><font color="#007009">WELCOME TO BOOKWORM</font> </strong>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p>Bookworm is the premiere marketplace for buying and selling books. 
                               We have connected millions of buyers with thousands of Independent Sellers from across the world. 
                               Shopping at Bookworm means that you are directly supporting local and independent sellers.
                               We also offer a 100% satisfaction guarantee and a good amount of discount.
                               Our catalog includes more than 10000 books from over 50 publishers. 
                               We are adding new and old books every now and then. 
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <table width="770" align="left">
                                <tr>
                                    <td >
                                        &nbsp;&nbsp;&nbsp;<strong><font color="#007009">Top 3 Authors</font> </strong><br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Humayan Ahmed</a> <br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Agatha Christie</a> <br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Dan Brown</a> <br>
                                    </td>
                                    <td >
                                        &nbsp;&nbsp;&nbsp;<strong><font color="#007009">Top 3 Publishers</font> </strong><br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Seba prokashani</a> <br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Anonna Publishers</a> <br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Bangla Academy</a> <br>
                                    </td>
                                     <td >
                                        &nbsp;&nbsp;&nbsp;<strong><font color="#007009">Top 3 Books</font> </strong><br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Feluda</a> <br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Golpoguccho</a> <br>
                                        &nbsp;&nbsp;&nbsp;*<a href="/"> Himu Shomogro</a> <br>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>                
            </td>
        </tr>
    </table>
    </body>
</html>
