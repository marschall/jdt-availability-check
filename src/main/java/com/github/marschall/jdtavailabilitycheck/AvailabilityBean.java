package com.github.marschall.jdtavailabilitycheck;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;

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

  private static final String CGLIB_ENHANCER = "net.sf.cglib.proxy.Enhancer";

  private static final String GUAVA_MAPS = "com.google.common.collect.Maps";

  private static final String JACKSON_FACTORY = "org.codehaus.jackson.JsonFactory";

  private static final String DOM4J_DOCUMENT_FACTORY = "org.dom4j.DocumentFactory";
  
  private static final String JDOM_1_DOCUMENT = "org.jdom.Document";

  private static final String JDOM_2_DOCUMENT = "org.jdom2.Document";

  private static final String LUCENE_VERISON = "org.apache.lucene.util.Version"; // Hibernate Search

  private static final String CXF_VERSION = "org.apache.cxf.version.Version";

  private static final String bouncycastle = "";

  private static final String apache_santuario = "";
  
  private static final String springframework = "";
  
  private static final String xalan = "";
  
  private static final String xerces = "";

  private static final String JETTISON_CONFIGURATION = "org.codehaus.jettison.mapped.Configuration";

  private static final String MIMEPULL_MESSAGE = "org.jvnet.mimepull.MIMEMessage";

  private static final String APACHE_TOOLS_TARBUFFER = "org.apache.tools.tar.TarBuffer";

  private static final String ANT_TASK = "org.apache.tools.ant.Task";

  private static final String WOODSTOX_INPUT_FACTORY = "com.ctc.wstx.stax.WstxInputFactory";

  private static final String ASM_CLASS_VISITOR = "org.objectweb.asm.ClassVisitor";
  
  private static final String EJB = "javax.ejb.EJB";

  private static final String PERSISTENCE_CONTEXT = "javax.persistence.PersistenceContext";

  private static final String STRING_UTILS = "org.apache.commons.lang.StringUtils";

  private static final String STRING_UTILS3 = "org.apache.commons.lang3.StringUtils";

  /**
   * From xml-apis, not JDK.
   * 
   * <p>Xerces alone without this will break.</p>
   * https://issues.apache.org/jira/browse/XERCESJ-1466
   */
  private static final String ELEMENT_TRAVERSAL = "org.w3c.dom.ElementTraversal";

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

  public String getCglibEnhancerClassName() {
    return CGLIB_ENHANCER;
  }

  public boolean isCglibEnhancerClassVisible() {
    return this.isClassAvailable(this.getCglibEnhancerClassName());
  }

  public String getGuavaMapsClassName() {
    return GUAVA_MAPS;
  }

  public boolean isGuavaMapsClassVisible() {
    return this.isClassAvailable(this.getGuavaMapsClassName());
  }

  public String getDom4jDocumentFactoryClassName() {
    return DOM4J_DOCUMENT_FACTORY;
  }

  public boolean isDom4jDocumentFactoryClassVisible() {
    return this.isClassAvailable(this.getDom4jDocumentFactoryClassName());
  }
  
  public String getJdom1DocumentClassName() {
    return JDOM_1_DOCUMENT;
  }
  
  public boolean isJdom1DocumentClassVisible() {
    return this.isClassAvailable(this.getJdom1DocumentClassName());
  }
  
  public String getJdom2DocumentClassName() {
    return JDOM_2_DOCUMENT;
  }
  
  public boolean isJdom2DocumentClassVisible() {
    return this.isClassAvailable(this.getJdom2DocumentClassName());
  }
  
  public String getLuceneVersionClassName() {
    return LUCENE_VERISON;
  }
  
  public boolean isLuceneVersionClassVisible() {
    return this.isClassAvailable(this.getLuceneVersionClassName());
  }
  
  public String getCxfVersionClassName() {
    return CXF_VERSION;
  }
  
  public boolean isCxfVersionClassVisible() {
    return this.isClassAvailable(this.getCxfVersionClassName());
  }

  public String getJacksonFactoryClassName() {
    return JACKSON_FACTORY;
  }

  public boolean isJacksonFactoryClassVisible() {
    return this.isClassAvailable(this.getJacksonFactoryClassName());
  }

  public String getJettisonConfigurationClassName() {
    return JETTISON_CONFIGURATION;
  }

  public boolean isJettisonConfigurationClassVisible() {
    return this.isClassAvailable(this.getJettisonConfigurationClassName());
  }

  public String getMimePullMessageClassName() {
    return MIMEPULL_MESSAGE;
  }

  public boolean isMimePullMessageClassVisible() {
    return this.isClassAvailable(this.getMimePullMessageClassName());
  }

  public String getApacheToolsTarbufferClassName() {
    return APACHE_TOOLS_TARBUFFER;
  }

  public boolean isApacheToolsTarbufferClassVisible() {
    return this.isClassAvailable(this.getApacheToolsTarbufferClassName());
  }

  public String getAntTaskClassName() {
    return ANT_TASK;
  }

  public boolean isAntTaskClassVisible() {
    return this.isClassAvailable(this.getAntTaskClassName());
  }

  public String getWoodstoxInputFactoryClassName() {
    return WOODSTOX_INPUT_FACTORY;
  }

  public boolean isWoodstoxInputFactoryClassVisible() {
    return this.isClassAvailable(this.getWoodstoxInputFactoryClassName());
  }

  public String getAsmClassVisitorClassName() {
    return ASM_CLASS_VISITOR;
  }

  public boolean isAsmClassVisitorClassVisible() {
    return this.isClassAvailable(this.getAsmClassVisitorClassName());
  }

  public String getEjbClassName() {
    return EJB;
  }

  public boolean isEjbClassVisible() {
    return this.isClassAvailable(this.getEjbClassName());
  }

  public String getStringUtilsClassName() {
    return STRING_UTILS;
  }

  public boolean isStringUtilsClassVisible() {
    return this.isClassAvailable(this.getStringUtilsClassName());
  }

  public String getStringUtils3ClassName() {
    return STRING_UTILS3;
  }

  public boolean isStringUtils3ClassVisible() {
    return this.isClassAvailable(this.getStringUtils3ClassName());
  }

  public String getPersistenceContextClassName() {
    return PERSISTENCE_CONTEXT;
  }

  public boolean isPersistenceContextClassVisible() {
    return this.isClassAvailable(this.getPersistenceContextClassName());
  }

  public String getElementTraversalClassName() {
    return ELEMENT_TRAVERSAL;
  }

  public boolean isElementTraversalClassVisible() {
    return this.isClassAvailable(this.getElementTraversalClassName());
  }

  public boolean isSeNonApiClassVisible() {
    return this.isClassAvailable("sun.reflect.Reflection");
  }

  public boolean isJstlPresent() {
    return this.isClassAvailable("javax.servlet.jsp.jstl.core.Config");
  }

  public boolean isResourceLoadedFromSystem() {
    return Resource.class.getClassLoader() == ClassLoader.getSystemClassLoader();
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
