package com.jiyun.android.server_qr;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by 608 on 2017-05-18.
 */

public class AddShopActivity  extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addshop_activity);
        Button addbtn = (Button) findViewById(R.id.add_done);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show();
            }
        });
    }

    void show()

    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("가게 생성 완료")
                .setMessage("E-mail로 QR코드가 곧 전송됩니다.")
                .setCancelable(false)
                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        AddShopActivity.this.finish();

                    }
                });

        AlertDialog alert = builder.show();
    }

}
