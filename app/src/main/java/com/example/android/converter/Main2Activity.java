package com.example.android.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    Spinner from,to;
    String FromItem,ToItem;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent i = getIntent();
         name = i.getStringExtra("name");
        setTitle(name);
        from = (Spinner)findViewById(R.id.fromList);
        to = (Spinner)findViewById(R.id.toList);
        final  TextView val =(TextView)findViewById(R.id.value);
        final  TextView unit =(TextView)findViewById(R.id.unit);
        Button b = (Button)findViewById(R.id.button);
        if(name.equals("Length"))
            LengthUnits();
        else if(name.equals("Weight"))
            WeightUnits();
        else if(name.equals("Speed"))
            SpeedUnits();
        else if(name.equals("Temperature"))
            TempUnits();
        else if(name.equals("Currency"))
            currencyUnit();
        from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                FromItem = adapterView.getItemAtPosition(i).toString();
                unit.setText(FromItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ToItem = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText)findViewById(R.id.editText);
                if(text.getText().toString().equals(""))
                {
                    Toast.makeText(Main2Activity.this,"Enter The Value",Toast.LENGTH_SHORT).show();

                }
                else {
                    int num = Integer.parseInt(text.getText().toString());

                    if (name.equals("Length")) {
                        LenghClass object = new LenghClass(num);
                        if (FromItem.equals("Kilometer") && ToItem.equals("Meter"))
                            val.setText(String.valueOf(object.kilo_to_meter()) + "  " + ToItem);
                        else if (FromItem.equals("Kilometer") && ToItem.equals("Centimeter"))
                            val.setText(String.valueOf(object.kilo_to_centi()) + "  " + ToItem);
                        else if (FromItem.equals("Kilometer") && ToItem.equals("Millimeter"))
                            val.setText(String.valueOf(object.kilo_to_milli()) + "  " + ToItem);
                        else if (FromItem.equals("Meter") && ToItem.equals("Centimeter"))
                            val.setText(String.valueOf(object.meter_to_centi()) + "  " + ToItem);
                        else if (FromItem.equals("Meter") && ToItem.equals("Kilometer"))
                            val.setText(String.valueOf(object.meter_to_kilo()) + "  " + ToItem);
                        else if (FromItem.equals("Meter") && ToItem.equals("Millimeter"))
                            val.setText(String.valueOf(object.meter_to_milli()) + "  " + ToItem);
                        else if (FromItem.equals("Centimeter") && ToItem.equals("Kilometer"))
                            val.setText(String.valueOf(object.centi_to_kilo()) + "  " + ToItem);
                        else if (FromItem.equals("Centimeter") && ToItem.equals("Meter"))
                            val.setText(String.valueOf(object.centi_to_meter()) + "  " + ToItem);
                        else if (FromItem.equals("Centimeter") && ToItem.equals("Millimeter"))
                            val.setText(String.valueOf(object.centi_to_milli()) + "  " + ToItem);
                        else if (FromItem.equals("Millimeter") && ToItem.equals("Centimeter"))
                            val.setText(String.valueOf(object.milli_to_centi()) + "  " + ToItem);
                        else if (FromItem.equals("Millimeter") && ToItem.equals("Kilometer"))
                            val.setText(String.valueOf(object.milli_to_kilo()) + "  " + ToItem);
                        else if (FromItem.equals("Millimeter") && ToItem.equals("Meter"))
                            val.setText(String.valueOf(object.milli_to_meter()) + "  " + ToItem);
                        else
                            Toast.makeText(Main2Activity.this, "You Should Enter Different Units", Toast.LENGTH_SHORT).show();
                    } else if (name.equals("Weight")) {

                        WeightClass object = new WeightClass(num);
                        if (FromItem.equals("Kilogram") && ToItem.equals("Gram"))
                            val.setText(String.valueOf(object.kilo_to_gram()) + "  " + ToItem);
                        else if (FromItem.equals("Kilogram") && ToItem.equals("MilliGram"))
                            val.setText(String.valueOf(object.kilo_to_milli()) + "  " + ToItem);
                        else if (FromItem.equals("Kilogram") && ToItem.equals("Ton"))
                            val.setText(String.valueOf(object.kilo_to_ton()) + "  " + ToItem);
                        else if (FromItem.equals("Gram") && ToItem.equals("Kilogram"))
                            val.setText(String.valueOf(object.gram_to_kilo()) + "  " + ToItem);
                        else if (FromItem.equals("Gram") && ToItem.equals("MilliGram"))
                            val.setText(String.valueOf(object.gram_to_milli()) + "  " + ToItem);
                        else if (FromItem.equals("Gram") && ToItem.equals("Ton"))
                            val.setText(String.valueOf(object.gram_to_ton()) + "  " + ToItem);
                        else if (FromItem.equals("MilliGram") && ToItem.equals("Kilogram"))
                            val.setText(String.valueOf(object.milli_to_kilo()) + "  " + ToItem);
                        else if (FromItem.equals("MilliGram") && ToItem.equals("Gram"))
                            val.setText(String.valueOf(object.milli_to_gram()) + "  " + ToItem);
                        else if (FromItem.equals("MilliGram") && ToItem.equals("Ton"))
                            val.setText(String.valueOf(object.milli_to_ton()) + "  " + ToItem);
                        else if (FromItem.equals("Ton") && ToItem.equals("Kilogram"))
                            val.setText(String.valueOf(object.ton_to_kilo()) + "  " + ToItem);
                        else if (FromItem.equals("Ton") && ToItem.equals("Gram"))
                            val.setText(String.valueOf(object.ton_to_gram()) + "  " + ToItem);
                        else if (FromItem.equals("Ton") && ToItem.equals("MilliGram"))
                            val.setText(String.valueOf(object.ton_to_milli()) + "  " + ToItem);
                        else
                            Toast.makeText(Main2Activity.this, "You Should Enter Different Units", Toast.LENGTH_SHORT).show();

                    } else if (name.equals("Speed")) {
                        SpeedClass object = new SpeedClass(num);
                        if (FromItem.equals("Km/H") && ToItem.equals("Cm/S"))
                            val.setText(String.valueOf(object.kph_to_cmps()) + "  " + ToItem);
                        else if (FromItem.equals("Km/H") && ToItem.equals("M/H"))
                            val.setText(String.valueOf(object.kph_to_mph()) + "  " + ToItem);
                        else if (FromItem.equals("Km/H") && ToItem.equals("M/S"))
                            val.setText(String.valueOf(object.kph_to_mps()) + "  " + ToItem);
                        else if (FromItem.equals("M/H") && ToItem.equals("M/S"))
                            val.setText(String.valueOf(object.mph_to_mps()) + "  " + ToItem);
                        else if (FromItem.equals("M/H") && ToItem.equals("Km/H"))
                            val.setText(String.valueOf(object.mph_to_kph()) + "  " + ToItem);
                        else if (FromItem.equals("M/H") && ToItem.equals("Cm/S"))
                            val.setText(String.valueOf(object.mph_to_cmps()) + "  " + ToItem);
                        else if (FromItem.equals("M/S") && ToItem.equals("M/H"))
                            val.setText(String.valueOf(object.mps_to_mph()) + "  " + ToItem);
                        else if (FromItem.equals("M/S") && ToItem.equals("Km/H"))
                            val.setText(String.valueOf(object.mps_to_kph()) + "  " + ToItem);
                        else if (FromItem.equals("M/S") && ToItem.equals("Cm/S"))
                            val.setText(String.valueOf(object.mps_to_cmps()) + "  " + ToItem);
                        else if (FromItem.equals("Cm/S") && ToItem.equals("Km/H"))
                            val.setText(String.valueOf(object.cmps_to_kph()) + "  " + ToItem);
                        else if (FromItem.equals("Cm/S") && ToItem.equals("M/H"))
                            val.setText(String.valueOf(object.cmps_to_mph()) + "  " + ToItem);
                        else if (FromItem.equals("Cm/S") && ToItem.equals("M/S"))
                            val.setText(String.valueOf(object.cmps_to_mps()) + "  " + ToItem);
                        else
                            Toast.makeText(Main2Activity.this, "You Should Enter Different Units", Toast.LENGTH_SHORT).show();

                    } else if (name.equals("Temperature")) {

                        TemperatureClass object = new TemperatureClass(num);
                        if (FromItem.equals("Celsius") && ToItem.equals("Fahrenheit"))
                            val.setText(String.valueOf(object.cel_to_fah()) + "  " + ToItem);
                        else if (FromItem.equals("Celsius") && ToItem.equals("kelvin"))
                            val.setText(String.valueOf(object.cel_to_kelvin()) + "  " + ToItem);
                        else if (FromItem.equals("Fahrenheit") && ToItem.equals("Celsius"))
                            val.setText(String.valueOf(object.fah_to_cel()) + "  " + ToItem);
                        else if (FromItem.equals("kelvin") && ToItem.equals("Celsius"))
                            val.setText(String.valueOf(object.kelvin_to_cel()) + "  " + ToItem);
                        else
                            Toast.makeText(Main2Activity.this, "You Should Enter Different Units", Toast.LENGTH_SHORT).show();

                    } else if (name.equals("Currency")) {

                        CurrencyClass object = new CurrencyClass(num);
                        if (FromItem.equals("Dollar") && ToItem.equals("Euro"))
                            val.setText(String.valueOf(object.dollar_to_euro()) + "  " + ToItem);
                        else if (FromItem.equals("Dollar") && ToItem.equals("EP"))
                            val.setText(String.valueOf(object.dollar_to_ep()) + "  " + ToItem);
                        else if (FromItem.equals("Dollar") && ToItem.equals("UKP"))
                            val.setText(String.valueOf(object.dollar_to_ukp()) + "  " + ToItem);
                        else if (FromItem.equals("Euro") && ToItem.equals("Dollar"))
                            val.setText(String.valueOf(object.euro_to_dollar()) + "  " + ToItem);
                        else if (FromItem.equals("Euro") && ToItem.equals("EP"))
                            val.setText(String.valueOf(object.euro_to_ep()) + "  " + ToItem);
                        else if (FromItem.equals("Euro") && ToItem.equals("UKP"))
                            val.setText(String.valueOf(object.euro_to_ukp()) + "  " + ToItem);
                        else if (FromItem.equals("EP") && ToItem.equals("Dollar"))
                            val.setText(String.valueOf(object.ep_to_dollar()) + "  " + ToItem);
                        else if (FromItem.equals("EP") && ToItem.equals("Euro"))
                            val.setText(String.valueOf(object.ep_to_euro()) + "  " + ToItem);
                        else if (FromItem.equals("EP") && ToItem.equals("UKP"))
                            val.setText(String.valueOf(object.ep_to_ukp()) + "  " + ToItem);
                        else if (FromItem.equals("UKP") && ToItem.equals("Dollar"))
                            val.setText(String.valueOf(object.ukp_to_dollar()) + "  " + ToItem);
                        else if (FromItem.equals("UKP") && ToItem.equals("EP"))
                            val.setText(String.valueOf(object.ukp_to_ep()) + "  " + ToItem);
                        else if (FromItem.equals("UKP") && ToItem.equals("Euro"))
                            val.setText(String.valueOf(object.ukp_to_euro()) + "  " + ToItem);
                        else
                            Toast.makeText(Main2Activity.this, "You Should Enter Different Units", Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });



    }


    public void LengthUnits()
    {

        ArrayList<String> a = new ArrayList<>();
        a.add("Kilometer");
        a.add("Meter");
        a.add("Centimeter");
        a.add("Millimeter");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,a);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }
    public void WeightUnits()
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("Kilogram");
        a.add("Gram");
        a.add("MilliGram");
        a.add("Ton");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,a);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }
    public void TempUnits()
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("Celsius");
        a.add("Fahrenheit");
        a.add("kelvin");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,a);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }
    public void currencyUnit()
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("Dollar");
        a.add("Euro");
        a.add("EP");
        a.add("UKP");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,a);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }

    public void SpeedUnits()
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("Km/H");
        a.add("Cm/S");
        a.add("M/H");
        a.add("M/S");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,a);
        from.setAdapter(adapter);
        to.setAdapter(adapter);
    }
}
