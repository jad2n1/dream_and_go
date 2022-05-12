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
            //On place un écouteur sur le bouton pour savoir quand est ce qu'on aura cliquer dessus
            @Override
            public void onClick(View view) {
                //Lorsqu'on clique :
                //Ouverture de l'activité Page Select, qui corresponds au choix de l'alcool principal du cocktail.
                Intent intent = new Intent(MainActivity.this, choix_destination.class);
                startActivity(intent);

            }
        });



    }
}