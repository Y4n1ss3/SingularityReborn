package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class tx implements zs {
    public final Context d;
    public final sx e;
    public final Object f = new Object();
    public Handler g;
    public ThreadPoolExecutor h;
    public ThreadPoolExecutor i;
    public p10 j;

    public tx(Context context, sx sxVar) {
        d41.e(context, "Context cannot be null");
        this.d = context.getApplicationContext();
        this.e = sxVar;
    }

    @Override // defpackage.zs
    public final void a(p10 p10Var) {
        synchronized (this.f) {
            this.j = p10Var;
        }
        synchronized (this.f) {
            try {
                if (this.j == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.h;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new il("emojiCompat"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.i = threadPoolExecutor2;
                    this.h = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new j(this, 5));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f) {
            try {
                this.j = null;
                Handler handler = this.g;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.g = null;
                ThreadPoolExecutor threadPoolExecutor = this.i;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.h = null;
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final fy c() {
        try {
            Context context = this.d;
            Object[] objArr = {this.e};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            ey a = rx.a(context, Collections.unmodifiableList(arrayList));
            int i = a.a;
            if (i != 0) {
                throw new RuntimeException(j50.i(i, "fetchFonts failed (", ")"));
            }
            fy[] fyVarArr = (fy[]) a.b.get(0);
            if (fyVarArr == null || fyVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return fyVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
