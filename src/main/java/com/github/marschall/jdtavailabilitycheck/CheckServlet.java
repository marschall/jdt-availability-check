package com.github.marschall.jdtavailabilitycheck;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CheckServlet extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.setContentType("text/plain");
    PrintWriter writer = resp.getWriter();
    if (this.isJdtAvailable()) {
      writer.write("JDT available");
    } else {
      writer.write("JDT not available");
    }
  }
  
  private boolean isJdtAvailable() {
    try {
      Class.forName("org.eclipse.jdt.core.compiler.batch.BatchCompiler");
      return true;
    } catch (ClassNotFoundException e) {
      return false;
    }
  }

}
