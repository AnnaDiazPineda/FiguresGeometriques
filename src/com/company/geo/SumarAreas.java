package com.company.geo;

public class SumarAreas {
    //contructor, ha de tenir el mateix nom de la clase
    public SumarAreas(){

    }


    //suma areas
    static float sumarAreas(float areas[]){
        int i=0;
        float total=0;
        for (i=0; i<areas.length; i++)
            total = total + areas[i];

        return total;
    }

}
