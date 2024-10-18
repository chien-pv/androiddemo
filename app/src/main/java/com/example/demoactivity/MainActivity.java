package com.example.demoactivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Activity", "onCreate");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity", "onStart");
        Button btn = findViewById(R.id.button);
        TextView tv = findViewById(R.id.texview11);
        EditText user = findViewById(R.id.editTextText);
        EditText pass = findViewById(R.id.editTextTextPassword);
//        EditText tentk =  findViewById(R.id.editTextText2);
//        tentk.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkBox2);
                if(checkBox.isChecked()){
                    tv.setText("Bạn đã đăng nhập thành công!! \n" + user.getText() + "\n" + pass.getText());
                } else {
                    tv.setText("Bạn đã đăng nhập thành công!!");
                }
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Activity", "onRestart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activity", "onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity", "onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity", "onResume");

    }
}