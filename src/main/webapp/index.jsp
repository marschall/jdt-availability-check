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
		</tbody>
	</table>
</body>
</html>