package com.example.affirmations.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.affirmations.R;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private final Context context;
    private final List<Affirmation> dataset;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;
        public ItemViewHolder(@NonNull View view) {
            super(view);
            this.textView = view.findViewById(R.id.item_title);
            this.imageView = view.findViewById(R.id.item_image);
        }
    }

    public ItemAdapter(Context context, List<Affirmation> dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public ItemAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ItemViewHolder holder, int position) {
        Affirmation item = dataset.get(position);
        holder.textView.setText(context.getResources().getString(item.getStringResourcesId()));
        holder.imageView.setImageResource(item.getImgResourceId());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
