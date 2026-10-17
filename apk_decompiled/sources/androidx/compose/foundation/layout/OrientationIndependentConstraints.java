package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m728boximpl(long j) {
        return new OrientationIndependentConstraints(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m731constructorimpl(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m729constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m7566getMinWidthimpl(j) : Constraints.m7565getMinHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7564getMaxWidthimpl(j) : Constraints.m7563getMaxHeightimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7565getMinHeightimpl(j) : Constraints.m7566getMinWidthimpl(j), layoutOrientation == layoutOrientation2 ? Constraints.m7563getMaxHeightimpl(j) : Constraints.m7564getMaxWidthimpl(j));
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m732copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m729constructorimpl(i, i2, i3, i4);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m733copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = Constraints.m7566getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = Constraints.m7564getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = Constraints.m7565getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = Constraints.m7563getMaxHeightimpl(j);
        }
        return m732copyyUG9Ft0(j, i6, i7, i8, i4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m734equalsimpl(long j, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m7557equalsimpl0(j, ((OrientationIndependentConstraints) obj).m746unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m735equalsimpl0(long j, long j2) {
        return Constraints.m7557equalsimpl0(j, j2);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m736getCrossAxisMaximpl(long j) {
        return Constraints.m7563getMaxHeightimpl(j);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m737getCrossAxisMinimpl(long j) {
        return Constraints.m7565getMinHeightimpl(j);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m738getMainAxisMaximpl(long j) {
        return Constraints.m7564getMaxWidthimpl(j);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m739getMainAxisMinimpl(long j) {
        return Constraints.m7566getMinWidthimpl(j);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m740hashCodeimpl(long j) {
        return Constraints.m7567hashCodeimpl(j);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m741maxHeightimpl(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m7563getMaxHeightimpl(j) : Constraints.m7564getMaxWidthimpl(j);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m742maxWidthimpl(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m7564getMaxWidthimpl(j) : Constraints.m7563getMaxHeightimpl(j);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m743stretchCrossAxisq4ezo7Y(long j) {
        return m729constructorimpl(Constraints.m7566getMinWidthimpl(j), Constraints.m7564getMaxWidthimpl(j), Constraints.m7563getMaxHeightimpl(j) != Integer.MAX_VALUE ? Constraints.m7563getMaxHeightimpl(j) : Constraints.m7565getMinHeightimpl(j), Constraints.m7563getMaxHeightimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m744toBoxConstraintsOenEA2s(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m7566getMinWidthimpl(j), Constraints.m7564getMaxWidthimpl(j), Constraints.m7565getMinHeightimpl(j), Constraints.m7563getMaxHeightimpl(j)) : ConstraintsKt.Constraints(Constraints.m7565getMinHeightimpl(j), Constraints.m7563getMaxHeightimpl(j), Constraints.m7566getMinWidthimpl(j), Constraints.m7564getMaxWidthimpl(j));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m745toStringimpl(long j) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m7569toStringimpl(j)) + ')';
    }

    public boolean equals(Object obj) {
        return m734equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m740hashCodeimpl(this.value);
    }

    public String toString() {
        return m745toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m746unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m729constructorimpl(int i, int i2, int i3, int i4) {
        return m730constructorimpl(ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m730constructorimpl(long j) {
        return j;
    }
}
