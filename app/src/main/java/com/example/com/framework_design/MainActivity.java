package com.example.com.framework_design;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends Activity {
    ImageButton search;
    ImageButton setting;
    ImageButton alarm;
    ImageButton history;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        search=(ImageButton)findViewById(R.id.search_button);
        setting=(ImageButton)findViewById(R.id.setting_button);
        alarm=(ImageButton)findViewById(R.id.alarm_button);
        history=(ImageButton)findViewById(R.id.history_button);

        search.setOnClickListener(listener1);
        setting.setOnClickListener(listener2);
        alarm.setOnClickListener(listener3);
        history.setOnClickListener(listener4);
    }
   private Button.OnClickListener listener1 = new Button.OnClickListener(){
       @Override
       public void onClick(View arg0) {
           Intent intent1 = new Intent();
           intent1.setClass(context,Search.class);
           startActivity(intent1);
           finish();
       }
   };
    private Button.OnClickListener listener2 = new Button.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            Intent intent2 = new Intent();
            intent2.setClass(context,Setting.class);
            startActivity(intent2);
            finish();
        }
    };
    private Button.OnClickListener listener3 = new Button.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            Intent intent3 = new Intent();
            intent3.setClass(context,Alarm.class);
            startActivity(intent3);
            finish();
        }
    };
    private Button.OnClickListener listener4 = new Button.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            Intent intent4 = new Intent();
            intent4.setClass(context,History.class);
            startActivity(intent4);
            finish();
        }
    };
}
