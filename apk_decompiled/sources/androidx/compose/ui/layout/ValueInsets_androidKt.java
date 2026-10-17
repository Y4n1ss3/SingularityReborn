package androidx.compose.ui.layout;

import defpackage.v00;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ValueInsets_androidKt {
    private static final long ZeroValueInsets = ValueInsets.m6372constructorimpl(0);
    private static final long UnsetValueInsets = ValueInsets.m6372constructorimpl(-1);

    public static final long ValueInsets(v00 v00Var) {
        return ValueInsets.m6372constructorimpl((v00Var.a << 48) | (v00Var.b << 32) | (v00Var.c << 16) | v00Var.d);
    }

    public static final long getUnsetValueInsets() {
        return UnsetValueInsets;
    }

    public static final long getZeroValueInsets() {
        return ZeroValueInsets;
    }

    public static final long ValueInsets(int i, int i2, int i3, int i4) {
        return ValueInsets.m6372constructorimpl((i2 << 32) | (i << 48) | (i3 << 16) | i4);
    }
}
