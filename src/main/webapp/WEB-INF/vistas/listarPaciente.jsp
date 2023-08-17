<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="es">

<head>
<meta charset="UTF-8">

<title>Listado de Pacientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/Prueba.final/res/css/estilo.css">
</head>

<body>
	<%@ include file='navbar.jsp'%>
	<div class="container">
		<h1>Listado de Pacientes</h1>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Fecha de Nacimiento</th>

				</tr>
			</thead>
			<tbody>
				<%-- Iterar a través de la lista de capacitaciones enviada desde el controlador --%>
				<c:forEach var="paciente" items="${pacientes}">
					<tr>
						<td>${paciente.id}</td>
						<td>${paciente.nombre}</td>
						<td>${paciente.fechaNacimiento}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<%@ include file='footer.jsp'%>
</body>

</html>