package com.company.geo;

public class Cercle extends Forma{
    public Cercle(float _radi) {

        radi = _radi;
    }
    float pi = 3.1415f;
    float radi = 0;

    public float getArea(){
        area = 2*pi* radi;
        return area;
    }
}