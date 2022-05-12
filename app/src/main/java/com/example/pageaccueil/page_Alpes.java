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

        getSupportActionBar().hide(); // permet d'enlever la bar d'en haut

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
                    Text_Mat.setText("Visite du centre de Chamonix en passant par le musée des cristaux," +
                            " déjeuner au centre-ville pour profiter de la vue sur le mont blanc");
                    Text_Ap.setText("vol en parapente pour une expérience à couper le souffle puis" +
                            " relaxation au spa de Chamonix. ");

                }
                if (choix_jours.equals("Jour2")){
                    Text_Mat.setText("Balade du côté des Gorges de la Diozaz et ses 5 cascades. ");
                    Text_Ap.setText("prendre le téléférique pour l’Aiguille du midi et profiter d’une montée" +
                            " d’adrénaline, direction « le pas dans le vide »");
                }
                if (choix_jours.equals("Jour3")){
                    Text_Mat.setText("Départ de Chamonix-Mont-Blanc en direction de la mer de glace à bord du train de Montenvers," +
                            " visite de la grotte, balade pour admirer la vue panoramique,");
                    Text_Ap.setText("déjeuner à Chamonix ville puis route vers l’accrobranche au Lac Blanc Découvertes.");
                }

               }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

            //monSpinner3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        });

// Bouton pour accéder à la carte
        String carte = null;
        Btn_Carte = ( Button ) findViewById(R.id.btn_carte);
        Button finalBtn_Carte = Btn_Carte;
        Btn_Carte.setOnClickListener(new View.OnClickListener() {
                @Override
                                         public void onClick(View view) {
                                             // ouverture de l'activité
                                             Intent intent = new Intent(page_Alpes.this, Carte.class);
                                            // String carte="carte_Alpes";
                                            intent.putExtra("carte_Alpes", finalBtn_Carte.getText().toString());
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
