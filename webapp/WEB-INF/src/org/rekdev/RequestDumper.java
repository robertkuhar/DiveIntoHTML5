package org.rekdev;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.commons.lang.*;

public class RequestDumper extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,
            IOException {
        doPost( req, resp );
    }

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp ) throws ServletException,
            IOException {
        resp.setContentType( "text/html" );

        PrintWriter out = resp.getWriter();
        out.println( "<!DOCTYPE html>" );
        out.println( "<html lang=\"en\">" );
        out.println( "<head>" );
        out.println( "<title>DiveIntoHTML5 CH09</title>" );
        out.println( "</head>" );
        out.println( "<body>" );
        out.println( "<table>" );
        out.println( "<h1>Request Parameters</h1>" );
        out.println( "<tr><td><h2>Name</h2></td><td><h2>Value</h2></td></tr>" );
        // Why the warning? I freaking HATE Java generics!
        Map< String , String[]> paramMap = req.getParameterMap();
        for ( String paramName : paramMap.keySet() ) {
            out.println( "<tr><td>" + paramName + "</td>" );
            String[] paramValue = paramMap.get( paramName );
            for ( int i = 0; i < paramValue.length; i++ ) {
                String encodedParamValue = StringEscapeUtils.escapeHtml( paramValue[ i ] );
                if ( i == 0 ) {
                    out.println( "<td>" + encodedParamValue + "</td>" );
                } else {
                    out.println( "<td>&nbsp;</td><td>" + encodedParamValue + "</td>" );
                }
                out.println( "</tr>" );
            }
            out.println( "</tr>" );
        }
        out.println( "</table>" );
        out.println( "</body>" );
        out.println( "</html>" );
    }

}
