package androidx.compose.ui.unit;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
    public static final long DualFloatSignBit = -9223372034707292160L;

    public static final void checkPrecondition(boolean z, iy iyVar) {
        if (z) {
            return;
        }
        throwIllegalStateException((String) iyVar.invoke());
    }

    public static final void requirePrecondition(boolean z, iy iyVar) {
        if (z) {
            return;
        }
        throwIllegalArgumentException((String) iyVar.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }
}
