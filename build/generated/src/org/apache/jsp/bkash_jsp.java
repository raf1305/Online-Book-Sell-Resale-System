package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bkash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Bkash</title>\n");
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
      out.write("                <center><img src=\"bkash.jpg\" width=\"140\" height=\"60\"/></center>\n");
      out.write("                <strong><font color=\"green\">Pay via Your bKash Account</font></strong><br><br>\n");
      out.write("                <form method=\"post\" action=\"bkashPaymentupdate\">\n");
      out.write("                    Account holder: <input type=\"text\" name=\"account_name\" /><br><br>\n");
      out.write("                    Mobile no: <input type=\"text\" name=\"account_no\" /><br><br>\n");
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
      out.write("                    Please send your total amount via bKash and write down your Transaction ID (TrxID). \n");
      out.write("                    You do not need to pay bKash fees from your side. You must provide the full TrxID. \n");
      out.write("                    We do not accept (partial) phone number for payment validation.</font>\n");
      out.write("                </p>       \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr bgcolor=\"#f5e7ea\">\n");
      out.write("            <td>\n");
      out.write("                <p><font size=\"2\">\n");
      out.write("                    <strong>2.</strong>\n");
      out.write("                    Our bKash number is a MERCHANT NUMBER. Our numbers are NOT AGENT/PERSONAL number.\n");
      out.write("                </p>\n");
      out.write("            </td>            \n");
      out.write("        </tr>\n");
      out.write("        <tr bgcolor=\"#f5e7ea\">\n");
      out.write("            <td>\n");
      out.write("                <p><font size=\"2\">\n");
      out.write("                    <strong>3.</strong>\n");
      out.write("                    Our bKash number <strong><font color=\"red\">01537053864</font></strong>\n");
      out.write("                </p>\n");
      out.write("            </td>\n");
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
