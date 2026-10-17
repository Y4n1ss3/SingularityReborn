package com.topjohnwu.superuser.internal;

import android.os.Handler;
import android.os.Looper;
import com.topjohnwu.superuser.ShellUtils;
import defpackage.hg0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class UiThreadHandler {
    public static final Handler handler = new Handler(Looper.getMainLooper());
    public static final Executor executor = new hg0(1);

    public static void run(Runnable runnable) {
        if (ShellUtils.onMainThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void runAndWait(Runnable runnable) {
        if (ShellUtils.onMainThread()) {
            runnable.run();
            return;
        }
        WaitRunnable waitRunnable = new WaitRunnable(runnable);
        handler.post(waitRunnable);
        waitRunnable.waitUntilDone();
    }
}
