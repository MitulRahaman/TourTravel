package com.example.tourtravel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button chittagong,sylhet,dhaka,rajshahi,khulna,barisal;
    private Intent intent;
    SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhaka= (Button) findViewById(R.id.dhakaButtonId);
        dhaka.setOnClickListener(this);
        chittagong= (Button) findViewById(R.id.chittagongButtonId);
        chittagong.setOnClickListener(this);
        sylhet= (Button) findViewById(R.id.sylhetButtonId);
        sylhet.setOnClickListener(this);
        rajshahi= (Button) findViewById(R.id.rajshahiButtonId);
        rajshahi.setOnClickListener(this);
        barisal= (Button) findViewById(R.id.barisalButtonId);
        barisal.setOnClickListener(this);
        khulna= (Button) findViewById(R.id.khulnaButtonId);
        khulna.setOnClickListener(this);

        sliderView = findViewById(R.id.imageSlider);

        final SliderAdapter adapter = new SliderAdapter(this);
        adapter.setCount(5);

        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE);
        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINROTATIONTRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.startAutoCycle();

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                sliderView.setCurrentPagePosition(position);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.chittagongButtonId)
        {
            Toast.makeText(MainActivity.this,"Opening Chittagong",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,ChitagongActivity.class);
            //intent.putExtra("name", "chittagong");
            startActivity(intent);
        }
        else if(view.getId() == R.id.dhakaButtonId)
        {
            Toast.makeText(MainActivity.this,"Opening Dhaka",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,DhakaActivity.class);
            //intent.putExtra("name", "dhaka");
            startActivity(intent);
        }
        else if(view.getId() == R.id.sylhetButtonId)
        {
            Toast.makeText(MainActivity.this,"Opening Sylhet",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,SylhetActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.barisalButtonId)
        {
            Toast.makeText(MainActivity.this,"Opening Barisal",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,BarisalActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.rajshahiButtonId)
        {
            Toast.makeText(MainActivity.this,"Opening Rajshahi",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,RajshahiActivity.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.khulnaButtonId)
        {
            Toast.makeText(MainActivity.this,"Opening Khulna",Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this,KhulnaActivity.class);
            startActivity(intent);
        }
    }

    public void onBackPressed()
    {
        AlertDialog.Builder alertdb;
        alertdb = new AlertDialog.Builder(MainActivity.this);

        alertdb.setIcon(R.drawable.question);
        alertdb.setTitle("Confirmation: ");
        alertdb.setMessage("Do you want to exit?");
        alertdb.setCancelable(false);
        alertdb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertdb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
     AlertDialog alert = alertdb.create();
     alert.show();
    }
}


