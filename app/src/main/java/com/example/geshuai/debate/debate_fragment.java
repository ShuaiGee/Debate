package com.example.geshuai.debate;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by GeShuai on 2018/5/15.
 */

public class debate_fragment extends Fragment implements View.OnClickListener {
    private String context;
    public debate_fragment(String context){
        this.context = context;
    }

    Button button1;
    Button button2;
    Button button3;
    ImageView imageView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.debate_fragment,container,false);
        button1= (Button)view.findViewById(R.id.button1);
        button2= (Button)view.findViewById(R.id.button2);
        button3= (Button)view.findViewById(R.id.button3);
        imageView= (ImageView)view.findViewById(R.id.image_view);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        imageView.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent = new Intent(getActivity(),BltActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 = new Intent(getActivity(),BltActivity.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(getActivity(),BltActivity.class);
                startActivity(intent2);
                break;
            case R.id.image_view:
                break;
        }

    }


}
