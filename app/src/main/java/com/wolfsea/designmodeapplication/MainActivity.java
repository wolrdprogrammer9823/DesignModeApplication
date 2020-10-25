package com.wolfsea.designmodeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wolfsea.designmodeapplication.bean.DataInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message = "{\n" +
                "  \"resultCode\":\"00\",\n" +
                "  \"configInfo\":\"1234\",\n" +
                "  \"others\":\"其他\",\n" +
                "  \"resultInfo\":[\n" +
                "     {\n" +
                "        \"id\":\"101\",\n" +
                "        \"score\":100,\n" +
                "        \"phone\":\"101803832\",\n" +
                "        \"grade\":\"1\",\n" +
                "        \"hobby\":\"滑冰\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\":\"102\",\n" +
                "        \"score\":90,\n" +
                "        \"grade\":\"3\",\n" +
                "        \"hobby\":\"游泳\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\":\"103\",\n" +
                "        \"score\":80,\n" +
                "        \"hobby\":\"羽毛球\"\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        Gson gson = new Gson();
        DataInfo dataInfo = gson.fromJson(message, DataInfo.class);
        Log.d("data", "1111->" + dataInfo.toString());

        DataInfo dataInfo1 = JSON.parseObject(message, DataInfo.class);
        Log.d("data", "2222->" + dataInfo1.toString());
    }
}