package br.com.dgimenes.materialcardsandtiles.card_with_header;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import br.com.dgimenes.materialcardsandtiles.R;

public class CardWithHeaderDataViewHolder extends RecyclerView.ViewHolder {

    public ImageView bigImageView;
    public ImageView headerImageView;

    public CardWithHeaderDataViewHolder(View cardView) {
        super(cardView);
        bigImageView = (ImageView) cardView.findViewById(R.id.big_image_view);
        headerImageView = (ImageView) cardView.findViewById(R.id.header_image_view);
    }
}
