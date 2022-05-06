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

        // 2) creation d’un ArrayAdapter à partir de tab_pokemon et mise en forme par defaut
        ArrayAdapter<CharSequence> monAdapter = ArrayAdapter.createFromResource (this,
                R.array.Jours, android.R.layout.simple_spinner_item);

        // 3) définition de la mise en page
        monAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // 4) Association de adapter au spinner
        monSpinner.setAdapter(monAdapter);
        // exemple de commentaire vide
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



