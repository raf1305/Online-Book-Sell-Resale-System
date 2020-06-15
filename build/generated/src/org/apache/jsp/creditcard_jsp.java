package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class creditcard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            String bookID=request.getParameter("b_id");
            String totalp=request.getParameter("tp");
            String cop=request.getParameter("b_c");
        
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
      out.write("    <table width=\"1000\" height=\"500\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"10\" bgcolor=\"#f8f4eb\"> \n");
      out.write("        <tr>\n");
      out.write("            <td align=\"center\">\n");
      out.write("                <center><img src=\"ccdc.jpg\" width=\"250\" height=\"50\"/></center>\n");
      out.write("                <strong><font color=\"green\">Pay via Your Credit/Debit Card</font></strong><br><br>\n");
      out.write("                <form method=\"post\" action=\"ccPaymentupdate\">\n");
      out.write("                    Account holder: <input type=\"text\" name=\"card_name\" /><br><br>\n");
      out.write("                    Card no: <input type=\"text\" name=\"card_no\" /><br><br>\n");
      out.write("                    CVV no: <input type=\"text\" name=\"cvv_no\" /><br><br>\n");
      out.write("                    Card type: <select name=\"cardtype\"><option>Credit</option><option>Debit</option></select><br><br>\n");
      out.write("                    <input type=\"hidden\" name=\"boi\" value=");
      out.print( bookID );
      out.write(" /> \n");
      out.write("                    <input type=\"hidden\" name=\"teka\" value=");
      out.print( totalp );
      out.write(" /> \n");
      out.write("                    <input type=\"hidden\" name=\"num\" value=");
      out.print( cop );
      out.write(" />\n");
      out.write("                    <input type=\"submit\" value=\"Enter\" /> <br><br>\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr bgcolor=\"#f5e7ea\">\n");
      out.write("            <td>\n");
      out.write("                <p><font size=\"2\">\n");
      out.write("                    <strong>1.</strong>\n");
      out.write("                    By clicking ENTER, you authorize us to charge your credit/debit card ");
      out.print( totalp );
      out.write(" TK.</font>\n");
      out.write("                </p>       \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr bgcolor=\"#f5e7ea\">\n");
      out.write("            <td>\n");
      out.write("                <p><font size=\"2\">\n");
      out.write("                    <strong>2.</strong>\n");
      out.write("                    Do not provide invalid or expired credit/debit card number.\n");
      out.write("                </p>\n");
      out.write("            </td>            \n");
      out.write("        </tr>\n");
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
