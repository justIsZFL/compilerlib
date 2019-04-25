package cn.exp.zfl.comlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.zfl.aptlib.Test;


//import cn.zfl.aptlib.Test;


@Test(path = "main")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
