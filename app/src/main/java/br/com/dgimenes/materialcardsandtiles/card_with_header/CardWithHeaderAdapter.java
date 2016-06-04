package br.com.dgimenes.materialcardsandtiles.card_with_header;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.ref.WeakReference;
import java.util.List;

import br.com.dgimenes.materialcardsandtiles.R;

public class CardWithHeaderAdapter extends RecyclerView.Adapter<CardWithHeaderDataViewHolder> {

    private List<CardWithHeaderData> data;
    private WeakReference<Context> contextWeakReference;

    CardWithHeaderAdapter(Context context, List<CardWithHeaderData> data) {
        this.data = data;
        this.contextWeakReference = new WeakReference<>(context);
    }

    @Override
    public CardWithHeaderDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(contextWeakReference.get()).inflate(
                R.layout.card_with_header, parent, false);
        return new CardWithHeaderDataViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(CardWithHeaderDataViewHolder holder, int position) {
        holder.bigImageView.setImageResource(data.get(position).drawableRes);

        Resources resources = contextWeakReference.get().getResources();
        Bitmap bitmap = BitmapFactory.decodeResource(resources, R.drawable.face);
        RoundedBitmapDrawable drawable = RoundedBitmapDrawableFactory.create(resources, bitmap);
        drawable.setCircular(true);
        holder.headerImageView.setImageDrawable(drawable);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
