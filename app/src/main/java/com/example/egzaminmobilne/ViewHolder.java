package com.example.egzaminmobilne;

import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    EditText textList;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        textList = itemView.findViewById(R.id.textList);
    }
}
