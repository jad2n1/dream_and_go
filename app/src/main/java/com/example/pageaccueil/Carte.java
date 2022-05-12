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
    ImageView Carte, Carte_CoteAzur, Carte_Atlantique;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carte);



getSupportActionBar().hide(); // permet d'enlever la bar d'en haut

        // association de nos references avec les objets du layout
      //  Carte_Alpes = ( Button ) findViewById(R.id.btn_carte);
        TextView  Nom_destination = (TextView) findViewById(R.id.nom_destination);
            Bundle extra=getIntent().getExtras();
            String finalBtn_Carte = extra.getString("carte");


// affichage dans le text view le nom de la destination
        Carte= findViewById(R.id.imageView_essaie_carte);
        Bouton_retour = (Button) findViewById(R.id.btn_retour_carte);

            Nom_destination.setText(finalBtn_Carte);

        if(Nom_destination!= null) {

            switch (Nom_destination.getText().toString()){
                case "Alpes":

                    //Carte.setImageResource(R.drawable.essaie_carte);
                   // Carte.setVisibility(View.VISIBLE);
                    Carte_Atlantique.setVisibility(View.INVISIBLE);
                    Carte_CoteAzur.setVisibility(View.INVISIBLE);





                    Bouton_retour.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // ouverture de l'activité


                            finish();
                        }
                    });
                    break;
                case "Atlantqiue":
                    Carte.setVisibility(View.INVISIBLE);
                    Carte_CoteAzur.setVisibility(View.INVISIBLE);

                    Carte_Atlantique=findViewById(R.id.imageView_Atlantique_carte);

                    Bouton_retour.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // ouverture de l'activité
                            Intent intent = new Intent(Carte.this, page_Atlantique.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                   // break;
                case "Paris":

                    Bouton_retour.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // ouverture de l'activité

                            finish();
                        }
                    });
                    break;
                case "Cote d'Azur":
                    Carte.setVisibility(View.INVISIBLE);
                    Carte_Atlantique.setVisibility(View.INVISIBLE);

                    Carte_CoteAzur=findViewById(R.id.imageView_CoteAzur_carte);

                    Bouton_retour = (Button) findViewById(R.id.btn_retour_carte);

                    Bouton_retour.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // ouverture de l'activité

                            finish();
                        }
                    });
                    break;


    }
}


    }}