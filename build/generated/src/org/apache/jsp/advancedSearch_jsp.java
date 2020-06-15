package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class advancedSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Advanced Search</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center><img src=\"Head.jpg\" width=\"1000\" height=\"100\"/></center>\n");
      out.write("        <table width=\"1000\" align=\"center\" bgcolor=\"#038fd6\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <form method=\"post\" action=\"searchBook\"> \n");
      out.write("                        &nbsp; &nbsp;\n");
      out.write("                        Search for books: <input type=\"text\" name=\"search\" size=\"40\">\n");
      out.write("                        <input type=\"submit\" value=\"Search\">\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;\n");
      out.write("                    <a href=\"home.jsp\">Home</a>|\n");
      out.write("                    <a href=\"login.jsp\">Log In</a>|\n");
      out.write("                    <a href=\"register.jsp\">Register</a>|\n");
      out.write("                    <a href=\"/\">Help</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <table width=\"1000\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#f8f4eb\">\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <table width=\"220\" align=\"left\" bgcolor=\"#dbfafb\">\n");
      out.write("                    <tr><th bgcolor=\"0888d6\"><strong><font color=\"#FFFFFF\">Category Listing </font></strong></th></tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"Category.jsp?value=Novel\">Novels</a><br>\n");
      out.write("                            <a href=\"Category.jsp?value=Stories\"> Stories</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Science fictions\"> Science fictions</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Comics\"> Comics</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Poetry\"> Poetry</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=History\"> History</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Biography\"> Biography</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Romance\"> Romance</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Mystery\"> Mystery</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Journals\"> Journals</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Diaries\"> Diaries</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Series\"> Series</a> <br>\n");
      out.write("                            <a href=\"Category.jsp?value=Text Book\"> Text Book</a> <br>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><th bgcolor=\"0888d6\"><strong><font color=\"#FFFFFF\">Information</font></strong></th></tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"/\"> Contact</a> <br>\n");
      out.write("                            <a href=\"/\"> Privacy & Security</a> <br>\n");
      out.write("                            <a href=\"/\"> Payment Methods</a> <br>  \n");
      out.write("                            <a href=\"/\"> Customer care</a> <br>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <p align=\"left\">\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <strong><font color=\"#007009\">Advanced Search</font> </strong>\n");
      out.write("                </p>\n");
      out.write("                <form method=\"post\" action=\"advancedSearchResult.jsp\"> \n");
      out.write("                    Name <input type=\"text\" name=\"bookName\" size=\"30\"/><br><br>\n");
      out.write("                    Author <input type=\"text\" name=\"authorName\" size=\"30\"/><br><br>\n");
      out.write("                    Publisher <input type=\"text\" name=\"publisherName\" size=\"30\"/><br><br>\n");
      out.write("                    Category <input type=\"text\" name=\"type\" size=\"30\"/><br><br>\n");
      out.write("                    <input type=\"submit\" value=\"Search\"/>\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
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
