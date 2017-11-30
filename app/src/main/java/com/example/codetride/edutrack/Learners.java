package com.example.codetride.edutrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Learners extends AppCompatActivity {

    Intent intent;
    ImageView login;
    EditText learner_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learners);

        Casting();

        setOnClick();
    }

    public void Casting() {
        login = (ImageView) findViewById(R.id.login);
        learner_id = (EditText) findViewById(R.id.learner_id);
    }

    public void setOnClick() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Learners.this,Home_page.class);
                startActivity(intent);
            }
        });
    }

}
