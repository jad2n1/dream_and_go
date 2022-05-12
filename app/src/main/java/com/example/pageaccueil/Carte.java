package com.example.pageaccueil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class Carte extends AppCompatActivity {
 Button Bouton_retour;
    ImageView Carte, Carte_CoteAzur, Carte_Atlantique, Carte_Paris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carte);



getSupportActionBar().hide(); // permet d'enlever la bar d'en haut

        // association de nos references avec les objets du layout

        TextView  Nom_destination = (TextView) findViewById(R.id.nom_destination);
            Bundle extra=getIntent().getExtras();
            String finalBtn_Carte = extra.getString("carte"); // recoit la valeur de "carte"
        // à partir des pages Paris ou Atlantique ou Alpes ou cotes d'Azur


            Nom_destination.setText(finalBtn_Carte);   // affichage dans le text view le nom de la
                                                            // destination grace au nom recut


        if(Nom_destination!= null) {


            switch (Nom_destination.getText().toString()){
                case "Alpes":
                    Carte=findViewById(R.id.imageView_cartw_chamonix); // l'image Carte
                    // qui correspond à la carte des Alpes est récupérée grace à son id dans le
                    // xml (toutes les images "cartes_" sont invisbles)
                    Carte.setVisibility(View.VISIBLE); // puis la carte en question est rendu visible
                    break; // pour sortir du switch
    // meme fonctionnement pour les autres cas
                case "Atlantique":

                    Carte_Atlantique=findViewById(R.id.imageView_Atlantique_carte);
                    Carte_Atlantique.setVisibility(View.VISIBLE);
                    break;

                case "Paris":
                    Carte_Paris=findViewById(R.id.imageView_Paris_carte);
                    Carte_Paris.setVisibility(View.VISIBLE);
                    break;

                case "Cote d'Azur":

                    Carte_CoteAzur=findViewById(R.id.imageView_CoteAzur_carte);
                    Carte_CoteAzur.setVisibility(View.VISIBLE);
                    break;
    }
}

        // bouton retour
        Bouton_retour = (Button) findViewById(R.id.btn_retour_carte);
        Bouton_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                finish();
            }
        });
    }}