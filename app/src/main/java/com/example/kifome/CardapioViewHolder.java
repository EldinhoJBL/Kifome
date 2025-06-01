package com.example.kifome;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardapioViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_churrasco;

    public CardapioViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_churrasco = itemView.findViewById(R.id.tv_churrasco);
    }
}
