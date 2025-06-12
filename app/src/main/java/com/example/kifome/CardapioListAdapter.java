package com.example.kifome;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.DocumentSnapshot;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class CardapioListAdapter extends RecyclerView.Adapter<CardapioViewHolder> {

    private AdapterView.OnItemClickListener listener;

    public CardapioListAdapter(@NonNull FirestoreRecyclerOptions<RestauranteEditarCardapioInterface1> options) {

        super();

    }


    @NonNull
    @Override
    public CardapioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tela_login_restaurante, parent, false);
        return new CardapioViewHolder(view);
    }

    public interface OnItemClickListener {
        void onItemClick(DocumentSnapshot documentSnapshot, int position, String documentId);
    }


    @Override
    public int getItemCount() {
        return 0;
    }

}






