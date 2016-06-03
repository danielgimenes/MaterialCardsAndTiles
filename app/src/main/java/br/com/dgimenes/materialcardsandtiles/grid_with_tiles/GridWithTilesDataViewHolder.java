package br.com.dgimenes.materialcardsandtiles.grid_with_tiles;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import br.com.dgimenes.materialcardsandtiles.R;

public class GridWithTilesDataViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public ImageView favoriteImageView;
    public ViewGroup contentPanel;

    public GridWithTilesDataViewHolder(View cardView) {
        super(cardView);
        imageView = (ImageView) cardView.findViewById(R.id.image_view);
        contentPanel = (ViewGroup) cardView.findViewById(R.id.content_panel);
        favoriteImageView = (ImageView) cardView.findViewById(R.id.favorite_image_view);
        favoriteImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleFavorite();
            }
        });
    }

    public void toggleFavorite() {
        boolean isFavorite = favoriteImageView.getTag() != null;
        setFavoriteState(!isFavorite);
    }

    public void setFavoriteState(boolean favoriteState) {
        if (favoriteState) {
            favoriteImageView.setImageResource(R.drawable.ic_favorite_white_24dp);
            favoriteImageView.setTag("");
        } else {
            favoriteImageView.setImageResource(R.drawable.ic_favorite_border_white_24dp);
            favoriteImageView.setTag(null);
        }
    }
}
