package com.example.com.framework_design;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by KouxuanNB on 2016/7/20.
 */
public class Alarm  extends Activity {
    ListView al,ad;
    Button bb;
    private Context context;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_setting);
        context=this;
        al=(ListView)findViewById(R.id.alarm_listview);
        ad=(ListView)findViewById(R.id.alarm_data);
        bb=(Button)findViewById(R.id.back_button);
        bb.setOnClickListener(listener1);
    }
    private Button.OnClickListener listener1 = new Button.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            Intent intent1 = new Intent();
            intent1.setClass(context,MainActivity.class);
            startActivity(intent1);
            finish();
        }
    };
}
