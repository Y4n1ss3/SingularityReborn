package androidx.compose.ui.node;

import defpackage.q10;
import defpackage.uf;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class Snake {
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m6642addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        int i;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (m6650getHasAdditionOrRemovalimpl(iArr)) {
            i = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i2 += ((iArr[4] != 0 ? 1 : 0) | (m6655isAdditionimpl(iArr) ? 1 : 0)) ^ 1;
            i3 += ((!m6655isAdditionimpl(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            i = iArr[2] - iArr[0];
        }
        intStack.pushDiagonal(i2, i3, i);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m6643boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6645equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && q10.b(iArr, ((Snake) obj).m6657unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6646equalsimpl0(int[] iArr, int[] iArr2) {
        return q10.b(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m6647getDiagonalSizeimpl(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m6648getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m6649getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m6650getHasAdditionOrRemovalimpl(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m6651getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m6652getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m6653getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6654hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m6655isAdditionimpl(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6656toStringimpl(int[] iArr) {
        StringBuilder sb = new StringBuilder("Snake(");
        sb.append(iArr[0]);
        sb.append(',');
        sb.append(iArr[1]);
        sb.append(',');
        sb.append(iArr[2]);
        sb.append(',');
        sb.append(iArr[3]);
        sb.append(',');
        return uf.e(sb, iArr[4] != 0, ')');
    }

    public boolean equals(Object obj) {
        return m6645equalsimpl(this.data, obj);
    }

    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m6654hashCodeimpl(this.data);
    }

    public String toString() {
        return m6656toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m6657unboximpl() {
        return this.data;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m6644constructorimpl(int[] iArr) {
        return iArr;
    }
}
