package com.example.codetride.edutrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Login extends AppCompatActivity {

    ImageView guardian, parent, learner, exit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //calling the casting method.
        Casting();
        //setOnClick method
        setOnClick();
    }

    public void Casting(){
        guardian = (ImageView) findViewById(R.id.guardian);
        parent = (ImageView) findViewById(R.id.parent);
        learner = (ImageView) findViewById(R.id.learner);
        exit = (ImageView) findViewById(R.id.exit);
    }

    public void setOnClick(){
       //to exit the app
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //for guardians
        guardian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Login.this,Parents.class);
                startActivity(intent);
            }
        });
        //for parents
        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Login.this,Parents.class);
                startActivity(intent);
            }
        });
        //for learners
        learner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Login.this,Learners.class);
                startActivity(intent);
            }
        });
    }
}
