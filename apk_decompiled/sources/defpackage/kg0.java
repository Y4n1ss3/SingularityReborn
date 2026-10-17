package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class kg0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    public /* synthetic */ kg0(Context context, int i) {
        this.d = i;
        this.e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Context context = this.e;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new kg0(context, 1));
                break;
            default:
                cq.I(context, new hg0(0), cq.d, false);
                break;
        }
    }
}
