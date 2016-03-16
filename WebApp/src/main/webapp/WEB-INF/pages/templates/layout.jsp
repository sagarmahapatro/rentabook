<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<spring:url
	value="/resources/bootstrap-3.3.6-dist/css/bootstrap-theme.css"
	var="bootstrapthemecss" />
<spring:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.css"
	var="bootstrapcss" />
<spring:url value="/resources/app/css/style.css" var="stylecss" />

<link href="${bootstrapthemecss}" rel="stylesheet">
<link href="${bootstrapcss}" rel="stylesheet">
<link href="${stylecss}" rel="stylesheet">
</head>
<body>
	<div class="app-wraper">
		<div class="app-header">
			<tiles:insertAttribute name="header" />
		</div>
		<div class="app-menu">
			<tiles:insertAttribute name="menu" />
		</div>
		<div class="app-container">
			<tiles:insertAttribute name="body" />
		</div>

		<hr>
		<footer class="app-footer">
			<tiles:insertAttribute name="footer" />
		</footer>
	</div>
	
	<spring:url value="/resources/jquary/jquery-2.2.1.js" var="jqueryjs" />
	<spring:url value="/resources/bootstrap-3.3.6-dist/js/bootstrap.js"
		var="bootstrapjs" />
	<spring:url value="/resources/app/js/main.js" var="mainjs" />
	<script src="${jqueryjs}"></script>
	<script src="${bootstrapjs}"></script>
	<script src="${mainjs}"></script>
</body>
</html>