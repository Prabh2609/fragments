package com.example.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class demoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.from(getContext()).inflate(R.layout.fragment_layout,container,false);

        ArrayAdapter adapter=new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.android_version));
        ListView listView=view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
