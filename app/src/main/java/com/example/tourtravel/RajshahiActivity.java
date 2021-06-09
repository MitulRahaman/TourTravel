package com.example.tourtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class RajshahiActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mahasthangarh;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);

        mahasthangarh = (ImageView) findViewById(R.id.mahasId);
        mahasthangarh.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {if(v.getId() == R.id.mahasId)
    {
        Toast.makeText(RajshahiActivity.this,"Opening Mahasthangarh",Toast.LENGTH_SHORT).show();
        intent = new Intent(RajshahiActivity.this,DetailsActivity.class);
        intent.putExtra("name", "mahasthangarh");
        startActivity(intent);
    }


    }
}
