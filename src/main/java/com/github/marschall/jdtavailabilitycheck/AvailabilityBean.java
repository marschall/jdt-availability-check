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

  private static final String LOG4J_LOGGER = "org.apache.logging.log4j.Logger";

  private static final String LOG4J_LOGMANAGER = "org.apache.logging.log4j.LogManager";

  private static final String SLF4J_LOGGER = "org.slf4j.Logger";

  private static final String SLF4J_LOGGER_FACTORY = "org.slf4j.LoggerFactory";

  private static final String JCL_LOG = "org.apache.commons.logging.Log";

  private static final String JCL_LOG_FACTORY = "org.apache.commons.logging.LogFactory";

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

  public String getLog4jLoggerClassName() {
    return LOG4J_LOGGER;
  }

  public boolean isLog4jLoggerClassClassVisible() {
    return this.isClassAvailable(this.getLog4jLoggerClassName());
  }

  public String getLog4jLogManagerClassName() {
    return LOG4J_LOGMANAGER;
  }

  public boolean isLog4jLogManagerClassClassVisible() {
    return this.isClassAvailable(this.getLog4jLogManagerClassName());
  }

  public String getSlf4jLoggerClassName() {
    return SLF4J_LOGGER;
  }

  public boolean isSlf4jLoggerClassVisible() {
    return this.isClassAvailable(this.getSlf4jLoggerClassName());
  }

  public String getSlf4jLoggerFactoryClassName() {
    return SLF4J_LOGGER_FACTORY;
  }

  public boolean isSlf4jLoggerFactoryClassVisible() {
    return this.isClassAvailable(this.getSlf4jLoggerFactoryClassName());
  }

  public String getJclLoggerClassName() {
    return JCL_LOG;
  }

  public boolean isJclLoggerClassVisible() {
    return this.isClassAvailable(this.getJclLoggerClassName());
  }

  public String getJclLoggerFactoryClassName() {
    return JCL_LOG_FACTORY;
  }

  public boolean isJclLoggerFactoryClassVisible() {
    return this.isClassAvailable(this.getJclLoggerFactoryClassName());
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
