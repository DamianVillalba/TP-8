package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // defino el scanner a usar
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas a ingresar en la lista: ");
        // defino la cantidad de personas a ingresar segun quiera el usuario
        int cantidadPersonas = scn.nextInt();
        //defino un contador que aumentara en el bucle hasta que llegue a la cantidad de personas esperadas.
        int contadorPersonas = 0;
        List<Persona> listaPersonas = new ArrayList<>();
        while (contadorPersonas != cantidadPersonas){
            // pido los datos para instanciar a las personas pedidas
            Persona p = new Persona();
            System.out.println("Ingrese el nombre de la persona a ingresar: ");
            String nombre = scn.next();
            p.setNombre(nombre);
            System.out.println("Ingrese el apellido de la persona a ingresar: ");
            String apellido = scn.next();
            p.setApellido(apellido);
            System.out.println("Ingrese la fecha de nacimiento de la persona a ingresar (dd/mm/aaaa): ");
            String fechaNacimiento = scn.next();
            p.setFechaNacimiento(fechaNacimiento);
            listaPersonas.add(p);
            contadorPersonas++;
            System.out.println("\nPersona numero " + contadorPersonas + " ingresada correctamente.\n");
        }
        //muestro a las personas ingresadas si desea el usuario
        System.out.println("Quiere ver el listado de personas? elija: y (si)/n (no)");
        String opcion = scn.next();
        if (opcion.equals("y")){
            imprimirPersonas(listaPersonas);
        }
        System.out.println("\nGracias por utilizar nuestro programa!");
    }

    private static void imprimirPersonas(List<Persona> personas){
        System.out.println("Personas ingresadas: ");
        for (int indice = 0; indice < personas.size(); indice++){
            System.out.println( (indice + 1) + ". Nombre: " + personas.get(indice).getNombre() + " Apellido: " + personas.get(indice).getApellido() +
                    " Fecha de Nacimiento: " + personas.get(indice).getFechaNacimiento());
        }
    }
}