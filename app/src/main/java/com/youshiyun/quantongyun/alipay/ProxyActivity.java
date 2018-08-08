package com.youshiyun.quantongyun.alipay;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by 侯程月  2018年08月08日.
 * QQ 437286343
 */
public class ProxyActivity  extends Activity {
//    要跳转的 淘票票 Activity
    private String className;


        //1、加载className
        //2、加载 class
        //3、加载 Resource

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        className=getIntent().getStringExtra("className");

    }

    @Override
    public ClassLoader getClassLoader() {
        return PluginManager.getInstance().getMdexClassLoader();
    }

    @Override
    public Resources getResources() {
        return PluginManager.getInstance().getResources();
    }
}
