package com.example.com.framework_design;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by KouxuanNB on 2016/7/20.
 */
public class Setting  extends Activity {
    Button bb;
    ListView sl;
    private Context context;
    ArrayAdapter<String> listAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_layout);
        context=this;
        sl=(ListView)findViewById(R.id.setting_listview);
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

    private void showDialod(){

    }
}
