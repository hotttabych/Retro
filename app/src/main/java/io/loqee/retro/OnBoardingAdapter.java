package io.loqee.retro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OnBoardingAdapter extends RecyclerView.Adapter<OnBoardingAdapter.OnboardingViewHolder> {
    private List<Retro> retros;
    public OnBoardingAdapter(List<Retro> retros) {
        this.retros = retros;
    }

    @NonNull
    @Override
    public OnBoardingAdapter.OnboardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OnboardingViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_layout, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull OnBoardingAdapter.OnboardingViewHolder holder, int position) {
        holder.name.setText(retros.get(position).getName());
        holder.description.setText(retros.get(position).getDescription());
        holder.logo.setImageResource(retros.get(position).getLogo());
    }

    @Override
    public int getItemCount() {
        return retros.size();
    }

    class OnboardingViewHolder extends RecyclerView.ViewHolder {

        public TextView name, description;
        public ImageView logo;

        public OnboardingViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            logo = itemView.findViewById(R.id.logoView);
        }
    }
}