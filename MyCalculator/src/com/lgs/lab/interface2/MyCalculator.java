package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
    double a, b;

    public MyCalculator (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Add ( ) {
        return a+b;
    }

    @Override
    public double Multiply ( ) {
        return a*b;
    }

    @Override
    public double Subtract ( ) {
        return a-b;
    }

    @Override
    public double Divide ( ) {
        return b/a;
    }
}
