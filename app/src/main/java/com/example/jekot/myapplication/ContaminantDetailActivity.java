package com.example.jekot.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContaminantDetailActivity extends Fragment {

    public int arbitraryInt = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_contaminant_detail, container, false);
        super.onCreateView(inflater, container,savedInstanceState);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) getView().findViewById(R.id.arbitrary_int);

        textView.setText(String.valueOf(arbitraryInt));


    }
}
