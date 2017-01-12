package com.example.kannadasang.recyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class EmployeeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Employee> employees=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_employee);
        setTitle("Employee List");
        setEmployeeList();
        recyclerView=(RecyclerView) findViewById(R.id.empRecycler);

        LinearLayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayout.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        EmployeeAdapter empAdapter= new EmployeeAdapter(employees);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(empAdapter);

    }
    private void setEmployeeList()
    {
        employees.add(new Employee("Employee1","Tech Lead","Male","2001"));
        employees.add(new Employee("Employee2","Designer","Female","2002"));
        employees.add(new Employee("Employee3","Tester","Male","2005"));
        employees.add(new Employee("Employee4","Developer","Female","2009"));
        employees.add(new Employee("Employee5","Team Lead","Male","2011"));

    }

}
