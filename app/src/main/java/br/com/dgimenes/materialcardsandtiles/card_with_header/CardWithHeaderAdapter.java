package br.com.dgimenes.materialcardsandtiles.card_with_header;

import android.content.Context;
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
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
