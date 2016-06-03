package br.com.dgimenes.materialcardsandtiles.grid_with_tiles;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.ref.WeakReference;
import java.util.List;

import br.com.dgimenes.materialcardsandtiles.R;

public class GridWithTilesAdapter extends RecyclerView.Adapter<GridWithTilesDataViewHolder> {

    private List<GridWithTilesData> data;
    private WeakReference<Context> contextWeakReference;

    GridWithTilesAdapter(Context context, List<GridWithTilesData> data) {
        this.data = data;
        this.contextWeakReference = new WeakReference<>(context);
    }

    @Override
    public GridWithTilesDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(contextWeakReference.get()).inflate(
                R.layout.tile, parent, false);
        return new GridWithTilesDataViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(GridWithTilesDataViewHolder holder, int position) {
        holder.imageView.setImageResource(data.get(position).drawableRes);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
