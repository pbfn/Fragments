package com.br.pedro.bruno.fragments.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.br.pedro.bruno.fragments.R;
import com.br.pedro.bruno.fragments.fragment.ContatosFragment;
import com.br.pedro.bruno.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    Button btnConversas,btnContatos;
    ConversasFragment conversasFragment;
    ContatosFragment contatosFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContatos = findViewById(R.id.btnContatos);
        btnConversas = findViewById(R.id.btnConversas);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF6200EE")));

        conversasFragment = new ConversasFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContent,conversasFragment);
        transaction.commit();

        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContent,contatosFragment);
                transaction.commit();
            }
        });

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContent,conversasFragment);
                transaction.commit();
            }
        });
    }
}