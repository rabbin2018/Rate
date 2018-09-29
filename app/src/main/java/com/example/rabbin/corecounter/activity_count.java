package com.example.rabbin.corecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_count extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        TextView textA=(TextView)findViewById(R.id.team1);
        textA.setText("0");
        TextView textB=(TextView)findViewById(R.id.team2);
        textB.setText("0");
    }
    public void threePointsA(View view){
        TextView text=(TextView)findViewById(R.id.team1);
        int score=Integer.parseInt(text.getText().toString())+3;
        text.setText(score+"");
    }
    public void twoPointsA(View view){
        TextView text=(TextView)findViewById(R.id.team1);
        int score=Integer.parseInt(text.getText().toString())+2;
        text.setText(score+"");
    }
    public void freeThrowA(View view){
        TextView text=(TextView)findViewById(R.id.team1);
        int score=Integer.parseInt(text.getText().toString())+1;
        text.setText(score+"");
    }

    public void threePointsB(View view){
        TextView text=(TextView)findViewById(R.id.team2);
        int score=Integer.parseInt(text.getText().toString())+3;
        text.setText(score+"");
    }
    public void twoPointsB(View view){
        TextView text=(TextView)findViewById(R.id.team2);
        int score=Integer.parseInt(text.getText().toString())+2;
        text.setText(score+"");
    }
    public void freeThrowB(View view){
        TextView text=(TextView)findViewById(R.id.team2);
        int score=Integer.parseInt(text.getText().toString())+1;
        text.setText(score+"");
    }

    public void reset(View view){
        TextView textA=(TextView)findViewById(R.id.team1);
        textA.setText("0");
        TextView textB=(TextView)findViewById(R.id.team2);
        textB.setText("0");
    }
}
