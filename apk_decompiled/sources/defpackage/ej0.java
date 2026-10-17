package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ej0 {
    public static Handler getHandler(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void callbackFailAsync(final int i, Handler handler) {
        getHandler(handler).post(new Runnable() { // from class: dj0
            @Override // java.lang.Runnable
            public final void run() {
                ej0.this.onFontRetrievalFailed(i);
            }
        });
    }

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        getHandler(handler).post(new zf(3, this, typeface));
    }

    public abstract void onFontRetrievalFailed(int i);

    public abstract void onFontRetrieved(Typeface typeface);
}
