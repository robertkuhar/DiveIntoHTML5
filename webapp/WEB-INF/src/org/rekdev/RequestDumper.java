package org.rekdev;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

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
        out.println( "Request Parameters" );
        out.println( "<tr><td>Name</td><td>Value</td></tr>" );
        // Why the warning? I freaking HATE Java generics!
        Map< String , String[]> paramMap = req.getParameterMap();
        for ( String paramName : paramMap.keySet() ) {
            out.println( "<tr><td>" + paramName + "</td>" );
            String[] paramValue = paramMap.get( paramName );
            for ( int i = 0; i < paramValue.length; i++ ) {
                // TODO: Should really be HTML encoding the paramValue
                if ( i == 0 ) {
                    out.println( "<td>" + paramValue[ i ] + "</td>" );
                } else {
                    out.println( "<td>&nbsp;</td><td>" + paramValue[ i ] + "</td>" );
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
