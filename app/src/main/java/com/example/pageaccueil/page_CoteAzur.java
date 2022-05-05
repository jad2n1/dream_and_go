package com.example.pageaccueil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class page_CoteAzur extends AppCompatActivity {
    Button Bouton_CoteAzur_retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coteazur_page);

        // 1) creation d’un objet-reference  spinner vers le spinner de l’activite
        Spinner monSpinner4 = (Spinner) findViewById(R.id.spinner_jours4);

// 2) creation d’un ArrayAdapter à partir de tab_pokemon et mise en forme par defaut
        ArrayAdapter<CharSequence> monAdapter = ArrayAdapter.createFromResource (this,
                R.array.Jours, android.R.layout.simple_spinner_item);

        // 3) définition de la mise en page
        monAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 4) Association de adapter au spinner
        monSpinner4.setAdapter(monAdapter);

        Bouton_CoteAzur_retour = (Button) findViewById(R.id.btn_retour_coteazur);

        Bouton_CoteAzur_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ouverture de l'activité
                Intent intent = new Intent(page_CoteAzur.this, choix_destination.class);
                startActivity(intent);
            }
        });
    }
}
