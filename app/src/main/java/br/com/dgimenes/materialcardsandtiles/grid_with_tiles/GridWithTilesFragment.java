package br.com.dgimenes.materialcardsandtiles.grid_with_tiles;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.dgimenes.materialcardsandtiles.R;

public class GridWithTilesFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)
                inflater.inflate(R.layout.fragment_grid_with_tiles, container, false);
        setupUI(rootView);
        return rootView;
    }

    private void setupUI(ViewGroup rootView) {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new GridWithTilesAdapter(getActivity(), createFakeData()));
    }

    private List<GridWithTilesData> createFakeData() {
        List<GridWithTilesData> data = new ArrayList<>();
        data.add(new GridWithTilesData(R.drawable.a));
        data.add(new GridWithTilesData(R.drawable.b));
        data.add(new GridWithTilesData(R.drawable.c));
        data.add(new GridWithTilesData(R.drawable.d));
        data.add(new GridWithTilesData(R.drawable.a));
        data.add(new GridWithTilesData(R.drawable.b));
        return data;
    }
}
