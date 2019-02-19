package com.example.geshuai.debate;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by GeShuai on 2018/5/15.
 */

public class person_fragment extends Fragment implements View.OnClickListener{
    private String context;
    LinearLayout linearLayout;
    LinearLayout linearLayout2;
    LinearLayout linearLayout3;
    LinearLayout linearLayout4;
    LinearLayout linearLayout5;


    public person_fragment(String context){
        this.context = context;
    }

    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.person_fragment,container,false);
        linearLayout = (LinearLayout) view.findViewById(R.id.line2);
        linearLayout2 = (LinearLayout) view.findViewById(R.id.line3);
        linearLayout3 = (LinearLayout) view.findViewById(R.id.line4);
        linearLayout4 = (LinearLayout) view.findViewById(R.id.line5);
        linearLayout5 = (LinearLayout) view.findViewById(R.id.line6);
        linearLayout.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);
        linearLayout5.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.line2:

                break;
            case R.id.line3:

                break;
            case R.id.line4:

                break;
            case R.id.line5:

                break;
            case R.id.line6:

                break;
        }
    }
}
