package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    private PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo711calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo712calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo713calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo714calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.m7616equalsimpl0(this.start, paddingValuesImpl.start) && Dp.m7616equalsimpl0(this.top, paddingValuesImpl.top) && Dp.m7616equalsimpl0(this.end, paddingValuesImpl.end) && Dp.m7616equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m783getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m784getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m785getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m786getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.bottom) + j50.a(this.end, j50.a(this.top, Dp.m7617hashCodeimpl(this.start) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        fc.i(this.start, sb, ", top=");
        fc.i(this.top, sb, ", end=");
        fc.i(this.end, sb, ", bottom=");
        sb.append((Object) Dp.m7622toStringimpl(this.bottom));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m779getBottomD9Ej5fM$annotations() {
    }

    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m780getEndD9Ej5fM$annotations() {
    }

    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m781getStartD9Ej5fM$annotations() {
    }

    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m782getTopD9Ej5fM$annotations() {
    }

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, dq dqVar) {
        this(f, f2, f3, f4);
    }

    public /* synthetic */ PaddingValuesImpl(float f, float f2, float f3, float f4, int i, dq dqVar) {
        this((i & 1) != 0 ? Dp.m7611constructorimpl(0.0f) : f, (i & 2) != 0 ? Dp.m7611constructorimpl(0.0f) : f2, (i & 4) != 0 ? Dp.m7611constructorimpl(0.0f) : f3, (i & 8) != 0 ? Dp.m7611constructorimpl(0.0f) : f4, null);
    }
}
