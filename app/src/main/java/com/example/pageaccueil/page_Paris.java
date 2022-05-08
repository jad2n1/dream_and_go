package com.example.pageaccueil;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class page_Paris extends AppCompatActivity{
    Button Bouton_Paris_retour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paris_page);

        // 1) creation d’un objet-reference  spinner vers le spinner de l’activite
        Spinner monSpinner = (Spinner) findViewById(R.id.spinner_jours);
        TextView Text_Mat_Paris = (TextView) findViewById(R.id.cadre_matin_Paris);
        TextView Text_Aprem_Paris = (TextView) findViewById(R.id.cadre_aprem_Paris);
        Button Btn_Carte_Paris=(Button) findViewById(R.id.btn_carte_Paris);

        // 2) creation d’un ArrayAdapter à partir de tab_pokemon et mise en forme par defaut
        ArrayAdapter<CharSequence> monAdapter = ArrayAdapter.createFromResource (this,
                R.array.Jours, android.R.layout.simple_spinner_item);

        // 3) définition de la mise en page
        monAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 4) Association de adapter au spinner
        monSpinner.setAdapter(monAdapter);
        // exemple de commentaire vide

        monSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

            String choix_jours= parent.getSelectedItem().toString();
            if (choix_jours.equals("Jour1")){
                Text_Mat_Paris.setText("Petit déjeuné croissant café en terrasse Visite du musée du Louvre avec guide le matin.");
                Text_Aprem_Paris.setText("Croisière d’une heure sur la Seine l’après-midi et balade dans Montmartre.");

            }
            if (choix_jours.equals("Jour2")){
                Text_Mat_Paris.setText("Visite de la tour Eiffel le matin");
                Text_Aprem_Paris.setText("Déjeuner plus balade aux jardins des tuileries puis profiter du " +
                        "spectacle de cabaret du Moulin Rouge en fin de journée.");
            }
            if (choix_jours.equals("Jour3")){
                Text_Mat_Paris.setText("Visite guidée de Versailles ");
                Text_Aprem_Paris.setText("Aller voir un balais dans le somptueux Opéra Garnier");
            }

        }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        // Bouton pour accéder à la carte

        Btn_Carte_Paris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                Intent intent = new Intent(page_Paris.this, Carte.class);
                String carte="carte_Paris";
                intent.putExtra("nom_cartes",carte);
                startActivity(intent);
            }
        });
// Bouton retour
        Bouton_Paris_retour = (Button) findViewById(R.id.btn_retour_paris);
        Bouton_Paris_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                finish();
            }
        });
    }
}



