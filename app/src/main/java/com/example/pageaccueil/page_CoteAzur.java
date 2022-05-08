package com.example.pageaccueil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_CoteAzur extends AppCompatActivity {
    Button Bouton_CoteAzur_retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coteazur_page);
        TextView Text_Mat_coteAzur = (TextView) findViewById(R.id.cadre_matin_coteAzur);
        TextView Text_Ap_coteAzur = (TextView) findViewById(R.id.cadre_aprem_coteAzur);
        Button Btn_Carte_coteAzur=(Button) findViewById(R.id.btn_carte_CoteAzur);

        // 1) creation d’un objet-reference  spinner vers le spinner de l’activite
        Spinner monSpinner4 = (Spinner) findViewById(R.id.spinner_jours4);

// 2) creation d’un ArrayAdapter à partir de tab_pokemon et mise en forme par defaut
        ArrayAdapter<CharSequence> monAdapter = ArrayAdapter.createFromResource (this,
                R.array.Jours, android.R.layout.simple_spinner_item);

        // 3) définition de la mise en page
        monAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 4) Association de adapter au spinner
        monSpinner4.setAdapter(monAdapter);

        monSpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                String choix_jours= parent.getSelectedItem().toString();
                if (choix_jours.equals("Jour1")){
                    Text_Mat_coteAzur.setText("Visite de Chamonix");
                    Text_Ap_coteAzur.setText("Aiguille du midi");

                }
                if (choix_jours.equals("Jour2")){
                    Text_Mat_coteAzur.setText("A");
                    Text_Ap_coteAzur.setText("B");
                }
                if (choix_jours.equals("Jour3")){
                    Text_Mat_coteAzur.setText("C");
                    Text_Ap_coteAzur.setText("D");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

            //monSpinner3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        });

        // Bouton pour accéder à la carte

        Btn_Carte_coteAzur.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                Intent intent = new Intent(page_CoteAzur.this, Carte.class);
                String carte="carte_coteAzur";
                intent.putExtra("nom_cartes",carte);
                startActivity(intent);
            }
        });



        Bouton_CoteAzur_retour = (Button) findViewById(R.id.btn_retour_coteazur);

        Bouton_CoteAzur_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité

                finish();
            }
        });
    }
}
