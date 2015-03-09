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
			  <th>SLF4J Logger class</th>
			  <td><code><jsp:text>${availability.slf4jLoggerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.slf4jLoggerClassVisible}</jsp:text></code></td>
			</tr>
			<tr>
			  <th>JCL Logger class</th>
			  <td><code><jsp:text>${availability.jclLoggerClassName}</jsp:text></code></td>
			  <td><code><jsp:text>${availability.jclLoggerClassVisible}</jsp:text></code></td>
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
		</tbody>
	</table>
	
</body>
</html>