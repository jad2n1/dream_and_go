package com.example.pageaccueil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Carte extends AppCompatActivity {
 Button Carte_Alpes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carte);


        // association de nos references avec les objets du layout
        Carte_Alpes = ( Button ) findViewById(R.id.btn_carte);
        TextView  Nom_destination = (TextView) findViewById(R.id.nom_destination);
            Bundle extra=getIntent().getExtras();

String carte = extra.getString("nom_cartes");


        if (carte.equals("carte_Alpes")){
            Nom_destination.setText("Alpes");
        }
        if (carte.equals("Atlantique")){
            Nom_destination.setText("Atlantique");
        }
        if (carte.equals("Paris")){
            Nom_destination.setText("Paris");
        }
else {
            Nom_destination.setText("non");
        }
    }
}