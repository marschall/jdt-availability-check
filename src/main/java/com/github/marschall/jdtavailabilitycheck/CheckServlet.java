package com.github.marschall.jdtavailabilitycheck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CheckServlet extends HttpServlet {

  private static final String JDT = "org.eclipse.jdt.core.compiler.batch.BatchCompiler";

  private static final String JSR_199 = "org.apache.jasper.compiler.Jsr199JavaCompiler";

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/plain");
    PrintWriter writer = resp.getWriter();
    if (this.isClassAvailable(JDT)) {
      writer.write("JDT available");
    } else {
      writer.write("JDT not available");
      if (isClassAvailable(JSR_199)) {
        writer.write("JSR-199 compiler available");
      }
    }
  }

  private boolean isClassAvailable(String className) {
    try {
      Class.forName(className);
      return true;
    } catch (ClassNotFoundException e) {
      return false;
    }
  }

}
