package com.company.geo;

public abstract class Forma implements Comparable<Forma>{
    public Forma(){

    }
    float area = 0;

     public abstract float getArea();

    public int compareTo(Forma acomparar){
        return (int)( acomparar.getArea() - this.getArea()  );
    }


}
