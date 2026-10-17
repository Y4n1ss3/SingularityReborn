package defpackage;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class lb extends y80 {
    public static volatile lb m;

    public static lb a0() {
        if (m != null) {
            return m;
        }
        synchronized (lb.class) {
            try {
                if (m == null) {
                    lb lbVar = new lb(22);
                    new rq(22);
                    Executors.newFixedThreadPool(4, new qq());
                    m = lbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m;
    }
}
