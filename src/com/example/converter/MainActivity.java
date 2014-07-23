package com.example.converter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	private EditText v1,v2; 
	private Button Convert; 
	private Button Reset; 
	private double Val1=0,Val2=0; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		v1= (EditText)findViewById(R.id.Value1);
		v2= (EditText)findViewById(R.id.Value2);
	Convert = (Button)findViewById(R.id.Convert); 
	Reset = (Button)findViewById(R.id.Reset); 
	Convert.setOnClickListener(new View.OnClickListener() 
	{ 
	public void onClick(View v) 
	{ 
	convertValues(); 
	} 
	} 
	); 

	Reset.setOnClickListener(new View.OnClickListener() 
	{ 
	public void onClick(View v) 
	{ 
	reset(); 
	} 
	} 
	); 
	} 

	void convertValues() 
	{ 
	if (v1.getText().length() > 0) 
	{ 
	Val1=Double.parseDouble(v1.getText().toString()); 
	Val2=KgsToLbs(Val1); 
	} 
	else if(v2.getText().length() > 0) 
	{ 
	Val2=Double.parseDouble(v2.getText().toString()); 
	Val1=LbsToKgs(Val2); 
	} 
	else 
	Toast.makeText(this,"please enter a value",Toast.LENGTH_LONG).show(); 
	v1. setText(Double.toString(Val1)); 
	v2. setText(Double.toString(Val2)); 

	} 
	

	double KgsToLbs(double val) 
	{return(val*2.2);} 
	double LbsToKgs(double val) 
	{return(val/2.2);} 


	void reset() 
	{ 
	v1.setText(""); 
	v2.setText(""); 
	} 



	
	}
