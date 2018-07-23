package com.dxc.ecaas.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home/")
public class NodeInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

	/* HTML preamble */
	writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	writer.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
	writer.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">");
	writer.println("<head>\n  <title>DemoApp</title>\n</head>\n<body>");

	writer.println("<img src=\"../images/wildfly-banner-1180px.png\" alt=\"banner\">");
	/* Write environment information */
        writer.println("<br/><br/><b>Hostname:</b> " + System.getProperty("jboss.host.name"));
        writer.println("<br/><b>Java Runtime:</b> " + System.getProperty("java.runtime.name") + " " + System.getProperty("java.runtime.version"));
	writer.println("<hr/>");

	/* Put your content here */
	writer.println("<h1>Hello from the ECaaS team from Italy!</h1>");
    writer.println("<h1>Hello Antonio Arnau! V2.2</h1>");
	/* HTML trailer */
	writer.println("</body>\n</html>");

        writer.close();
    }
}
