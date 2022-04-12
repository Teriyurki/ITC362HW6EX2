package com.example.hw6ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Button clickButton = findViewById(R.id.clickButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        if (fm.findFragmentById(R.id.side_button) == null) {
            FragmentTransaction ft = fm.beginTransaction();
            ButtonFragment fragment = new ButtonFragment();
            ft.add(R.id.side_button, fragment);
            ft.commit();
        }

        if (fm.findFragmentById(R.id.side_color_change) == null) {
            FragmentTransaction ft = fm.beginTransaction();
            ChangeColorFragment fragment = new ChangeColorFragment();
            ft.add(R.id.side_color_change, fragment);
            ft.commit();
        }



    }



    public void clickButton(View view) {
        FragmentManager fm = getSupportFragmentManager();
        ChangeColorFragment changeColorFragment = (ChangeColorFragment) fm.findFragmentById(R.id.side_color_change);
        View colorChangeView = changeColorFragment.getView();
        TextView colorChangeTV = colorChangeView.findViewById(R.id.changeColorTextview);
        //colorChangeTV.setText("Green");
        if (colorChangeTV.getText() == "Red Light") {
            colorChangeTV.setText("Green Light");
            colorChangeTV.setBackgroundColor(getColor(R.color.green));
        }
        else if(colorChangeTV.getText() =="Green Light") {
            colorChangeTV.setText("Yellow Light");
            colorChangeTV.setBackgroundColor(getColor(R.color.yellow));
        }
        else if(colorChangeTV.getText() =="Yellow Light") {
            colorChangeTV.setText("Red Light");
            colorChangeTV.setBackgroundColor(getColor(R.color.red));
        }

        //changeLightName();
        //changeLightColor();

    }

  /*  private void changeLightColor() {
        FragmentManager fm = getSupportFragmentManager();
        ChangeColorFragment changeColorFragment = (ChangeColorFragment) fm.findFragmentById(R.id.side_color_change);
        View colorChangeView = changeColorFragment.getView();
        TextView colorChangeTV = colorChangeView.findViewById(R.id.changeColorTextview);

        if (colorChangeTV.getText() == "Red Light") {

            colorChangeTV.setBackgroundColor(getColor(R.color.green));
        }
        else if(colorChangeTV.getText() =="Green Light") {

            colorChangeTV.setBackgroundColor(getColor(R.color.yellow));
        }
        else if(colorChangeTV.getText() =="Yellow Light") {

            colorChangeTV.setBackgroundColor(getColor(R.color.red));
        }

    }
*/
   /* public String changeLightName() {
        FragmentManager fm = getSupportFragmentManager();
        ChangeColorFragment changeColorFragment = (ChangeColorFragment) fm.findFragmentById(R.id.side_color_change);
        View colorChangeView = changeColorFragment.getView();
        TextView colorChangeTV = colorChangeView.findViewById(R.id.changeColorTextview);

        if (colorChangeTV.getText() == "Red Light") {
            colorChangeTV.setText("Green Light");

        }
        else if(colorChangeTV.getText() =="Green Light") {
            colorChangeTV.setText("Yellow Light");

        }
        else if(colorChangeTV.getText() =="Yellow Light") {
            colorChangeTV.setText("Red Light");

        }
        return (String) colorChangeTV.getText();

    }*/
}