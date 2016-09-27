package com.example.jekot.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainScreenActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main_screen, container, false);
        super.onCreateView(inflater, container,savedInstanceState);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initializeCircleChart();

    }

    public void initializeCircleChart(){
        PieChart pieChart = (PieChart) this.getView().findViewById(R.id.pie_chart_current);

        PieDataSet pieDataSet = new PieDataSet(getData(), "Porcentaje de Contaminantes");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);


        PieData pieData = new PieData(pieDataSet);

        pieChart.setDescription("");
        pieDataSet.setValueTextSize(25f);

        pieChart.setData(pieData);

        pieChart.invalidate();
    }


    public List<PieEntry> getData(){
        List<PieEntry> arr = new ArrayList<>();
        arr.add(new PieEntry(40.0f, "Ozono"));
        arr.add(new PieEntry(35.0f, "CO"));
        arr.add(new PieEntry(25.0f, "NOx"));

        return arr;
    }
}
