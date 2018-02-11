package com.example.ta.stup2;


import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    protected  TextView textExtend;

    protected Button doneBtn;

    protected FrameLayout frameLayout;
    RelativeLayout relativeLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view = inflater.inflate(R.layout.fragment_home, container, false);

        textExtend = (TextView) view.findViewById(R.id.viewextend);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.relativeparent) ;

        frameLayout = (FrameLayout) relativeLayout.findViewById(R.id.addonscreen);

        frameLayout.setVisibility(View.GONE);

        textExtend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frameLayout.setVisibility(View.VISIBLE);
                Log.d("Hello", "working check ");

            }
        });

        doneBtn = (Button) view.findViewById(R.id.donebtn);
        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameLayout.setVisibility(View.GONE);
            }
        });







        return view;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {


    }
}

