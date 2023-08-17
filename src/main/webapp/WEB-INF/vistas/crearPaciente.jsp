<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/Prueba.final/res/css/estilo.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">

<title>Crear Paciente</title>
</head>

<body class="capacitacion">
	<%@ include file='navbar.jsp'%>
	<div class="form-container">
		<div class="contacto">
			<form action="/Prueba.final/CrearPaciente" method="post"
				onsubmit="return enviarFormulario(event)">
				<h1 class="tituloContacto">Crear Paciente</h1>
				<label for="id">Ingrese ID:</label><br>
				<input type="text" id="id" name="id" title="Campo Obligatorio"><br> <br>
				<label for="nombre">Ingrese Nombre del Paciente:</label><br> 
				<input type="text" id="nombre" name="nombre" title="Campo Obligatorio"><br><br> 
				<label for="fechaNacimiento">Ingrese Fecha de Nacimiento del Paciente:</label><br>
				<input type="text" id="fechaNacimiento" name="fechaNacimiento" title="Campo Obligatorio"><br><br> 
				<div class="contenedor-boton">
					<input type="submit" value="Enviar" class="boton-enviar">
				</div>
			</form>
		</div>
	</div>


	<div style="height: 100px;"></div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<%@ include file='footer.jsp'%>
</body>

</html>

