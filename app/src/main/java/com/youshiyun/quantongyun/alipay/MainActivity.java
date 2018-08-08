package com.youshiyun.quantongyun.alipay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.io.File;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void load(View view) {
//        获取文件
        File file =new File(Environment.getExternalStorageDirectory(),"plugin.apk");
        PluginManager.getInstance().loadPath(file.getAbsolutePath());
    }

    public void click(View view) {
        Intent lIntent=new Intent(this,ProxyActivity.class);
        lIntent.putExtra("className","淘票票全类目   MainActivity");
        startActivity(lIntent);
    }


}
