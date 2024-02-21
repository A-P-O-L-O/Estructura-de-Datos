package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pila {

    public static void main(String[] args) {

        Stack<Ciudades> ciudadesStack = new Stack<>();

        System.out.println("PILA VACIA: " + ciudadesStack);
        System.out.println("¿LA PILA ESTA VACIA?: " + ciudadesStack.isEmpty());


        ciudadesStack.push(new Ciudades("Bogota"));
        ciudadesStack.push(new Ciudades("Cartagena"));
        ciudadesStack.push(new Ciudades("Barranquilla"));
        ciudadesStack.push(new Ciudades("Medellin"));
        ciudadesStack.push(new Ciudades("Pereira"));

        System.out.println("-----ESTA ES LA PILA CON ELEMENTOS-----");

        for (Ciudades citi: ciudadesStack){
            System.out.println(citi.getNombre());
        }

        System.out.println("¿LA PILA ESTA VACIA?: " + ciudadesStack.isEmpty());


        ciudadesStack.pop();

        System.out.println("---------PILA DESPUES DE HACER USO DE LIFO---------");

        while (!ciudadesStack.isEmpty()) {
            System.out.println(ciudadesStack.pop().getNombre());
        }

    }
}