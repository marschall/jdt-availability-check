<!DOCTYPE html>
<html>
<head>
	<title>Class Availability Check</title>
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
			  <td><jsp:text>${availability.jdtCompilerClassName}</jsp:text></td>
			  <td><jsp:text>${availability.jdtCompilerClassClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>JDT internal compiler class</th>
			  <td><jsp:text>${availability.jdtInternalCompilerClassName}</jsp:text></td>
			  <td><jsp:text>${availability.jdtInternalCompilerClassClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>JSR-199 compiler class</th>
			  <td><jsp:text>${availability.jsr199CompilerClassName}</jsp:text></td>
			  <td><jsp:text>${availability.jsr199CompilerClassClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>ServletRequest class</th>
			  <td><jsp:text>${availability.servletRequestClass}</jsp:text></td>
			  <td><jsp:text>${availability.servletRequestClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>ServletResponse class</th>
			  <td><jsp:text>${availability.servletResponseClass}</jsp:text></td>
			  <td><jsp:text>${availability.servletResponseClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>HttpSession class</th>
			  <td><jsp:text>${availability.httpSessionClass}</jsp:text></td>
			  <td><jsp:text>${availability.httpSessionClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>ServletContext class</th>
			  <td><jsp:text>${availability.servletContextClass}</jsp:text></td>
			  <td><jsp:text>${availability.servletContextClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>ServletConfig class</th>
			  <td><jsp:text>${availability.servletConfigClass}</jsp:text></td>
			  <td><jsp:text>${availability.servletConfigClassVisible}</jsp:text></td>
			</tr>
			<tr>
			  <th>ServletContext class</th>
			  <td><jsp:text>${availability.pageContextClass}</jsp:text></td>
			  <td><jsp:text>${availability.pageContextClassVisible}</jsp:text></td>
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
			  <th>API classes loaded from application</th>
			  <td><jsp:text>${classLoader.apiClassLoadedFromApplication}</jsp:text></td>
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
			  <td><jsp:text>${classLoader.threadContextClassLoaderName}</jsp:text></td>
			  <td><jsp:text>${classLoader.threadContextClassLoaderParallelCapable}</jsp:text></td>
			</tr>
			<tr>
			  <th>Application ClassLoader</th>
			  <td><jsp:text>${classLoader.applicationClassLoaderName}</jsp:text></td>
			  <td><jsp:text>${classLoader.applicationClassLoaderParallelCapable}</jsp:text></td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>