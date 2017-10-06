package com.company.geo;

public class Triangle extends Forma{
    float base;
    float altura;

    public Triangle(float _base, float _altura){
        base= _base;
        altura = _altura;
    }
    public float getArea()
    {
        float areaTriangle= (base * altura)/2;
        return areaTriangle;
    }

    public float getBase() {
        return base;
    }

}


