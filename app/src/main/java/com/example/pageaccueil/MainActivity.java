package com.example.pageaccueil;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;



import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button boutonDemarrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); // permet d'enlever la bar d'en haut


        boutonDemarrer = (Button) findViewById(R.id.bienvenue);

        boutonDemarrer.setOnClickListener(new View.OnClickListener() {
            // ajout d'un écouteur sur le bouton qui permet de lancer la page destination une fois
            // le bouton cliqué

            @Override
            public void onClick(View view) {
                //
                Intent intent = new Intent(MainActivity.this, choix_destination.class);
                startActivity(intent); // ouverture de la page choic destinations

            }
        });



    }
}