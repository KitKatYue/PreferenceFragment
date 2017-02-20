package com.example.preferencefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //不要设置setContentView
        if (savedInstanceState == null) {
            SettingFragment settingFragment = new SettingFragment();
            getFragmentManager().
                    beginTransaction().
                    replace(android.R.id.content, settingFragment).
                    commit();
        }
    }
}
