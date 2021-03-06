package com.example.pageaccueil;

import android.content.Intent;
import android.database.Cursor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class choix_destination extends AppCompatActivity {
    // creation des references boutons
    // déclaration, sans initialisation
    Button Bouton_Alpes;
    Button Bouton_Atlantique;
    Button Bouton_paris;
    Button Bouton_cotedazur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choix_destination);

        getSupportActionBar().hide(); // permet d'enlever la bar d'en haut

        // association de nos references avec les objets du layout

        Bouton_Alpes = ( Button ) findViewById(R.id.btn_Alpes);
        Bouton_Atlantique = (Button) findViewById(R.id.btn_Atlantique);
        Bouton_paris = (Button) findViewById(R.id.btn_paris);
        Bouton_cotedazur = (Button) findViewById(R.id.btn_cotedazur);

        // ajout des écouteurs qui va permettre de lancer la page associée lorsque le bouton en
        // question est cliqué

        Bouton_Alpes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                Intent intent = new Intent(choix_destination.this, page_Alpes.class);
                startActivity(intent);
            }
        });


        Bouton_Atlantique.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                Intent intent = new Intent(choix_destination.this, page_Atlantique.class);
                startActivity(intent);
            }
        });


        Bouton_paris.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                Intent intent = new Intent(choix_destination.this, page_Paris.class);
                startActivity(intent);
            }
        });
        Bouton_cotedazur.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                Intent intent = new Intent(choix_destination.this, page_CoteAzur.class);
                startActivity(intent);
            }
        });
    }
    }


