package br.com.dgimenes.materialcardsandtiles.grid_with_tiles;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import br.com.dgimenes.materialcardsandtiles.R;

public class GridWithTilesDataViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public GridWithTilesDataViewHolder(View cardView) {
        super(cardView);
        imageView = (ImageView) cardView.findViewById(R.id.image_view);
    }
}
