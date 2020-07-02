package cl.talentodigital.ciclodevida;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnRegistro;
    private Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("CicloDeVida", "onCreate");
        setContentView(R.layout.activity_main);
        btnRegistro = findViewById(R.id.btnRegistro);
        btnMenu = findViewById(R.id.btnMenu);

        btnRegistro.setOnClickListener((View v) -> goToRegistro());
        btnMenu.setOnClickListener((View v) -> goToMenu());

    }



    private void goToRegistro() {
        Intent intent = new Intent(this, RegistroUsuariosActivity.class);
        startActivity(intent);
    }

    private void goToMenu() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloDeVida", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CicloDeVida", "onReStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloDeVida", "onResumen");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloDeVida", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloDeVida", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicloDeVida", "onDestroy");
    }

    private void alert(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }

}