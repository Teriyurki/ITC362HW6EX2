package com.example.hw6ex2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ChangeColorFragment extends Fragment {



    public ChangeColorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_change_color, container, false);
    }

   /* @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View fragmentView = getView();
        TextView changeColorTV = fragmentView.findViewById(R.id.changeColorTextview);
        changeColorTV.setText("help me");
    }*/


/*
    @Override
    public void onStart(){
        super.onStart();

        View fragmentView = getView();
        TextView changeColorTV = fragmentView.findViewById(R.id.changeColorTextview);
        MainActivity fragmentActivity = (MainActivity) getActivity();
        changeColorTV.setText(fragmentActivity.clickButton());
    }
*/

   /* public String grabText() {
        View fragmentView = getView();
        TextView changeColorTV = fragmentView.findViewById(R.id.changeColorTextview);
        String lightChange = (String) changeColorTV.getText();
        return lightChange;
    }*/
}