package androidx.compose.foundation.text.input.internal;

import defpackage.ny;
import defpackage.q10;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class OpArray {
    private final int[] values;

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m1313boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m1314constructorimpl(int i) {
        return m1315constructorimpl(new int[i * 3]);
    }

    /* renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m1316copyOfpSmdads(int[] iArr, int i) {
        return m1315constructorimpl(Arrays.copyOf(iArr, i * 3));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1317equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && q10.b(iArr, ((OpArray) obj).m1325unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1318equalsimpl0(int[] iArr, int[] iArr2) {
        return q10.b(iArr, iArr2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m1319forEachimpl(int[] iArr, int i, boolean z, ny nyVar) {
        if (i < 0) {
            return;
        }
        if (!z) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 3;
                nyVar.invoke(Integer.valueOf(iArr[i3]), Integer.valueOf(iArr[i3 + 1]), Integer.valueOf(iArr[i3 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i4 = i * 3;
            nyVar.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1320forEachimpl$default(int[] iArr, int i, boolean z, ny nyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (i < 0) {
            return;
        }
        if (!z) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * 3;
                nyVar.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i5 = i * 3;
            nyVar.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr[i5 + 1]), Integer.valueOf(iArr[i5 + 2]));
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m1321getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1322hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m1323setimpl(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i * 3;
        iArr[i5] = i2;
        iArr[i5 + 1] = i3;
        iArr[i5 + 2] = i4;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1324toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1317equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m1322hashCodeimpl(this.values);
    }

    public String toString() {
        return m1324toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m1325unboximpl() {
        return this.values;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int[] m1315constructorimpl(int[] iArr) {
        return iArr;
    }
}
