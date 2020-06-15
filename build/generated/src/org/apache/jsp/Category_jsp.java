package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;

public final class Category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Novels</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
 
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
    
      out.write("\n");
      out.write("    <center><img src=\"Head.jpg\" width=\"1000\" height=\"100\"/></center>\n");
      out.write("    <table width=\"1000\" align=\"center\" bgcolor=\"#038fd6\">\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <form method=\"post\" action=\"searchResult.jsp\"> \n");
      out.write("                    &nbsp; &nbsp;\n");
      out.write("                    Search for books: <input type=\"text\" name=\"bookName\" size=\"40\">\n");
      out.write("                    <input type=\"submit\" value=\"Search\">\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                <a href=\"home.jsp\">Home</a>|\n");
      out.write("                <a href=\"login.jsp\">Log In</a>|\n");
      out.write("                <a href=\"register.jsp\">Register</a>|\n");
      out.write("                <a href=\"/\">Help</a>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table> \n");
      out.write("    <table width=\"1000\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"10\" bgcolor=\"#f8f4eb\">\n");
      out.write("        ");
 while(rset.next()){ 
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <table width=\"400\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#e0dffb\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <table>\n");
      out.write("                                <tr><td> <strong>Book:</strong> ");
      out.print( rset.getString(2) );
      out.write(" </td></tr>\n");
      out.write("                                <tr><td> <strong>Author:</strong>  ");
      out.print( rset.getString(3) );
      out.write(" </td></tr>\n");
      out.write("                                <tr><td> <strong>Publisher:</strong>  ");
      out.print( rset.getString(4));
      out.write(" </td></tr>\n");
      out.write("                                <tr><td> <strong>Edition:</strong>  ");
      out.print( rset.getString(5));
      out.write(" </td></tr>\n");
      out.write("                                <tr><td> <strong>ISBN:</strong>  ");
      out.print( rset.getString(6));
      out.write(" </td></tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <table>\n");
      out.write("                                <tr><td> <a href=\"sellold.jsp?value=");
      out.print(rset.getString(1));
      out.write("\">Sell</a> at  ");
      out.print( rset.getString(7));
      out.write(" tk.</td></tr>\n");
      out.write("                                <tr><td> <a href=\"buy.jsp?value=");
      out.print(rset.getString(1));
      out.write("\">Buy </a> at  ");
      out.print( rset.getString(8));
      out.write(" tk.</td></tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
