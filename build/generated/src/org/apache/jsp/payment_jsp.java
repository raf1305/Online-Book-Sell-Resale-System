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

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Payment</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
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
        
      out.write("\n");
      out.write("        <center><img src=\"Head.jpg\" width=\"1000\" height=\"100\"/></center>\n");
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
      out.write("                <a href=\"home2.jsp\">Home</a>|\n");
      out.write("                <a href=\"advancedSearch.jsp\">Advanced Search</a>|\n");
      out.write("                <a href=\"/\">Help</a> \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <table width=\"1000\" height=\"500\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#f8f4eb\">\n");
      out.write("        <tr>\n");
      out.write("            <td align=\"center\">\n");
      out.write("                Book Name : ");
      out.print( bookname );
      out.write(" <br><br>\n");
      out.write("                Price : ");
      out.print( price );
      out.write(" <br><br>\n");
      out.write("                Quantity: ");
      out.print( cop );
      out.write(" <br><br>\n");
      out.write("                Discount: ");
      out.print( dis );
      out.write(" % <br><br>\n");
      out.write("                Total Price: ");
      out.print( totalprice );
      out.write(" <br><br>\n");
      out.write("                Please choose one of the payment methods from below:<br><br>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <form method=\"post\" action=\"bkash.jsp\">\n");
      out.write("                                <input type=\"hidden\" name=\"b_id\" value=");
      out.print( bookID );
      out.write(" /><br>\n");
      out.write("                                <input type=\"hidden\" name=\"tp\" value=");
      out.print( totalprice );
      out.write(" /><br>\n");
      out.write("                                <input type=\"hidden\" name=\"b_c\" value=");
      out.print( cop );
      out.write(" /><br>\n");
      out.write("                                <input type=\"submit\" value=\"Bkash\" />\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <form method=\"post\" action=\"creditcard.jsp\">\n");
      out.write("                                <input type=\"hidden\" name=\"b_id\" value=");
      out.print( bookID );
      out.write(" /><br>\n");
      out.write("                                <input type=\"hidden\" name=\"tp\" value=");
      out.print( totalprice );
      out.write(" /><br>\n");
      out.write("                                <input type=\"hidden\" name=\"b_c\" value=");
      out.print( cop );
      out.write(" /><br>\n");
      out.write("                                <input type=\"submit\" value=\"Credit Card\" />\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>   \n");
      out.write("            </td>            \n");
      out.write("        </tr> \n");
      out.write("    </table>    \n");
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
