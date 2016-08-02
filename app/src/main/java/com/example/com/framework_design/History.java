package com.example.com.framework_design;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KouxuanNB on 2016/7/20.
 */
public class History extends Activity {

    ListView hd;
    Button bb;
    private Context context;
    String[] bed_numbers=new String[]{"1","2","3","4","5"};
    String[] patient_names=new String[]{"王一明","王二明","王三明","王四明","王五明"};
    String[] bit_components=new String[]{"生理食鹽水","葡萄糖水溶液","林格氏液","乳酸林格氏液","高張溶液"};
    String[] doctor_names=new String[]{"陳良醫","陳好醫","陳棒醫","陳超醫","陳御醫"};

    MyAdapter adapter=null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.history_layout);
        hd=(ListView)findViewById(R.id.history_data);
        bb=(Button)findViewById(R.id.back_button);
        bb.setOnClickListener(listener1);

        adapter = new MyAdapter(this);
        hd.setAdapter(adapter);
        hd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int arg2,
                                    long arg3) {
                openOptionsDialog(arg0.getItemAtPosition(arg2).toString());

            }
        });
    }
    // 對話框所執行的 function
    private void openOptionsDialog(String xMessage) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("對話框的標題");
        int number=Integer.valueOf(xMessage).intValue()-1;
        // 承接傳過來的字串，顯示在對話框之中
        dialog.setMessage("NO."+xMessage+"\n"+"病人:"+patient_names[number]+"\n"+"點滴試劑:"+bit_components[number]+"\n"+"主治醫師:"+doctor_names[number]);
        // 設定 PositiveButton 也就是一般 確定 或 OK 的按鈕
        dialog.setPositiveButton("確認", new DialogInterface.OnClickListener() {
            public void onClick( DialogInterface dialoginterface, int i) {
                // 當使用者按下確定鈕後所執行的動作
            }
        } );
        //設定 NegativeButton 也就是一般 取消 或 Cancel 的按鈕
      /*  dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialoginterface, int i) {
                當使用者按下 取消鈕 後所執行的動作
                openOptionsDialog("你要按確定鈕才能結束唷");
            }
        });*/
        dialog.show();
    } //EOF openOptionsDialog
    //回前頁
    private Button.OnClickListener listener1 = new Button.OnClickListener(){
        @Override
        public void onClick(View arg0) {
            Intent intent1 = new Intent();
            intent1.setClass(context,MainActivity.class);
            startActivity(intent1);
            finish();
        }
    };
    public class MyAdapter extends BaseAdapter{
        private LayoutInflater myInflater;

        public  MyAdapter(Context c){
            myInflater=LayoutInflater.from(c);
        }
        @Override
        public int getCount() {
            return bed_numbers.length;
        }

        @Override
        public Object getItem(int i) {
            return bed_numbers[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=myInflater.inflate(R.layout.data_layout,null);
            TextView bn=(TextView) convertView.findViewById(R.id.textView1);
            TextView bc=(TextView) convertView.findViewById(R.id.textView2);
            TextView pn=(TextView) convertView.findViewById(R.id.textView3);
            TextView dn=(TextView) convertView.findViewById(R.id.textView4);

            bn.setText(bed_numbers[position]);
            bc.setText(bit_components[position]);
            pn.setText(patient_names[position]);
            dn.setText(doctor_names[position]);
            return convertView;
        }
    }
}
