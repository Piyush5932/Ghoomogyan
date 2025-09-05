package com.example.ghoomogyaan.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ghoomogyaan.MainActivity;
import com.example.ghoomogyaan.R;
import com.example.ghoomogyaan.model.TopPlacesData;
import com.example.ghoomogyaan.utils.DetailsActivity;

import java.util.List;

public class TopPlacesAdapter extends RecyclerView.Adapter<TopPlacesAdapter.TopPlacesViewHolder> {
    MainActivity context;
    List<TopPlacesData> topPlacesDataList;

    public TopPlacesAdapter(MainActivity context, List<TopPlacesData> topPlacesDataList) {
        this.topPlacesDataList = topPlacesDataList;
        this.context=context;
    }

    @NonNull
    @Override
    public TopPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_places_row_item,parent,false);
        return new TopPlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewHolder holder, int position) {
        TopPlacesData currentItem = topPlacesDataList.get(position);
        holder.locality.setText(currentItem.getLocality());
        holder.placeName.setText(currentItem.getPlaceName());
        holder.price.setText(currentItem.getPrice());
        holder.placeImage.setImageResource(currentItem.getImageUrl());
        holder.desc.setText(currentItem.getDescription());

        holder.back.setImageResource(currentItem.getBackg());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start the DetailsActivity
                Intent intent = new Intent(context, DetailsActivity.class);

                // Pass the selected TopPlacesData object to the DetailsActivity
                intent.putExtra("object", currentItem);

                // Start the DetailsActivity
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topPlacesDataList.size();
    }

    public static class TopPlacesViewHolder extends RecyclerView.ViewHolder {
        ImageView placeImage,back;
        TextView placeName, locality, price, desc;

        public TopPlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.place_image);
            placeName = itemView.findViewById(R.id.place_name);
            locality = itemView.findViewById(R.id.locality_name);
            price = itemView.findViewById(R.id.price);
            desc = itemView.findViewById(R.id.description);
            back=itemView.findViewById((R.id.background));
        }
    }
}
