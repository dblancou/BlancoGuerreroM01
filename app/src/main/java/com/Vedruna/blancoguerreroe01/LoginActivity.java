package com.Vedruna.blancoguerreroe01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextPassword;
    private Button botonLogin;
    private TextView textViewLoginCorrecto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextNombre = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        botonLogin = findViewById(R.id.BotonLogin);
        textViewLoginCorrecto = findViewById(R.id.textView5);

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verificar las credenciales (aquí puedes comparar con "admin" y "admin" como en tu ejemplo)
                String nombre = editTextNombre.getText().toString();
                String password = editTextPassword.getText().toString();

                if (nombre.equals("admin") && password.equals("admin")) {
                    // Credenciales correctas
                    textViewLoginCorrecto.setText("Usuario y contraseña correcta");

                    // Pasar a la pantalla del contador
                    Intent intent = new Intent(LoginActivity.this, CounterActivity.class);
                    intent.putExtra("nombre_usuario", nombre);
                    startActivity(intent);
                } else {
                    // Credenciales incorrectas
                    textViewLoginCorrecto.setText("Usuario o contraseña incorrecta");
                }
            }
        });
    }
}
