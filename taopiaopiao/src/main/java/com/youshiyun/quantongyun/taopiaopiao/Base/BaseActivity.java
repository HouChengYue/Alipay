package com.youshiyun.quantongyun.taopiaopiao.Base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.youshiyun.quantongyun.alipaystander.AlipayInterface;

/**
 * Created by 侯程月  2018年08月08日.
 * QQ 437286343
 */
public class BaseActivity extends Activity implements AlipayInterface {

    protected Activity that;

    @Override
    public void onActivityCreated(Bundle saveInstanceState) {

    }


    @Override
    public <T extends View> T findViewById(int id) {
        if (that != null) {
            return that.findViewById(id);
        } else {
            return super.findViewById(id);
        }
    }

    @Override
    public ClassLoader getClassLoader() {
        if (that != null) {
            return that.getClassLoader();
        } else {
            return super.getClassLoader();
        }
    }

    @NonNull
    @Override
    public LayoutInflater getLayoutInflater() {
        if (that != null) {
            return that.getLayoutInflater();
        }
        return super.getLayoutInflater();
    }

    @Override
    public Window getWindow() {
        if (that != null) {
            return that.getWindow();
        }
        return super.getWindow();
    }

    @Override
    public WindowManager getWindowManager() {
        if (that != null) {
            return that.getWindowManager();
        }
        return super.getWindowManager();
    }

    /**
     * super.setonContentView(int layoutResID)
     * <p>
     * 最终调用的是系统给我们注入的上下文
     *
     * @param layoutResID
     */
    @Override
    public void setContentView(int layoutResID) {
        if (that != null) {
            that.setContentView(layoutResID);
        } else {
            super.setContentView(layoutResID);
        }
    }

    @Override
    public void onActivityStarted() {

    }

    @Override
    public void onActivityResumed() {

    }

    @Override
    public void onActivityPaused() {

    }

    @Override
    public void onActivityStopped() {

    }

    @Override
    public void onActivitySaveInstanceState(Bundle outState) {

    }

    @Override
    public void onActivityDestroyed() {

    }

    @Override
    public void attach(Activity Activity) {
        this.that = Activity;
    }
}
