package calculo;

import java.math.BigDecimal;
import model.entity.Doctor;
import model.entity.Paciente;

public class CalculadoraDescuentos {
    
    public static BigDecimal calcularDescuentoEdad(Paciente paciente) {
        int edad = paciente.calcularEdad();
        
        if (edad <= 5) {
            return new BigDecimal("0.05"); // 5% de descuento
        } else if (edad > 5 && edad < 13) {
            return new BigDecimal("0.03"); // 3% de descuento
        } else if (edad >= 13 && edad <= 35) {
            return BigDecimal.ZERO; // Sin descuento
        } else if (edad > 35 && edad < 60) {
            return new BigDecimal("0.10"); // 10% de descuento
        } else {
            return new BigDecimal("0.30"); // 30% de descuento
        }
    }
    
    public static BigDecimal calcularDescuentoExperienciaEspecialidad(Doctor doctor) {
        int experiencia = doctor.getExperiencia();
        int especialidadId = doctor.getEspecialidadId();
        
        if (experiencia < 10) {
            return new BigDecimal("0.15"); // 15% de descuento
        } else if (experiencia > 20) {
            return new BigDecimal("0.05"); // 5% de descuento
        } else {
            if (especialidadId == 1 || especialidadId == 3) {
                if (experiencia > 10 && experiencia < 20) {
                    return new BigDecimal("0.05"); // 5% de descuento
                }
            } else if (especialidadId == 4 || especialidadId == 5) {
                if (experiencia > 5) {
                    return new BigDecimal("0.10"); // 10% de descuento
                }
            }
        }
        
        return BigDecimal.ZERO; // Sin descuento
    }
}
