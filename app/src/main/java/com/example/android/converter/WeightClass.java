package com.example.android.converter;

public class WeightClass {
    private double unit;
    public WeightClass(double unit)
    {
        this.unit = unit;
    }
    public double get_unit()
    {
        return unit;
    }
    public double ton_to_kilo()
    {
        return unit * 1000;
    }
    public double ton_to_gram()
    {
        return unit * 1000000;
    }
    public double ton_to_milli()
    {
        return unit * 1000000000;
    }
    public double kilo_to_ton()
    {
        return unit / 1000;
    }
    public double kilo_to_gram()
    {
        return unit * 1000;
    }
    public double kilo_to_milli()
    {
        return unit * 1000000;
    }
    public double gram_to_ton()
    {
        return unit / 1000000;
    }
    public double gram_to_kilo()
    {
        return unit / 1000;
    }
    public double gram_to_milli()
    {
        return unit * 1000;
    }
    public double milli_to_ton()
    {
        return unit / 1000000000;
    }
    public double milli_to_kilo()
    {
        return unit / 1000000;
    }
    public double milli_to_gram()
    {
        return unit / 1000;
    }
}
