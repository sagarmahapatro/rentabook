<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<table border="1" cellpadding="2" cellspacing="2" align="center">
		<tr>
			<td height="30" colspan="2"><tiles:insertAttribute name="header" />
			</td>
		</tr>
		<tr>
			<td height="250"><tiles:insertAttribute name="menu" /></td>
			<td width="350"><tiles:insertAttribute name="body" /></td>
		</tr>
		<tr>
			<td height="30" colspan="2"><tiles:insertAttribute name="footer" />
			</td>
		</tr>
	</table>
	<link href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap-theme.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/bootstrap-3.3.6-dist/js/bootstrap.js" />"></script>
	<script src="<c:url value="/resources/jquary/jjquery-2.2.1.js" />"></script>
	<link href="<c:url value="/resources/app/css/style.css" />" rel="stylesheet">
	
	<script src="<c:url value="/resources/app/css/js/main.js" />"></script>
</body>
</html>