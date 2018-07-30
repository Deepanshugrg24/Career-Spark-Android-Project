package com.example.guidelineapp.guidelineapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Tab1 extends AppCompatActivity {
    CardView ten1, inter, graduate, entrance12, other, bank, ssc, prepation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logocareer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        ten1 = (CardView) findViewById(R.id.t);
        inter = (CardView) findViewById(R.id.tweleve12);
        graduate = (CardView) findViewById(R.id.graduation);
        entrance12 = (CardView) findViewById(R.id.entrance);
        other = (CardView) findViewById(R.id.other12);
        bank = (CardView) findViewById(R.id.bank12);
        ssc = (CardView) findViewById(R.id.ssc12);
        prepation = (CardView) findViewById(R.id.prepation12);


        ten1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ten = new Intent(Tab1.this, MainActivity.class);
                startActivity(ten);
            }

        });

        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inter = new Intent(Tab1.this, AftreIntermediate.class);
                startActivity(inter);
            }
        });

        graduate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent graduate = new Intent(Tab1.this, AfterGraduation.class);
                startActivity(graduate);
            }
        });

        entrance12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entrace12 = new Intent(Tab1.this, EntranceTest.class);
                startActivity(entrace12);
            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent other = new Intent(Tab1.this, OthersCourses.class);
                startActivity(other);
            }
        });


        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bank = new Intent(Tab1.this, BankCivil.class);
                startActivity(bank);
            }
        });

        ssc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ssc = new Intent(Tab1.this, SSC.class);
                startActivity(ssc);
            }
        });


        prepation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prepation = new Intent(Tab1.this, Coaching.class);
                startActivity(prepation);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about) {
            Intent about = new Intent(this, About.class);
            startActivity(about);
            return true;
        }
        return true;
    }

}
