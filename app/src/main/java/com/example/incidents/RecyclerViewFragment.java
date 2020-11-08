package com.example.incidents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    protected RecyclerView mRecyclerView;
    protected AdapteList mAdapteList;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected ArrayList<String> mDataset;
    protected int DATASET_COUNT = 20;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void initDataset() {
        mDataset = new ArrayList<String>();
        for (int i = 0; i < DATASET_COUNT; i++) {
            mDataset.add("This is element # бла-бла" + i);
        }
    }


}
