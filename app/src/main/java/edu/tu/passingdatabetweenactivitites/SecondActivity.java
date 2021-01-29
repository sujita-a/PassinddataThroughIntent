package edu.tu.passingdatabetweenactivitites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView data=findViewById(R.id.data);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        data.setText(str);

        //data.setText("We are in next activity");
    }
}