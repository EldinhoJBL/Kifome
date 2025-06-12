package com.example.kifome;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class RestauranteEditarCardapioInterface1 extends AppCompatActivity {
    private String name;
    private String description;
    private double price;
    private String documentId;

    public RestauranteEditarCardapioInterface1() {}

    public RestauranteEditarCardapioInterface1(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }

    public void setDescription(String description) { this.description = description; }
    public void setPrice(double price) { this.price = price; }

    public void setDocumentId(String documentId) { this.documentId = documentId; }

        Viewholder mViewHolder = new Viewholder();

    @Override
    public String toString() {
        return "RestauranteEditarCardapioInterface1{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_restaurante_editar_cardapio_interface1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });


        mViewHolder.rv_cardapio = findViewById(R.id.rv_cardapio);

    }

    private static class Viewholder{
        RecyclerView rv_cardapio;

    }

}
