package com.example.ta.stup2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlansFragment extends Fragment {


    private static final String TAG = "RecyclerViewFragment";
    private static final String KEY_LAYOUT_MANAGER = "layoutManager";
    private static final int SPAN_COUNT = 2;
    private static final int DATASET_COUNT = 15;


    protected RecyclerView mRecyclerView;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected List<PlanGroups>  mDataset;
    protected CustomAdapter mAdapter;

    public PlansFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_plans, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        mLayoutManager = new LinearLayoutManager(getActivity());


        prepareGroupData();

        mAdapter = new CustomAdapter(mDataset);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // Set CustomAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        Button mButton = (Button) rootView.findViewById(R.id.addbtn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });






        return rootView;
    }





    /**
     * Generates Strings for RecyclerView's adapter. This data would usually come
     * from a local content provider or remote server.
     */
    private void prepareGroupData() {

        mDataset = new ArrayList<PlanGroups>();

        PlanGroups planGroups = new PlanGroups("Mad Max: Fury Road", "Action & Adventure", "2015","fv");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("Inside Out", "Animation, Kids & Family", "2015","");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("Star Wars: Episode VII - The Force Awakens", "Action", "2015","");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("Shaun the Sheep", "Animation", "2015","");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("The Martian", "Science Fiction & Fantasy", "2015","");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("Mission: Impossible Rogue Nation", "Action", "2015","");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("Up", "Animation", "2009","");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("Star Trek", "Science Fiction", "2009","");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("The LEGO Movie", "Animation", "2014","");
        mDataset.add(planGroups);

        planGroups = new PlanGroups("Iron Man", "Action & Adventure", "2008","");
        mDataset.add(planGroups);



        //mAdapter.notifyDataSetChanged();
    }

}
