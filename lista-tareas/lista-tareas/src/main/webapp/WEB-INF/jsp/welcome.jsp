<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="common/header.jspf"%>
	<%@ include file="common/navigation.jspf"%>
	<div class="container">

		<div class="panel panel-primary">
			<div class="panel-heading">Página principal</div>
			<div class="panel-body">
				Bienvenido ${name}! <a href="/list-todos">Pulsa aquí</a> para
				gestionar tus tareas.
			</div>
		</div>
	</div>
	<%@ include file="common/footer.jspf"%>
</body>
</html>