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

<title>Crear Historial</title>
</head>

<body class="capacitacion">
	<%@ include file='navbar.jsp'%>
	<div class="form-container">
		<div class="contacto">
			<form action="/Prueba.final/CrearHistorial" method="post"
				onsubmit="return enviarFormulario(event)">
				<h1 class="tituloContacto">Crear Historial</h1>
				<label for="id">Ingrese ID:</label><br>
				<input type="text" id="id" name="id" title="Campo Obligatorio"><br> <br>
				<label for="pacienteId">Ingrese ID Paciente:</label><br> 
				<input type="text" id="pacienteId" name="pacienteId" title="Campo Obligatorio"><br><br> 
				<label for="doctorId">Ingrese ID Doctor:</label><br> 
				<input type="text" id=""doctorId"" name="doctorId" title="Campo Obligatorio"><br><br>
				<label for="fechaCita">Ingrese la Fecha de la Cita:</label><br> 
				<input type="text" id="fechaCita" name="fechaCita" title="Campo Obligatorio"><br> <br>
				<label for="sintomas">Ingrese Sintomas del Paciente:</label><br>
				<input type="text" id="sintomas" name="sintomas" title="Campo Obligatorio"><br><br> 
				<label for="diagnostico">Ingrese Diagnostico del Paciente:</label><br> 
				<input type="text" id="diagnostico" name="diagnostico" title="Campo Obligatorio"><br> <br>
				<label for="tratamiento">Ingrese Tratamiento del Paciente:</label><br> 
				<input type="text" id="tratamiento"	name="tratamiento"	title="Campo Obligatorio"><br><br> 
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

