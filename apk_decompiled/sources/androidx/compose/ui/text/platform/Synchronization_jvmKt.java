package androidx.compose.ui.text.platform;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Synchronization_jvmKt {
    public static final SynchronizedObject makeSynchronizedObject(Object obj) {
        return new SynchronizedObject();
    }

    public static /* synthetic */ SynchronizedObject makeSynchronizedObject$default(Object obj, int i, Object obj2) {
        return new SynchronizedObject();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m7330synchronized(SynchronizedObject synchronizedObject, iy iyVar) {
        R r;
        synchronized (synchronizedObject) {
            r = (R) iyVar.invoke();
        }
        return r;
    }
}
