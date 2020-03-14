package com.example.android.converter;

public class CurrencyClass {
    private double unit;
    public CurrencyClass(double unit)
    {
        this.unit = unit;
    }
    public double get_unit()
    {
        return unit;
    }
    public double dollar_to_ep()
    {
        return unit/16.56;
    }
    public double dollar_to_euro()
    {
        double x = dollar_to_ep();
        return x*18.47;
    }
    public double dollar_to_ukp()
    {
        double x = dollar_to_ep();
        return x*20.14;
    }
    public double euro_to_ep()
    {
        return unit/18.47;
    }
    public double euro_to_dollar()
    {
        double x = euro_to_ep();
        return x*16.56;
    }
    public double euro_to_ukp()
    {
        double x = euro_to_ep();
        return x*20.14;
    }
    public double ukp_to_ep()
    {
        return unit/20.14;
    }
    public double ukp_to_dollar()
    {
        double x = ukp_to_ep();
        return x*16.56;
    }
    public double ukp_to_euro()
    {
        double x = ukp_to_ep();
        return x*18.47;
    }


    public double ep_to_dollar()
    {
        return unit*16.56;
    }
    public double ep_to_euro()
    {

        return unit*18.47;
    }
    public double ep_to_ukp()
    {

        return unit*20.14;
    }
}
