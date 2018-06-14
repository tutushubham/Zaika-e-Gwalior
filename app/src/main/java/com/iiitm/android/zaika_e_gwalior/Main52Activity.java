package com.iiitm.android.zaika_e_gwalior;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main52Activity extends AppCompatActivity {
    ImageView imageView;
    TextView textView3,textView5,textView35,textView8,textView10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main52);
        imageView = findViewById(R.id.imageView);
        textView3 = findViewById(R.id.textView3);
        textView5 = findViewById(R.id.textView5);
       // textView35 = (TextView)findViewById(R.id.textView35);
        //textView8 = (TextView)findViewById(R.id.textView8);
        textView10 = findViewById(R.id.textView10);

        imageView.setImageResource(getIntent().getIntExtra("imageView",00));
        textView3.setText(getIntent().getStringExtra("textView1"));
        textView5.setText(getIntent().getStringExtra("textView2"));
      //  textView35.setText(getIntent().getStringExtra("textView3"));
       // textView8.setText(getIntent().getStringExtra("textView4"));
       textView10.setText(getIntent().getStringExtra("textView3"));


        final CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar);
        collapsingToolbarLayout.setTitle("Gwalior-Jharokha");
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.holo_purple));

        CardView cardView = findViewById(R.id.cardview3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address;
                // address="City Centre, Opp Tadon Kothi, Gole ka Mandir, Kalpi Road, Gwalior, Madhya Pradesh 474005";
                address = textView5.getText().toString();
                String url = "http://maps.google.com/maps?daddr="+address;
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                startActivity(intent);
            }
        });


        CardView cardView2 = findViewById(R.id.cardview6);

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url= textView10.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:url"));
                startActivity(intent);

            }
        });



    }
}
