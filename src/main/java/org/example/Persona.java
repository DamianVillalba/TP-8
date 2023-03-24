package org.example;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
public class Persona {
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;
    @Getter @Setter
    private String fechaNacimiento;
}
