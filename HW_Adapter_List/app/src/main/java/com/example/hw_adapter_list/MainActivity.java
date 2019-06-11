package com.example.hw_adapter_list;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.hw_adapter_list.Adapter.MessageAdapter;
import com.example.hw_adapter_list.Model.Message;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    MessageAdapter messageAdapter;
    List<Message> messages= new ArrayList<>();
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messages.add(new Message(R.drawable.person,"Smart","thank you for using Smart"));
        messages.add(new Message(R.drawable.person,"888","your smartNas confirmation code is 6161"));
        messages.add(new Message(R.drawable.person,"SmartPay","thank you2"));
        messages.add(new Message(R.drawable.person,"Chhay","where are you now?"));
        messages.add(new Message(R.drawable.person,"1210","You have received USD 1. Thank you for using Smart"));
        messages.add(new Message(R.drawable.person,"Mss sakana","what do you do?"));
        messages.add(new Message(R.drawable.person,"Best Friend","Please call me now"));
        messages.add(new Message(R.drawable.person,"Smart","You won 2$ , you are lucky"));


        listView=findViewById(R.id.Listview);
        messageAdapter= new MessageAdapter(messages, context);
        listView.setAdapter(messageAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Message selectedMessage = messages.get(position);

                Intent intent = new Intent(getApplicationContext(),Message_infoActivity.class);

                intent.putExtra("image",selectedMessage.getImage());
                intent.putExtra("Name",selectedMessage.getName());
                intent.putExtra("Message",selectedMessage.getMess());
                startActivity(intent);

            }
        });



    }
}
