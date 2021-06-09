package com.example.tourtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SylhetActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView  jaflong;
    private Intent intentS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);

        jaflong = (ImageView) findViewById(R.id.jaflongId);
        jaflong.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         if(v.getId() == R.id.jaflongId)
        {
            Toast.makeText(SylhetActivity.this,"Opening Jaflong",Toast.LENGTH_SHORT).show();
            intentS = new Intent(SylhetActivity.this,DetailsActivity.class);
            intentS.putExtra("name", "jaflong");
            startActivity(intentS);
        }
    }
}
