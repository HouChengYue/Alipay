package com.youshiyun.quantongyun.alipay;

import android.content.Context;
import android.content.res.Resources;
import dalvik.system.DexClassLoader;
import java.io.File;

/**
 * Created by 侯程月  2018年08月08日.
 * QQ 437286343
 */
public class PluginManager {
    private static final PluginManager ourInstance = new PluginManager();
    private DexClassLoader mdexClassLoader;
    private Resources mResources;
    private Context mContext;

    public static PluginManager getInstance() {
        return ourInstance;
    }

    private PluginManager() {
    }
    public void loadPath(String path){
        File dexOutFile=mContext.getDir("dex",Context.MODE_PRIVATE);
                mdexClassLoader=new DexClassLoader(path)
    }

    public DexClassLoader getMdexClassLoader() {
        return mdexClassLoader;
    }

    public Resources getResources() {
        return mResources;
    }
}
