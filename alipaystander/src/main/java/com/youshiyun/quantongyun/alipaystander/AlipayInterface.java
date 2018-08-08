package com.youshiyun.quantongyun.alipaystander;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by 侯程月  2018年08月08日.
 * QQ 437286343
 */
public interface AlipayInterface {
    /**
     * 传入生命周期
     */
    public void onActivityCreated(Bundle saveInstanceState);

    public void onActivityStarted();

    public void onActivityResumed();

    public void onActivityPaused();

    public void onActivityStopped();

    public void onActivitySaveInstanceState(Bundle outState);

    public void onActivityDestroyed();

    public boolean onTouchEvent(MotionEvent event);

    public void onBackPressed();
    /**
     *需要支付宝给淘票票 注入上下文
     *
     */
    public void attach(Activity Activity);

}
