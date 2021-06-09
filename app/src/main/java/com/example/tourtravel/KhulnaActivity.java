package com.example.tourtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class KhulnaActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView sundarban;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);

        sundarban = (ImageView) findViewById(R.id.sundarbanId);
        sundarban.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

         if(v.getId() == R.id.sundarbanId)
        {
            Toast.makeText(KhulnaActivity.this,"Opening Sundarban",Toast.LENGTH_SHORT).show();
            intent = new Intent(KhulnaActivity.this,DetailsActivity.class);
            intent.putExtra("name", "sundarban");
            startActivity(intent);
        }
    }
}
