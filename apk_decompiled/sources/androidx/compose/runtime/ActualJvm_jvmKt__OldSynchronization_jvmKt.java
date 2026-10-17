package androidx.compose.runtime;

import defpackage.er;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class ActualJvm_jvmKt__OldSynchronization_jvmKt {
    @er
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m3834synchronized(Object obj, iy iyVar) {
        R r;
        synchronized (obj) {
            r = (R) iyVar.invoke();
        }
        return r;
    }
}
