package com.Vedruna.blancoguerreroe01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener el nombre de usuario pasado desde LoginActivity
        Intent intent = getIntent();
        if (intent.hasExtra("nombre_usuario")) {
            String nombreUsuario = intent.getStringExtra("nombre_usuario");

            // Mostrar el nombre de usuario en la pantalla del contador
            TextView textViewNombreUsuario = findViewById(R.id.textView4);
            textViewNombreUsuario.setText("by " + nombreUsuario);
        }
    }
}