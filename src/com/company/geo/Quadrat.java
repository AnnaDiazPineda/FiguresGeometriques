package com.company.geo;

public class Quadrat extends Forma {
    float costat1;
    float costat2;
    public Quadrat(float _costat1,float _costat2){
         costat1 = _costat1;
         costat2 = _costat2;
    }
    public float getArea() {
        area = costat1 * costat2;
        return area;
    }

    public float calculaPerimetre(){
        return costat1*2+costat2*2;
    }

    public float getCostat1(){
        return costat1;
    }
}
