package androidx.compose.foundation.internal;

import defpackage.iy;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void checkPrecondition(boolean z, iy iyVar) {
        if (z) {
            return;
        }
        throwIllegalStateException((String) iyVar.invoke());
    }

    public static final <T> T checkPreconditionNotNull(T t, iy iyVar) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck((String) iyVar.invoke());
        o.j();
        return null;
    }

    public static final void requirePrecondition(boolean z, iy iyVar) {
        if (z) {
            return;
        }
        throwIllegalArgumentException((String) iyVar.invoke());
    }

    public static final <T> T requirePreconditionNotNull(T t, iy iyVar) {
        if (t != null) {
            return t;
        }
        throwIllegalArgumentExceptionForNullCheck((String) iyVar.invoke());
        o.j();
        return null;
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Void throwIllegalArgumentExceptionForNullCheck(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void checkPrecondition(boolean z) {
        if (z) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    public static final <T> T checkPreconditionNotNull(T t) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        o.j();
        return null;
    }
}
