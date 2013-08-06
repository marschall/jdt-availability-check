package com.github.marschall.jdtavailabilitycheck;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

public class AvailabilityBean {

    private static final String JDT = "org.eclipse.jdt.core.compiler.batch.BatchCompiler";

    private static final String JDT_INTERNAL = "org.eclipse.jdt.internal.compiler.Compiler";

    private static final String JSR_199 = "org.apache.jasper.compiler.Jsr199JavaCompiler";

    private HttpServletRequest request;

    private HttpServletResponse response;

    private HttpSession session;

    private ServletContext servletContext;

    private ServletConfig config;

    private PageContext pageContext;

    public void setServletRequest(HttpServletRequest request)  {
        this.request = request;
    }

    public String getServletRequestClass() {
        return this.request.getClass().getName();
    }

    public boolean isServletRequestClassVisible() {
        return this.isClassAvailable(this.getServletRequestClass());
    }

    public void setServletResponse(HttpServletResponse response)  {
        this.response = response;
    }

    public String getServletResponseClass() {
        return this.response.getClass().getName();
    }

    public boolean isServletResponseClassVisible() {
        return this.isClassAvailable(this.getServletResponseClass());
    }

    public void setHttpSession(HttpSession session)  {
        this.session = session;
    }

    public String getHttpSessionClass() {
        return this.session.getClass().getName();
    }

    public boolean isHttpSessionClassVisible() {
        return this.isClassAvailable(this.getHttpSessionClass());
    }

    public void setServletContext(ServletContext context)  {
        this.servletContext = context;
    }

    public String getServletContextClass() {
        return this.servletContext.getClass().getName();
    }

    public boolean isServletContextClassVisible() {
        return this.isClassAvailable(this.getServletContextClass());
    }

    public void setPageContext(PageContext context)  {
        this.pageContext = context;
    }

    public String getPageContextClass() {
        return this.pageContext.getClass().getName();
    }

    public boolean isPageContextClassVisible() {
        return this.isClassAvailable(this.getServletContextClass());
    }

    public void setServletConfig(ServletConfig config)  {
        this.config = config;
    }

    public String getServletConfigClass() {
        return this.config.getClass().getName();
    }

    public boolean isServletConfigClassVisible() {
        return this.isClassAvailable(this.getServletContextClass());
    }

    public String getJdtCompilerClassName() {
        return JDT;
    }

    public boolean isJdtCompilerClassClassVisible() {
        return this.isClassAvailable(this.getJdtCompilerClassName());
    }

    public String getJdtInternalCompilerClassName() {
        return JDT_INTERNAL;
    }

    public boolean isJdtInternalCompilerClassClassVisible() {
        return this.isClassAvailable(this.getJdtCompilerClassName());
    }

    public String getJsr199CompilerClassName() {
        return JSR_199;
    }

    public boolean isJsr199CompilerClassClassVisible() {
        return this.isClassAvailable(this.getJsr199CompilerClassName());
    }

    public boolean isSeNonApiClassVisible() {
        return this.isClassAvailable("sun.reflect.Reflection");
    }

    public boolean isJstlPresent() {
        return this.isClassAvailable("javax.servlet.jsp.jstl.core.Config");
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
