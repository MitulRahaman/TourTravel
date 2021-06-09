package com.example.tourtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ChitagongActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView sajek, coxsBazar,saintMartin, patenga, thanchi;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitagong);

        patenga = (ImageView) findViewById(R.id.patengaId);
        patenga.setOnClickListener(this);
        thanchi = (ImageView) findViewById(R.id.thanchiId);
        thanchi.setOnClickListener(this);
        sajek = (ImageView) findViewById(R.id.sajekId);
        sajek.setOnClickListener(this);
        coxsBazar = (ImageView) findViewById(R.id.coxsbazarId);
        coxsBazar.setOnClickListener(this);
        saintMartin = (ImageView) findViewById(R.id.saintId);
        saintMartin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.sajekId)
        {
            Toast.makeText(ChitagongActivity.this,"Opening Sajek valley",Toast.LENGTH_SHORT).show();
            intent = new Intent(ChitagongActivity.this,DetailsActivity.class);
            intent.putExtra("name", "sajek");
            startActivity(intent);
        }
        else if(v.getId() == R.id.coxsbazarId)
        {
            Toast.makeText(ChitagongActivity.this,"Opening Cox's Bazar",Toast.LENGTH_SHORT).show();
            intent = new Intent(ChitagongActivity.this,DetailsActivity.class);
            intent.putExtra("name", "coxsbazar");
            startActivity(intent);
        }
        else if(v.getId() == R.id.saintId)
        {
            Toast.makeText(ChitagongActivity.this,"Opening Saint Martin ",Toast.LENGTH_SHORT).show();
            intent = new Intent(ChitagongActivity.this,DetailsActivity.class);
            intent.putExtra("name", "saint");
            startActivity(intent);
        }
        else if(v.getId() == R.id.patengaId)
        {
            Toast.makeText(ChitagongActivity.this,"Opening Patenga Beach ",Toast.LENGTH_SHORT).show();
            intent = new Intent(ChitagongActivity.this,DetailsActivity.class);
            intent.putExtra("name", "patenga");
            startActivity(intent);
        }
        else if(v.getId() == R.id.thanchiId)
        {
            Toast.makeText(ChitagongActivity.this,"Opening Thanchi",Toast.LENGTH_SHORT).show();
            intent = new Intent(ChitagongActivity.this,DetailsActivity.class);
            intent.putExtra("name", "thanchi");
            startActivity(intent);
        }
    }
}
