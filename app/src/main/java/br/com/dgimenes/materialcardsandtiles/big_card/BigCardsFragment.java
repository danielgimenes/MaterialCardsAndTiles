package br.com.dgimenes.materialcardsandtiles.big_card;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.dgimenes.materialcardsandtiles.R;

public class BigCardsFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)
                inflater.inflate(R.layout.fragment_big_cards, container, false);
        setupUI(rootView);
        return rootView;
    }

    private void setupUI(ViewGroup rootView) {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new BigCardsAdapter(getActivity(), createFakeData()));
    }

    private List<BigCardData> createFakeData() {
        List<BigCardData> data = new ArrayList<>();
        data.add(new BigCardData(R.drawable.c));
        data.add(new BigCardData(R.drawable.d));
        data.add(new BigCardData(R.drawable.a));
        data.add(new BigCardData(R.drawable.b));
        return data;
    }
}
