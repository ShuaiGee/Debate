package com.example.geshuai.debate;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by GeShuai on 2018/5/15.
 */


public class news_fragment extends Fragment implements View.OnClickListener {
    private String context;


    public news_fragment(String context){
        this.context = context;
    }
    LinearLayout linearLayout;
    LinearLayout linearLayout2;
    LinearLayout linearLayout3;
    LinearLayout linearLayout4;
    TextView text;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_fragment,container,false);
        linearLayout = (LinearLayout) view.findViewById(R.id.line1);
        linearLayout2 = (LinearLayout) view.findViewById(R.id.line2);
        linearLayout3 = (LinearLayout) view.findViewById(R.id.line3);
        linearLayout4 = (LinearLayout) view.findViewById(R.id.line4);
        text = (TextView)view.findViewById(R.id.number);
        linearLayout.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);

        return view;
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.line1:
                Intent intent = new Intent(getActivity(),new11.class);
                startActivity(intent);
                break;
            case R.id.line2:
                Intent intent2 = new Intent(getActivity(),new12.class);
                startActivity(intent2);

                break;
            case R.id.line3:
                Intent intent3 = new Intent(getActivity(),new13.class);
                startActivity(intent3);

                break;
            case R.id.line4:
                Intent intent4 = new Intent(getActivity(),new14.class);
                startActivity(intent4);

                break;

        }

    }
}
