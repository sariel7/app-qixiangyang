package com.example.a12541.weatherforecast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import cn.edu.pku.qixiangyang.util.NetUtil;

/**
 * Created by 12541 on 2018/9/26.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_info);

        if (NetUtil.getNetworkState(this) != NetUtil.NETWORN_NONE) {
            Log.d("myWeather", "别看了，有网有网");
            Toast.makeText(MainActivity.this, "都说了有网，看啥", Toast.LENGTH_LONG).show();
        }
        else {
            Log.d("myWeather", "你家wifi又断了，赶紧修");
            Toast.makeText(MainActivity.this, "交网费啊哥，停网了", Toast.LENGTH_LONG).show();
        }

    }
}
