package com.example.android.converter;

public class LenghClass {
    private double unit;
    public LenghClass(double unit)
    {
        this.unit=unit;
    }
    public double kilo_to_meter()
    {
        return unit*1000;
    }
    public double kilo_to_centi()
    {
        return unit * 100000;
    }
    public double kilo_to_milli()
    {
        return unit * 1000000;
    }
    public  double meter_to_kilo()
    {
        return unit / 1000;
    }
    public double meter_to_centi()
    {
        return unit * 100;
    }
    public double meter_to_milli()
    {
        return unit * 1000;
    }
    public  double centi_to_kilo()
    {
        return unit / 100000;
    }
    public double centi_to_meter()
    {
        return unit / 100;
    }
    public double centi_to_milli()
    {
        return unit * 10;
    }
    public double milli_to_kilo()
    {
        return unit / 1000000;
    }
    public  double milli_to_meter()
    {
        return unit / 1000;
    }
    public  double milli_to_centi()
    {
        return unit / 10;
    }
}
