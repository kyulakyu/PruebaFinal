package test;

import java.math.BigDecimal;

import calculo.CalculadoraDescuentos;
import model.entity.Doctor;
import model.entity.Paciente;

public class PruebasDescuentos {

    public static void main(String[] args) {
        // Pruebas en condiciones normales
        Paciente paciente1 = new Paciente(1, "Juan Pérez", "15/03/1985");
        Doctor doctor1 = new Doctor();
        doctor1.setExperiencia(7);
        doctor1.setEspecialidadId(1);

        BigDecimal descuentoEdad = CalculadoraDescuentos.calcularDescuentoEdad(paciente1);
        BigDecimal descuentoExperienciaEspecialidad = CalculadoraDescuentos.calcularDescuentoExperienciaEspecialidad(doctor1);

        System.out.println("Descuento por Edad: " + descuentoEdad);
        System.out.println("Descuento por Experiencia y Especialidad: " + descuentoExperienciaEspecialidad);

        // Pruebas en condiciones de borde
        Paciente paciente2 = new Paciente(2, "María López", "01/01/2018");
        Doctor doctor2 = new Doctor();
        doctor2.setExperiencia(20);
        doctor2.setEspecialidadId(4);

        BigDecimal descuentoEdad2 = CalculadoraDescuentos.calcularDescuentoEdad(paciente2);
        BigDecimal descuentoExperienciaEspecialidad2 = CalculadoraDescuentos.calcularDescuentoExperienciaEspecialidad(doctor2);

        System.out.println("Descuento por Edad: " + descuentoEdad2);
        System.out.println("Descuento por Experiencia y Especialidad: " + descuentoExperienciaEspecialidad2);
    }
}
