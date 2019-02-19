package com.example.geshuai.debate;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by GeShuai on 2018/5/15.
 */

public class disscussion_fragment extends Fragment implements View.OnClickListener {
    private String context;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    public disscussion_fragment(String context){
        this.context = context;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.discussion_fragment,container,false);
        imageView1= (ImageView)view.findViewById(R.id.Image1);
        imageView2= (ImageView)view.findViewById(R.id.Image2);
        imageView3= (ImageView)view.findViewById(R.id.Image3);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);

        return view;
    }


    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Image1:
                break;
            case R.id.Image2:
                break;
            case R.id.Image3:
                break;

        }
    }
}
