package com.example.pageaccueil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_Alpes extends AppCompatActivity{
    Button Bouton_Alpes_retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpes_page);

        // 1) creation d’un objet-reference  spinner vers le spinner de l’activite
        Spinner monSpinner3 = (Spinner) findViewById(R.id.spinner_jours3);
        TextView Text_Mat = (TextView) findViewById(R.id.cadre_matni);
        TextView Text_Ap = (TextView) findViewById(R.id.cadre_aprem);
        Button Btn_Carte=(Button) findViewById(R.id.btn_carte);

// 2) creation d’un ArrayAdapter à partir de tab_pokemon et mise en forme par defaut
        ArrayAdapter<CharSequence> monAdapter = ArrayAdapter.createFromResource (this,
                R.array.Jours, android.R.layout.simple_spinner_item);

        // 3) définition de la mise en page
        monAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 4) Association de adapter au spinner
        monSpinner3.setAdapter(monAdapter);
        monSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                String choix_jours= parent.getSelectedItem().toString();
                if (choix_jours.equals("Jour1")){
                    Text_Mat.setText("Visite de Chamonix");
                    Text_Ap.setText("Aiguille du midi");

                }
                if (choix_jours.equals("Jour2")){
                    Text_Mat.setText("A");
                    Text_Ap.setText("B");
                }
                if (choix_jours.equals("Jour3")){
                    Text_Mat.setText("C");
                    Text_Ap.setText("D");
                }

               }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

            //monSpinner3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        });

// Bouton pour accéder à la carte

        Btn_Carte.setOnClickListener(new View.OnClickListener() {


                                         @Override
                                         public void onClick(View view) {
                                             // ouverture de l'activité
                                             Intent intent = new Intent(page_Alpes.this, Carte.class);
                                             String carte="carte_Alpes";
                                             intent.putExtra("nom_cartes",carte);
                                             startActivity(intent);
                                         }
                                     });





        // Création du bouton retour
        Bouton_Alpes_retour = (Button) findViewById(R.id.btn_retour_alpes);

        Bouton_Alpes_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité

                finish();
            }
        });
    }
}
