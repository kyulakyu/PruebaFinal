<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="es">

<head>
<meta charset="UTF-8">

<title>Historial Clinico</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/Prueba.final/res/css/estilo.css">
</head>

<body>
	<%@ include file='navbar.jsp'%>
	<div class="container">
		<h1>Historia Clinica</h1>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>ID</th>
					<th>Paciente ID</th>
					<th>Doctor ID</th>
					<th>Fecha Cita</th>
					<th>Sintomas</th>
					<th>Diagnostico</th>
					<th>Tratamiento</th>
					<th>Editar</th>

				</tr>
			</thead>
			<tbody>
				<%-- Iterar a través de la lista de capacitaciones enviada desde el controlador --%>
				<c:forEach var="historial" items="${historia_clinica}">
					<tr>
						<td>${historia.id}</td>
						<td>${historia.pacienteId}</td>
						<td>${historia.doctorId}</td>
						<td>${historia.fechaCita}</td>
						<td>${historia.sintomas}</td>
						<td>${historia.diagnostico}</td>
						<td>${historia.tratamiento}</td>
					<td><a href="/PruebaFinal/EditarHistorial?id=<%=historial.getId()%>" class="btn btn-primary">Editar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<%@ include file='footer.jsp'%>
</body>

</html>