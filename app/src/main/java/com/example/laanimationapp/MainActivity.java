package com.example.laanimationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView tree= findViewById(R.id.tree);
        ImageView leafb=findViewById(R.id.leafb);
        ImageView leafg=findViewById(R.id.leafg);

        Button replay= findViewById(R.id.replay);

        TextView text= findViewById(R.id.text);


        Animation tree_anim= AnimationUtils.loadAnimation(this,R.anim.tree);
        tree.startAnimation(tree_anim);

        Animation leafg_anim= AnimationUtils.loadAnimation(this, R.anim.leafg);
        leafg.startAnimation(leafg_anim);

        Animation leafb_anim= AnimationUtils.loadAnimation(this, R.anim.leafb);
        leafb.startAnimation(leafb_anim);

        Animation text_anim=AnimationUtils.loadAnimation(this, R.anim.text);
        text.startAnimation(text_anim);


        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}