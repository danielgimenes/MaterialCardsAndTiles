package br.com.dgimenes.materialcardsandtiles.big_card;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.dgimenes.materialcardsandtiles.R;

public class BigCardDataViewHolder extends RecyclerView.ViewHolder {

    public TextView detailTextView;
    public ImageView expandCardImageView;
    public ImageView bigImageView;

    public BigCardDataViewHolder(View cardView) {
        super(cardView);
        detailTextView = (TextView) cardView.findViewById(R.id.detail_text_view);
        bigImageView = (ImageView) cardView.findViewById(R.id.big_image_view);
        expandCardImageView = (ImageView) cardView.findViewById(R.id.expand_card_image_view);
        expandCardImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (detailTextView.getVisibility() == View.GONE) {
                    detailTextView.setVisibility(View.VISIBLE);
                    expandCardImageView.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    detailTextView.setVisibility(View.GONE);
                    expandCardImageView.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
            }
        });
    }
}
