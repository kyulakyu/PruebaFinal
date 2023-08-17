USE Clinica;
SELECT D.Nombre AS Nombre_Doctor, COUNT(*) AS Cantidad_Pacientes_Atendidos
FROM Doctores AS D
JOIN Citas AS C ON D.ID = C.Doctor_ID
GROUP BY D.Nombre;