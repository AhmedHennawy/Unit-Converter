package com.example.android.converter;

public class TemperatureClass {
    private double unit;
    public  TemperatureClass(double unit)
    {
        this.unit = unit;
    }
    public double get_unit()
    {
        return unit;
    }
    public double fah_to_cel()
    {
        double x=(unit-32)*5/9;
        return x;
    }
    public double kelvin_to_cel( )
    {
        double x=unit-273.15;
        return x;
    }

    public double cel_to_fah()
    {

        return (unit*9/5)*32;
    }
    public double cel_to_kelvin()
    {

        return unit+273.15;
    }
}
