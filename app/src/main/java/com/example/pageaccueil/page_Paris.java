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
TextView window_result;

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

        monSpinner.setOnApplyWindowInsetsListener(new AdapterView.OnItemClickListener() {
            // placement d'écouteurs sur les différents jours du spinner

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String choix_jours= parent.getSelectedItem().toString();
            if (choix_jours== "Jour1"){
                @Override
                public void onClick(View view) {
                    // ouverture de l'activité
                    Intent intent = new Intent(choix_destination.this, page_Alpes.class);
                    startActivity(intent);
                }
            }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            } //si rien n'est selectionné
        } );
        // exemple de commentaire vide
    }
}



