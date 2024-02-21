package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {

    public static void main(String[] args) {

        Queue<Ciudades> ciudadesQueue = new LinkedList<>();

        System.out.println("COLA VACIA: " + ciudadesQueue);
        System.out.println("¿LA COLA ESTA VACIA?: " + ciudadesQueue.isEmpty());


        ciudadesQueue.offer(new Ciudades("Bogota"));
        ciudadesQueue.offer(new Ciudades("Cartagena"));
        ciudadesQueue.offer(new Ciudades("Barranquilla"));
        ciudadesQueue.offer(new Ciudades("Medellin"));
        ciudadesQueue.offer(new Ciudades("Pereira"));

        System.out.println("----ESTA ES LA COLA CON ELEMENTOS----");

        for (Ciudades citi : ciudadesQueue) {
            System.out.println(citi.getNombre());
        }

        System.out.println("¿LA COLA ESTA VACIA?: " + ciudadesQueue.isEmpty());



        ciudadesQueue.poll();

        System.out.println("---------COLA DESPUES DE HACER USO DE FIFO---------");

        // Imprimir elementos de la cola (ahora solo se mostrará el nombre de la ciudad)
        while (!ciudadesQueue.isEmpty()) {
            System.out.println(ciudadesQueue.poll().getNombre());
        }
    }
}
