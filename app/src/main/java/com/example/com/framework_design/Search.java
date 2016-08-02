package com.example.com.framework_design;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

/**
 * Created by KouxuanNB on 2016/7/20.
 */
public class Search extends Activity {
    SearchView nns,pns,bns,dns;
    Button bb;
    private Context context;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);
        context=this;

     /*   nns=(SearchView)findViewById(R.id.nurse_name_search);
        pns=(SearchView)findViewById(R.id.patient_name_search);
        bns=(SearchView)findViewById(R.id.bed_number_serch);
        dns=(SearchView)findViewById(R.id.doctor_name_search);
        bb=(Button)findViewById(R.id.back_button);*/


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
