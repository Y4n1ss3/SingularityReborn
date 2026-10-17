package androidx.compose.foundation.platform;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Synchronization_androidKt {
    public static final Object makeSynchronizedObject(Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object makeSynchronizedObject$default(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m1017synchronized(Object obj, iy iyVar) {
        R r;
        synchronized (obj) {
            r = (R) iyVar.invoke();
        }
        return r;
    }
}
