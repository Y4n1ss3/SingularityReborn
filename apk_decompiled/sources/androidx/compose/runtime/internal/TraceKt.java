package androidx.compose.runtime.internal;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, iy iyVar) {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection(str);
        try {
            T t = (T) iyVar.invoke();
            trace.endSection(beginSection);
            return t;
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }
}
