package ar.com.xeven;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> visitas = new LinkedList<>();
        Set<String> asistentes = new TreeSet<>();
        Queue<String> cola = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        String siguiente;
        do{
            System.out.print("Siguiente: ");
            siguiente = sc.nextLine();
            System.out.println();
            if(siguiente!="") {
                asistentes.add(siguiente);
                visitas.add(siguiente);
                cola.add(siguiente);
            }
        } while(!siguiente.equals(""));

        System.out.println("Asistentes: "+asistentes.size());
        System.out.println("Visitas: "+visitas.size());
        System.out.println("Cola: "+cola.size());
        System.out.println("Asistentes: "+asistentes);
        System.out.println("Visitas: "+visitas);
        System.out.println("Cola: "+cola);

        System.out.println("Primero en cola: "+cola.poll());
        System.out.println("Primer visita: "+visitas.get(0));
        System.out.println("2.Visitas: "+visitas);
        System.out.println("2.Cola: "+cola);

    }
}
