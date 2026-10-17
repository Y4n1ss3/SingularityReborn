package androidx.compose.ui.platform;

import defpackage.er;
import defpackage.iy;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class JvmActuals_jvmKt {
    public static final Object nativeClass(Object obj) {
        return obj.getClass();
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        return str + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    @er
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m6763synchronized(Object obj, iy iyVar) {
        R r;
        synchronized (obj) {
            r = (R) iyVar.invoke();
        }
        return r;
    }
}
