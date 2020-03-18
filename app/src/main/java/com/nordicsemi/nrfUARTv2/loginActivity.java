package com.nordicsemi.nrfUARTv2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends Activity {
    public Button button_lgn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        button_lgn = (Button)findViewById(R.id.lgn);
        button_lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginActivity.this, WindowsActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}

