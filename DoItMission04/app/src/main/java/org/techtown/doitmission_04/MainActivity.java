package org.techtown.doitmission_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etSmsContent;
    private TextView tvCurrentByte;
    private Button btnSend, btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById();
        setEvent();
    }

    private void findViewById() {
        etSmsContent = findViewById(R.id.etSmsContent);
        tvCurrentByte = findViewById(R.id.tvCurrentByte);
        btnSend = findViewById(R.id.btnSend);
        btnClose = findViewById(R.id.btnClose);
    }

    private void setEvent() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSend();
            }}
        );

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClose();
            }}
        );

        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        }
    }

    private void doSend() {

    }

    private void doClose() {

    }

}
