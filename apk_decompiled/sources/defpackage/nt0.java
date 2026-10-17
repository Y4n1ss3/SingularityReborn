package defpackage;

import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class nt0 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final ts f;

    static {
        String str;
        int i = zs0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = q10.E("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, SnapshotId_jvmKt.SnapshotIdMax);
        int i2 = zs0.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = q10.F("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        d = q10.F("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(q10.E("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, SnapshotId_jvmKt.SnapshotIdMax));
        f = ts.n;
    }
}
