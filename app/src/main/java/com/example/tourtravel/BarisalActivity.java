package com.example.tourtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class BarisalActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView sonarChor,kuakata,floatingBazar;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal);

        sonarChor = (ImageView) findViewById(R.id.sonarChorId);
        sonarChor.setOnClickListener(this);
        kuakata = (ImageView) findViewById(R.id.kuakataId);
        kuakata.setOnClickListener(this);
        floatingBazar = (ImageView) findViewById(R.id.floatingBazarId);
        floatingBazar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.kuakataId)
        {
            Toast.makeText(BarisalActivity.this,"Opening Sajek valley",Toast.LENGTH_SHORT).show();
            intent = new Intent(BarisalActivity.this,DetailsActivity.class);
            intent.putExtra("name", "kuakata");
            startActivity(intent);
        }
        else if(v.getId() == R.id.floatingBazarId)
        {
            Toast.makeText(BarisalActivity.this,"Opening Sajek valley",Toast.LENGTH_SHORT).show();
            intent = new Intent(BarisalActivity.this,DetailsActivity.class);
            intent.putExtra("name", "floatingBazar");
            startActivity(intent);
        }
        else if(v.getId() == R.id.sonarChorId)
        {
            Toast.makeText(BarisalActivity.this,"Opening Sajek valley",Toast.LENGTH_SHORT).show();
            intent = new Intent(BarisalActivity.this,DetailsActivity.class);
            intent.putExtra("name", "sonarChor");
            startActivity(intent);
        }
    }
}
