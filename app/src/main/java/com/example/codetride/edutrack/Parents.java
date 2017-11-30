package com.example.codetride.edutrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Parents extends AppCompatActivity {

    Intent intent;
    ImageView login;
    EditText parent_id, learner_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents);

        Casting();

        setOnClick();
    }

    public void Casting() {
        login = (ImageView) findViewById(R.id.login);
        parent_id = (EditText) findViewById(R.id.parent_id);
        learner_id = (EditText) findViewById(R.id.learner_id_p);
    }

    public void setOnClick() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Parents.this,Home_page.class);
                startActivity(intent);
            }
        });
    }
}
