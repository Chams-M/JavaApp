package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // declaration des composants
    Button btn_qte,btn_val;
    EditText ed_mail,ed_pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //afficher fichier xml in res .. R.color / R.string /

        setContentView(R.layout.activity_main);

        // recuperation

        btn_qte=findViewById(R.id.bt_quitter_auth);
        btn_val=findViewById(R.id.bt_valider_auth);
        ed_mail=findViewById(R.id.ed_email_auth);
        ed_pwd=findViewById(R.id.ed_pwd_auth);


        // evenement

        btn_qte.setOnClickListener(new View.OnClickListener() { // new O
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_val.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperer les chaines saisies
                String email =ed_mail.getText().toString();
                String pwd=ed_pwd.getText().toString();

                if(email.equalsIgnoreCase("chm")&& pwd.equals("000")){

                    //passage vers acceuil
                    Intent i=new Intent(MainActivity.this,Acceuil.class);
                    startActivity(i);
                    finish();
                }
                else{
                    //message d'erreur
                    Toast.makeText(MainActivity.this, "echec", Toast.LENGTH_SHORT).show();
                    // exemple test de cnx d'internet avc toast
                }
            }
        });


    }
}