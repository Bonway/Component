package com.xiaojinzi.component.support;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.util.Log;

import com.xiaojinzi.component.Component;

/**
 * 用于打印日志
 * time   : 2019/01/25
 *
 * @author : xiaojinzi 30212
 */
public class LogUtil {

    private LogUtil() {
    }

    @AnyThread
    public static void log(@NonNull String tag, @NonNull String message) {
        if (Component.isDebug()) {
            Log.d(tag, message);
        }
    }

    @AnyThread
    public static void log(@NonNull String message) {
        log("Component", message);
    }

}
