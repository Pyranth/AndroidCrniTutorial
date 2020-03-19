package com.example.newapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newapp.adapters.MyAdapter;

import java.util.List;
import java.util.Vector;

public class MyFragment extends Fragment {
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.my_fragment, container, false);

        recyclerView = (RecyclerView) fragment.findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<String> data = new Vector<String>();
        data.add("Gojko 1");
        data.add("Gojko 2");
        data.add("Gojko 3");
        data.add("Gojko 4");
        data.add("Gojko 5");

        MyAdapter adapter = new MyAdapter(data);

        recyclerView.setAdapter(adapter);

        return fragment;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
