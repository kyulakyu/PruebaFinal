USE Clinica;
SELECT D.Nombre AS Doctor, SUM(F.Monto) AS Monto_Total
FROM Doctores D
JOIN Citas C ON D.ID = C.Doctor_ID
JOIN Facturas F ON C.Factura_ID = F.ID
GROUP BY D.Nombre
ORDER BY Monto_Total DESC;