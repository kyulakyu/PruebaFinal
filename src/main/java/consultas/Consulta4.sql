USE Clinica;
SELECT P.ID AS Paciente_ID, P.Nombre AS Paciente, HC.Diagnostico, HC.Tratamiento
FROM Pacientes P
JOIN Citas C ON P.ID = C.Paciente_ID
JOIN Historia_Clinica HC ON C.ID = HC.ID
WHERE HC.Fecha_Cita = (SELECT MAX(Fecha_Cita) FROM Historia_Clinica WHERE Paciente_ID = P.ID)
ORDER BY Paciente_ID;