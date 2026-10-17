package androidx.compose.ui.text.input;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i2, iy iyVar) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? ((Number) iyVar.invoke()).intValue() : i3;
    }

    public static final int subtractExactOrElse(int i, int i2, iy iyVar) {
        int i3 = i - i2;
        return ((i ^ i3) & (i2 ^ i)) < 0 ? ((Number) iyVar.invoke()).intValue() : i3;
    }
}
