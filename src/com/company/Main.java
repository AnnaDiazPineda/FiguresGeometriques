package com.company;
import com.company.geo.Cercle;
import com.company.geo.Forma;
import com.company.geo.Quadrat;
import com.company.geo.Triangle;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {


        Forma cercle = new Cercle(2);
        Triangle triangle = new Triangle(2,4);
        Triangle triangle2 = new Triangle(400,400);
        Quadrat quadrat = new Quadrat(5,2);

        /*ArrayList<Forma> contenidor = new ArrayList<Forma>();

        contenidor.add(triangle);
        contenidor.add(triangle2);
        contenidor.add(cercle);
        contenidor.add(quadrat);

        triangle2.compareTo(quadrat);

        int i=0;
        float total=0;
        for (i=0; i<contenidor.size(); i++) {
            total = total + contenidor.get(i).getArea();
        }*/


        Forma[] array = {triangle,triangle2,cercle,quadrat};

        System.out.println("->"+triangle2.compareTo(triangle));
        int i=0;
        float total=0;
        for (i=0; i<array.length; i++) {
            total = total + array[i].getArea();
        }
        System.out.println("Total:"+total);

        for (i=0; i<array.length; i++) {
            System.out.print(","+array[i].getArea());
        }

        Arrays.sort(array);

        System.out.println("->");

        for (i=0; i<array.length; i++) {
            System.out.print(","+array[i].getArea());
        }
       // contenidor.add(quadrat);
       /// contenidor.add(cercle);




    }
}
