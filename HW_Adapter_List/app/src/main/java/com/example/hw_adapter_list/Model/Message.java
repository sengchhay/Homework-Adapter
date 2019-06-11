package com.example.hw_adapter_list.Model;

import android.support.annotation.DrawableRes;

public class Message {
    @DrawableRes
    private  int image;
    private  String name;
    private  String mess;




    public Message(int image, String name, String mess) {
        this.image = image;
        this.name = name;
        this.mess = mess;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
