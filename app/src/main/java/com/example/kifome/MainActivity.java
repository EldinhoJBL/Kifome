package com.example.kifome;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private FirebaseFirestore db;  // Instância do Firestore

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializa o Firestore
        db = FirebaseFirestore.getInstance();

        // Exemplo: Salvar um log de acesso ao abrir a Activity
        salvarLogAcesso();
    }

    // Método para salvar um log no Firestore
    private void salvarLogAcesso() {
        Map<String, Object> log = new HashMap<>();
        log.put("tela", "MainActivity");
        log.put("timestamp", System.currentTimeMillis());

        db.collection("logs_acesso")
                .add(log)
                .addOnSuccessListener(documentReference -> {
                    Log.d("Firestore", "Log salvo com ID: " + documentReference.getId());
                })
                .addOnFailureListener(e -> {
                    Log.w("Firestore", "Erro ao salvar log", e);
                });
    }

    // Seus métodos existentes (mantidos inalterados)
    public void CardapioClienteInterface1(View view) {
        Intent in = new Intent(MainActivity.this, CardapioClienteInterface1.class);
        startActivity(in);
    }

    public void abrirLoginRestaurante(View view) {
        Intent intent = new Intent(MainActivity.this, LoginRestauranteActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }



}