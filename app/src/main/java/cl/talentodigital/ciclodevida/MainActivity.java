package cl.talentodigital.ciclodevida;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSaludo;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("CicloDeVida", "onCreate");
        setContentView(R.layout.activity_main);
        btnSaludo = findViewById(R.id.btnSaludo);
        btnSalir = findViewById(R.id.btnSalir);

        btnSaludo.setOnClickListener(this);
        btnSalir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSalir:
                finish();
                break;
            case R.id.btnSaludo:
                Log.d("CicloDeVida", "OnClick de saludo");
                break;
        }
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