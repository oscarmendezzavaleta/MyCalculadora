package com.example.omendezz.mycalculadora;

/**
 * Created by omendezz on 24/10/2016.
 */

public class calculadora {
    double a,b ;
    public calculadora() {a=0;b=0;}
    public void setA (double a) {this.a=a;}
    public void setB (double b) {this.b=b;}
    public  double sumar(){return (a+b); }
    public  double restar(){return (a-b); }
}
