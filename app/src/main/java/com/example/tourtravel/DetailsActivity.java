package com.example.tourtravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private TextView textView;
    private Button bookButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = (ImageView) findViewById(R.id.imageViewId1);
        textView = (TextView) findViewById(R.id.textViewId1);

        bookButton= findViewById(R.id.bookButtonId);
        bookButton.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String string = bundle.getString("name");
            showDetails(string);
        }
    }

    void showDetails(String string)
    {
        if(string.equals("sajek"))
        {
            imageView.setImageResource(R.drawable.sv);
            textView.setText(R.string.sajek_text);
        }
        if(string.equals("jaflong"))
        {
            imageView.setImageResource(R.drawable.jaflong);
            textView.setText(R.string.jaflong_text);
        }
        if(string.equals("coxsbazar"))
        {
            imageView.setImageResource(R.drawable.coxsbazar);
            textView.setText(R.string.coxsbazar_text);
        }
        if(string.equals("saint"))
        {
            imageView.setImageResource(R.drawable.saint_martin);
            textView.setText(R.string.saint_martin_text);
        }
        if(string.equals("sundarban"))
        {
            imageView.setImageResource(R.drawable.sundarban);
            textView.setText(R.string.sundarban_text);
        }
        if(string.equals("thanchi"))
        {
            imageView.setImageResource(R.drawable.thanchi);
            textView.setText(R.string.thanchi_text);
        }
        if(string.equals("patenga"))
        {
            imageView.setImageResource(R.drawable.patenga);
            textView.setText(R.string.patenga_text);
        }
        if(string.equals("floatingBazar"))
        {
            imageView.setImageResource(R.drawable.floatingbazar);
            textView.setText(R.string.floatingBazar_text);
        }
        if(string.equals("kuakata"))
        {
            imageView.setImageResource(R.drawable.kuakata);
            textView.setText(R.string.kuakata_text);
        }
        if(string.equals("sonarChor"))
        {
            imageView.setImageResource(R.drawable.sonar_chor);
            textView.setText(R.string.sonarChor_text);
        }
        if(string.equals("mahasthangarh"))
        {
            imageView.setImageResource(R.drawable.mahasthangarh);
            textView.setText(R.string.mahasthangarh_text);
        }
    }

    @Override
    public void onClick(View v) {
            if(v.getId() == R.id.bookButtonId)
        {
            //Toast.makeText(DetailsActivity.this,"Opening Sajek valley",Toast.LENGTH_SHORT).show();
            intent = new Intent(DetailsActivity.this,loginActivity.class);
          //  intent.putExtra("name", "kuakata");
            startActivity(intent);
        }

    }
}
