package com.msaggik.fifthlessonanimalhandbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.ViewHolder> {


    private final LayoutInflater inflater;
    private final List<Planet> animals;
    public PlanetAdapter(Context context, List<Planet> animals) {
        this.inflater = LayoutInflater.from(context);
        this.animals = animals;
    }


    @Override
    public PlanetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PlanetAdapter.ViewHolder holder, int position) {
        Planet animal = animals.get(position);
        holder.animalView.setImageResource(animal.getAnimalResource());
        holder.nameView.setText(animal.getName());
        holder.animalDescriptionView.setText(animal.getAnimalDescription());
        holder.populationSizeView.setText(animal.getPopulationSize());
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView animalView;
        final TextView nameView, animalDescriptionView, populationSizeView;


        ViewHolder(View view) {
            super(view);
            animalView = view.findViewById(R.id.animalResource);
            nameView = view.findViewById(R.id.name);
            animalDescriptionView = view.findViewById(R.id.animalDescription);
            populationSizeView = view.findViewById(R.id.populationSize);
        }
    }
}
