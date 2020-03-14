package com.example.android.converter;

public class SpeedClass {
    private double unit;
    public SpeedClass(double unit)
    {
        this.unit = unit;
    }
    public double get_unit()
    {
        return unit;
    }
    public double mph_to_kph()
    {
        return unit*1.6;
    }
    public double mph_to_mps()
    {
        return unit * 1.6*(5/18);
    }
    public double mph_to_cmps()
    {
        return unit * 1.6 * (5 / 18)*100;
    }
    public double kph_to_mph()
    {
        return unit / 1.6;
    }
    public double kph_to_mps()
    {
        return unit *  (5 / 18);
    }
    public double kph_to_cmps()
    {
        return unit *  (5 / 18) * 100;
    }
    public double mps_to_mph()
    {
        return unit * (18 / 5) / 1.6;
    }
    public double mps_to_kph()
    {
        return unit * (18 / 5);
    }
    public double mps_to_cmps()
    {
        return unit  * 100;
    }
    public double cmps_to_mph()
    {
        return (unit/100) * (18 / 5) / 1.6;
    }
    public double cmps_to_kph()
    {
        return (unit / 100) * (18 / 5);
    }
    public double cmps_to_mps()
    {
        return unit / 100;
    }
}
