package com.example.kylab.androidthingshx711.activity;


import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kylab.androidthingshx711.R;


public class IceBoxMainActivity extends BaseActivity {

    Button NFC_Button;
    TextView NFC_TextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodaccess);
        NFC_Button = findViewById(R.id.fa_rdbu);
        NFC_TextView = findViewById(R.id.fa_uuid);
        NFC_Button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(getMyuaService()!=null) {
                    getMyuaService().sendMessagetoUA(1);
                }
            }
        });

    }

    @Override
    protected void setState() {
        setCanUiShow(true);
        setCanUseUar(true);
        setWeightDataPrm(true);
        setNFCDataPrm(true);
    }

    @Override
    public void updataUI(Message urData) {


    }

    @Override
    public void updataNoUI(int dataTpye, String data) {

    }
}
