package com.example.geshuai.debate;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private TextView news;
    private TextView debate;
    private TextView person;
    private TextView discussion;


    FrameLayout frameLayout;
  /*  LinearLayout tabMenu;
    private int currentTab;
    private Fragment[] mFragments;*/

    private news_fragment f1;
    private debate_fragment f2;
    private disscussion_fragment f3;
    private person_fragment f4;
    private FragmentManager fragmentManager;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bindView();

    }



    private void bindView() {
        /*topBar = (TextView)this.findViewById(R.id.txt_top);*/
        news = (TextView)this.findViewById(R.id.news);
        debate = (TextView)this.findViewById(R.id.debate);
        discussion = (TextView)this.findViewById(R.id.discussion);
        person = (TextView)this.findViewById(R.id.person);
        frameLayout = (FrameLayout) findViewById(R.id.fragment_container);

        news.setOnClickListener(this);
        person.setOnClickListener(this);
        discussion.setOnClickListener(this);
        debate.setOnClickListener(this);



    }
    public void selected(){
        news.setSelected(false);
        person.setSelected(false);
        debate.setSelected(false);
        discussion.setSelected(false);
    }
    public void hideAllFragment(FragmentTransaction transaction){
        if(f1!=null){
            transaction.hide(f1);
        }
        if(f2!=null){
            transaction.hide(f2);
        }
        if(f3!=null){
            transaction.hide(f3);
        }
        if(f4!=null){
            transaction.hide(f4);
        }
    }
    public void onClick(View v) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        switch(v.getId()){
            case R.id.news:
                selected();
                news.setSelected(true);
                hideAllFragment(transaction);
                if(f1==null){
                    f1 = new news_fragment("第一个Fragment");
                    transaction.add(R.id.fragment_container,f1);
                }else{
                    transaction.show(f1);
                }
                break;



            case R.id.debate:
                selected();
                debate.setSelected(true);
                hideAllFragment(transaction);
                if(f2==null){
                    f2 = new debate_fragment("第二个Fragment");
                    transaction.add(R.id.fragment_container,f2);
                }else{
                    transaction.show(f2);
                }
                break;
            case R.id.discussion:
                selected();
                discussion.setSelected(true);
                hideAllFragment(transaction);
                if(f3==null){
                    f3 = new disscussion_fragment("第三个Fragment");
                    transaction.add(R.id.fragment_container,f3);
                }else{
                    transaction.show(f3);
                }
                break;
            case R.id.person:
                selected();
                person.setSelected(true);
                hideAllFragment(transaction);
                if(f4==null){
                    f4 = new person_fragment("第四个Fragment");
                    transaction.add(R.id.fragment_container,f4);
                }else{
                    transaction.show(f4);
                }
                break;
        }

        transaction.commit();
    }
}
