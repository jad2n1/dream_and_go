package com.example.pageaccueil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

public class page_Atlantique extends AppCompatActivity{

    Button Bouton_Atlantique_retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atlantique_page);

        getSupportActionBar().hide(); // permet d'enlever la bar d'en haut

        // 1) creation d’un objet-reference  spinner vers le spinner de l’activite
        Spinner monSpinner2 = (Spinner) findViewById(R.id.spinner_jours2);
        TextView Text_Mat_Atlantique = (TextView) findViewById(R.id.cadre_matin_Atlantique);
        TextView Text_Ap_Atlantique = (TextView) findViewById(R.id.cadre_aprem_Atlantique);
        Button Btn_Carte=(Button) findViewById(R.id.btn_carte_Atlantique);
// 2) creation d’un ArrayAdapter à partir de Jours et mise en forme par defaut
        ArrayAdapter<CharSequence> monAdapter = ArrayAdapter.createFromResource (this,
                R.array.Jours, android.R.layout.simple_spinner_item);

        // 3) définition de la mise en page
        monAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 4) Association de adapter au spinner
        monSpinner2.setAdapter(monAdapter);
        monSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                String choix_jours= parent.getSelectedItem().toString();
                if (choix_jours.equals("Jour1")){
                    Text_Mat_Atlantique.setText("Apprendre à surfer sur la mythique plage de la côte des basques à Biarritz. ");
                    Text_Ap_Atlantique.setText("Se promener dans le centre-ville sans oublier de gouter la spécialité de la région, le gâteau basque.");

                }
                if (choix_jours.equals("Jour2")){
                    Text_Mat_Atlantique.setText("Découvrir la dune du Pyla et visite d’Arcachon. ");
                    Text_Ap_Atlantique.setText("Le midi, déguster un plateau de fruit de mer avec les huitres provenant " +
                            "directement du bassin puis se promener dans cap Ferret l’après-midi.");
                }
                if (choix_jours.equals("Jour3")){
                    Text_Mat_Atlantique.setText("Visite de Bordeaux et de son ancienne base sous-marine.");
                    Text_Ap_Atlantique.setText("Profiter de la fin de journée pour faire une dégustation de vin au château Pape Clément.");
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
                Intent intent = new Intent(page_Atlantique.this, Carte.class);
                String carte="Atlantique";
                intent.putExtra("carte",carte);
                startActivity(intent);
            }
        });


        // Création du bouton retour
        Bouton_Atlantique_retour = (Button) findViewById(R.id.btn_retour_atlantique);
        Bouton_Atlantique_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                finish();
            }
        });
    }
}
