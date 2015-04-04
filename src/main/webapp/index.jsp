<!DOCTYPE html>
<html>
<head>
	<title>Class Availability Check</title>
  <style type="text/css">
    tbody th {
      text-align: right;
    }
  </style>
</head>
<body>
	<h1>Class Availability Check</h1>

	<jsp:useBean id="availability" class="com.github.marschall.jdtavailabilitycheck.AvailabilityBean">
		<jsp:setProperty name="availability" property="servletRequest" value="<%= request %>" />
		<jsp:setProperty name="availability" property="servletResponse" value="<%= response %>" />
		<jsp:setProperty name="availability" property="httpSession" value="<%= session %>" />
		<jsp:setProperty name="availability" property="servletContext" value="<%= application %>" />
		<jsp:setProperty name="availability" property="servletConfig" value="<%= config %>" />
		<jsp:setProperty name="availability" property="pageContext" value="<%= pageContext %>" />
	</jsp:useBean>
	
	<table>
		<thead>
			<tr><th>Description</th><th>Class</th><th>Visible</th></tr>
		</thead>
		<tbody>
			<tr>
			  <th>JDT compiler class</th>
			  <td><code><jsp:text>${availability.jdtCompilerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.jdtCompilerClassClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>JDT internal compiler class</th>
			  <td><code><jsp:text>${availability.jdtInternalCompilerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.jdtInternalCompilerClassClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>JSR-199 compiler class</th>
			  <td><code><jsp:text>${availability.jsr199CompilerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.jsr199CompilerClassClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>ServletRequest class</th>
			  <td><code><jsp:text>${availability.servletRequestClass}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.servletRequestClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>ServletResponse class</th>
			  <td><code><jsp:text>${availability.servletResponseClass}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.servletResponseClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>HttpSession class</th>
			  <td><code><jsp:text>${availability.httpSessionClass}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.httpSessionClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>ServletContext class</th>
			  <td><code><jsp:text>${availability.servletContextClass}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.servletContextClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>ServletConfig class</th>
			  <td><code><jsp:text>${availability.servletConfigClass}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.servletConfigClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>ServletContext class</th>
			  <td><code><jsp:text>${availability.pageContextClass}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.pageContextClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Log4j Logger class</th>
			  <td><code><jsp:text>${availability.log4jLoggerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.log4jLoggerClassClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Log4j LogManager class</th>
			  <td><code><jsp:text>${availability.log4jLogManagerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.log4jLogManagerClassClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>SLF4J Logger class</th>
			  <td><code><jsp:text>${availability.slf4jLoggerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.slf4jLoggerClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>JCL Logger class</th>
			  <td><code><jsp:text>${availability.jclLoggerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.jclLoggerClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>CGlib Enhancer class</th>
			  <td><code><jsp:text>${availability.cglibEnhancerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.cglibEnhancerClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Guava Maps class</th>
			  <td><code><jsp:text>${availability.guavaMapsClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.guavaMapsClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Dom4j DocumentFactory class</th>
			  <td><code><jsp:text>${availability.dom4jDocumentFactoryClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.dom4jDocumentFactoryClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Jackson Factory class</th>
			  <td><code><jsp:text>${availability.jacksonFactoryClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.jacksonFactoryClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Jettison Configuration class</th>
			  <td><code><jsp:text>${availability.jettisonConfigurationClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.jettisonConfigurationClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>MIME pull class</th>
			  <td><code><jsp:text>${availability.mimePullMessageClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.mimePullMessageClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Apache Tools Tarbuffer class</th>
			  <td><code><jsp:text>${availability.apacheToolsTarbufferClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.apacheToolsTarbufferClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Ant Task class</th>
			  <td><code><jsp:text>${availability.antTaskClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.antTaskClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Woodstox InputFactory class</th>
			  <td><code><jsp:text>${availability.woodstoxInputFactoryClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.woodstoxInputFactoryClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>ASM ClassVisitor class</th>
			  <td><code><jsp:text>${availability.asmClassVisitorClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.asmClassVisitorClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>PersistenceContext class</th>
			  <td><code><jsp:text>${availability.persistenceContextClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.persistenceContextClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>EJB class</th>
			  <td><code><jsp:text>${availability.ejbClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.ejbClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>ElementTraversal class</th>
			  <td><code><jsp:text>${availability.elementTraversalClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.elementTraversalClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>StringUtils class</th>
			  <td><code><jsp:text>${availability.stringUtilsClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.stringUtilsClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>StringUtils3 class</th>
			  <td><code><jsp:text>${availability.stringUtils3ClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.stringUtils3ClassVisible}</jsp:text></code></td>
			</tr>
		</tbody>
	</table>
	
	<h1>ClassLoader</h1>
	<jsp:useBean id="classLoader" class="com.github.marschall.jdtavailabilitycheck.ClassLoaderBean" />
	
	<table>
		<thead>
			<tr><th>Property</th><th>Value</th></tr>
		</thead>
		<tbody>
			<tr>
			  <th>Can check for parallel capable</th>
			  <td><jsp:text>${classLoader.checkPossible}</jsp:text></td>
			</tr>
			<tr>
			  <th>Application and TCCL are same</th>
			  <td><jsp:text>${classLoader.applicationClassLoaderThreadContextClassLoader}</jsp:text></td>
			</tr>
			<tr>
			  <th>EE-API classes loaded from application</th>
			  <td><jsp:text>${classLoader.apiClassLoadedFromApplication}</jsp:text></td>
			</tr>
			<tr>
			  <th>SE-XML-API classes loaded from application</th>
			  <td><jsp:text>${classLoader.seXmlClassLoadedFromApplication}</jsp:text></td>
			</tr>
			<tr>
			  <th>SE-API classes loaded from application</th>
			  <td><jsp:text>${classLoader.seClassLoadedFromApplication}</jsp:text></td>
			</tr>
			<tr>
			  <th>SE-Non-API classes loaded from application</th>
			  <td><jsp:text>${classLoader.seNonApiClassLoadedFromApplication}</jsp:text></td>
			</tr>
			<tr>
			  <th>SE-Non-API classes visible</th>
			  <td><jsp:text>${availability.seNonApiClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>JSTL present</th>
			  <td><jsp:text>${availability.jstlPresent}</jsp:text></td>
			</tr>
			<tr>
			  <th>@Resource loaded form System classloader</th>
			  <td><jsp:text>${availability.resourceLoadedFromSystem}</jsp:text></td>
			</tr>
			<tr>
			  <th>Class URL</th>
			  <td><jsp:text>${classLoader.classUrl}</jsp:text></td>
			</tr>
			<tr>
			  <th>DocumentBuilderFactory</th>
			  <td><jsp:text>${classLoader.documentBuilderFactory}</jsp:text></td>
			</tr>
			<tr>
			  <th>TransformerFactory</th>
			  <td><jsp:text>${classLoader.transformerFactory}</jsp:text></td>
			</tr>
			<tr>
			  <th>Parent URLs</th>
			  <td><jsp:text>${classLoader.parentUrls}</jsp:text></td>
			</tr>
		</tbody>
	</table>
	
	<table>
		<thead>
			<tr><th>Description</th><th>Class</th><th>Parallel Capable</th></tr>
		</thead>
		<tbody>
			<tr>
			  <th>Thread Context ClassLoader</th>
			  <td><code><jsp:text>${classLoader.threadContextClassLoaderName}</jsp:text></code></td>
			  <td><code><jsp:text>${classLoader.threadContextClassLoaderParallelCapable}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Application ClassLoader</th>
			  <td><code><jsp:text>${classLoader.applicationClassLoaderName}</jsp:text></code></td>
			  <td><code><jsp:text>${classLoader.applicationClassLoaderParallelCapable}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>Parent ClassLoader</th>
			  <td><code><jsp:text>${classLoader.parentClassLoaderName}</jsp:text></code></td>
			  <td><code><jsp:text>${classLoader.parentClassLoaderParallelCapable}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>System ClassLoader</th>
			  <td><code><jsp:text>${classLoader.systemClassLoaderName}</jsp:text></code></td>
			  <td><code><jsp:text>${classLoader.systemClassLoaderParallelCapable}</jsp:text></code></td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>