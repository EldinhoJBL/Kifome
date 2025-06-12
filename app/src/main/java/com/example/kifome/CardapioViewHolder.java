package com.example.kifome;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardapioViewHolder extends RecyclerView.ViewHolder {
    TextView textViewItemName;
    TextView textViewItemDescription;
    TextView textViewItemPrice;


    private TextView tv_churrasco;

    public CardapioViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewItemName = itemView.findViewById(R.id.textViewItemNameFirestore);
        textViewItemDescription = itemView.findViewById(R.id.textViewItemDescriptionFirestore);
        textViewItemPrice = itemView.findViewById(R.id.textViewItemPriceFirestore);

        tv_churrasco = itemView.findViewById(R.id.tv_churrasco);
    }

    public void bind(RestauranteEditarCardapioInterface1 RestauranteEditarCardapioInterface1) {
        textViewItemName.setText(RestauranteEditarCardapioInterface1.getName());
        textViewItemDescription.setText(RestauranteEditarCardapioInterface1.getDescription());
        textViewItemPrice.setText(String.format("R$ %.2f", RestauranteEditarCardapioInterface1.getPrice())); // Formata o preço
    }

}
