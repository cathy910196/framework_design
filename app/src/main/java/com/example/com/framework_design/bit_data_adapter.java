package com.example.com.framework_design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by KouxuanNB on 2016/7/27.
 */
public class bit_data_adapter extends BaseAdapter {

    // 定義 LayoutInflater
    private LayoutInflater myInflater;
    // 定義 Adapter 內藴藏的資料容器
    private ArrayList<bit_data> list;

    public bit_data_adapter(Context context, ArrayList<bit_data> list){
        //預先取得 LayoutInflater 物件實體
        myInflater = LayoutInflater.from(context);
        this.list = list;
    }
    @Override
    public int getCount() { // 公定寫法(取得List資料筆數)
        return list.size();
    }

    @Override
    public Object getItem(int position) { // 公定寫法(取得該筆資料)
        return list.get(position);
    }

    @Override
    public long getItemId(int position) { // 公定寫法(取得該筆資料的position)
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null) {
            // 1:將 R.layout.row 實例化
            convertView = myInflater.inflate(R.layout.data_layout, null);

            // 2:建立 UI 標籤結構並存放到 holder
            holder = new ViewHolder();
            holder.bed_number = (TextView)convertView.findViewById(R.id.textView1);
            holder.bit_components = (TextView)convertView.findViewById(R.id.textView2);
            holder.patient_name = (TextView)convertView.findViewById(R.id.textView3);
            holder.doctor_name= (TextView)convertView.findViewById(R.id.textView4);


            // 3:注入 UI 標籤結構 --> convertView
            convertView.setTag(holder);

        } else {
            // 取得  UI 標籤結構
            holder = (ViewHolder)convertView.getTag();
        }

        // 4:取得Fastfood物件資料
        bit_data bit_data = list.get(position);

        // 5:設定顯示資料
        holder.bed_number.setText(String.valueOf(bit_data.getBed_number())); // 記得要轉字串
        holder.bit_components.setText(bit_data.getBit_components());
        holder.patient_name.setText(bit_data.getPatient_name());
        holder.doctor_name.setText(bit_data.getDoctor_name());

        return convertView;
    }

    // UI 標籤結構
    static class ViewHolder {

        TextView bed_number;
        TextView patient_name;
        TextView bit_components;
        TextView doctor_name;
    }

}
