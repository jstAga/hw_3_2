package com.geektech.hw3_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    private TextView counter;
    private Integer value;
    private Button btn_plus;
    private Button btn_minus;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        counter = view.findViewById(R.id.counter);
        btn_plus = view.findViewById(R.id.plus);
        btn_minus = view.findViewById(R.id.minus);

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = Integer.parseInt(counter.getText().toString()) + 1;
                counter.setText(value.toString());
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = Integer.parseInt(counter.getText().toString()) - 1;
                counter.setText(value.toString());
            }
        });
    }
}