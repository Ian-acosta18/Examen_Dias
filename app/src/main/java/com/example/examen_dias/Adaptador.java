package com.example.examen_dias;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.VH> {
    List<String> datos;
    public Adaptador(List<String> d) { this.datos = d; }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup p, int v) {
        View view = LayoutInflater.from(p.getContext()).inflate(android.R.layout.simple_list_item_1, p, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH h, int i) { h.t.setText(datos.get(i)); }

    @Override
    public int getItemCount() { return datos.size(); }

    static class VH extends RecyclerView.ViewHolder {
        TextView t;
        VH(View v) { super(v); t = v.findViewById(android.R.id.text1); }
    }
}