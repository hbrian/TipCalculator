package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mealCost;
    EditText tipAmt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Float cost, tips;

    public void tip(View view){
        mealCost = (EditText) findViewById(R.id.cost_amount);
        TextView total = (TextView) findViewById(R.id.displayCost);
        String getCost = mealCost.getText().toString();

        cost = Float.parseFloat(getCost);

        tipAmt = (EditText) findViewById(R.id.tip_amount);

        String getTip = tipAmt.getText().toString();

        tips = Float.parseFloat(getTip);

        Float totalCost = cost*(tips/100) + cost;

        total.setText(totalCost.toString());

    }
}
