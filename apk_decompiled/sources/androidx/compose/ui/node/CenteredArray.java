package androidx.compose.ui.node;

import defpackage.q10;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class CenteredArray {
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m6397boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6399equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && q10.b(iArr, ((CenteredArray) obj).m6406unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6400equalsimpl0(int[] iArr, int[] iArr2) {
        return q10.b(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m6401getimpl(int[] iArr, int i) {
        return iArr[i + m6402getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m6402getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6403hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m6404setimpl(int[] iArr, int i, int i2) {
        iArr[i + m6402getMidimpl(iArr)] = i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6405toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m6399equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m6403hashCodeimpl(this.data);
    }

    public String toString() {
        return m6405toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m6406unboximpl() {
        return this.data;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m6398constructorimpl(int[] iArr) {
        return iArr;
    }
}
