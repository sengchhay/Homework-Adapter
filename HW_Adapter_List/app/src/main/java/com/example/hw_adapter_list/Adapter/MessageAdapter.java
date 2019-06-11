package com.example.hw_adapter_list.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hw_adapter_list.Model.Message;
import com.example.hw_adapter_list.R;

import java.util.List;

public class MessageAdapter extends BaseAdapter {


    private List<Message>messages;
    private Context context;

    public  MessageAdapter(List<Message>messages,Context context){
        this.messages=messages;
        this.context=context;
    }

    @Override
    public Object getItem(int position) {
        return this.messages.get(position);
    }

    @Override
    public int getCount() {
        return this.messages.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View view=null;
        if (convertView!=null)
            view= convertView;
        else
            view=LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.text_list_message,parent,false);

        //bind data to listview

       ImageView imageView=view.findViewById(R.id.image);
        TextView name=view.findViewById(R.id.Name);
        TextView mess=view.findViewById(R.id.Mess);
        Message message= messages.get(position);

        name.setText(message.getName());
        mess.setText(message.getMess());


        return view;
    }
}
