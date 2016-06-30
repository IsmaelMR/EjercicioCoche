import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //List<Coche> ordenarMatriculaList = new ArrayList<>();


        Coche coche1 = new Coche(1L, "Renault", "Megane", 2007, "9236478-Y");
        Coche coche2 = new Coche(2L,"Ferrari","FX-16",1998,"5214547-B");
        Coche coche3 = new Coche(3L,"Mercedes","GT-50",2001,"3456478-C");
        Coche coche4 = new Coche(4L,"Honda","Turbo-50",2015,"7556478-L");
        Coche coche5 = new Coche(5L,"Toyota","Toy-50",2013,"6656478-T");

/*
        // METODO 1 DE ORDENACION
        ordenarMatriculaList.add(coche1);
        ordenarMatriculaList.add(coche2);
        ordenarMatriculaList.add(coche3);
        ordenarMatriculaList.add(coche4);
        ordenarMatriculaList.add(coche5);

        Collections.sort(ordenarMatriculaList); // Instruccion que permite ordenar el arrayList por el parametro pasado en el metodo "compareTo" de la clase Coche


        for (Coche listaCoches : ordenarMatriculaList) {

            System.out.println(listaCoches);

        }
*/

        // METODO 2 DE ORDENACION
        //Set setcoches = new TreeSet<>();
        Set setcoches = new TreeSet(new CompararCochePorAnyo());

        setcoches.add(coche1);
        setcoches.add(coche2);
        setcoches.add(coche3);
        setcoches.add(coche4);
        setcoches.add(coche5);

        System.out.println(setcoches);

    }

}
