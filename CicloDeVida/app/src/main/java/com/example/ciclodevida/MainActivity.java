package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guardarLog("OnCreate");
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        //La actividad está creada
    }

    @Override
    protected void onStart() {
        super.onStart();
        guardarLog("OnStart");
        Toast.makeText(this, "OnStar", Toast.LENGTH_SHORT).show();
        //La actividad está a punto de hacerse visible

    }

    @Override
    protected void onResume() {
        super.onResume();
        guardarLog("OnResume");
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        //La actividad se ha vuelto visible (ahora se "reanuda").
    }

    @Override
    protected void onPause() {
        super.onPause();
        guardarLog("OnPause");
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        //Esta actividad está a punto de ser detenida
    }

    @Override
    protected void onStop() {
        super.onStop();
        guardarLog("OnStop");
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        //Esta actividad está detenida
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        guardarLog("OnDestroy"); // Profe, éste Log no me lo muestra en el Run :0
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        //La actividad está a punto de ser destruida.
    }

    private void guardarLog(String nombreFuncion) {
        Log.d(TAG, "Estoy en la función" + nombreFuncion);
    }
}