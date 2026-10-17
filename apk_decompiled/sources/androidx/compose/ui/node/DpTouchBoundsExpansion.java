package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DpTouchBoundsExpansion {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float end;
    private final boolean isLayoutDirectionAware;
    private final float start;
    private final float top;

    private DpTouchBoundsExpansion(float f, float f2, float f3, float f4, boolean z) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.isLayoutDirectionAware = z;
        if (!(f >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Left must be non-negative");
        }
        if (!(f2 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be non-negative");
        }
        if (!(f3 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be non-negative");
    }

    /* renamed from: copy-lDy3nrA$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m6442copylDy3nrA$default(DpTouchBoundsExpansion dpTouchBoundsExpansion, float f, float f2, float f3, float f4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpTouchBoundsExpansion.start;
        }
        if ((i & 2) != 0) {
            f2 = dpTouchBoundsExpansion.top;
        }
        if ((i & 4) != 0) {
            f3 = dpTouchBoundsExpansion.end;
        }
        if ((i & 8) != 0) {
            f4 = dpTouchBoundsExpansion.bottom;
        }
        if ((i & 16) != 0) {
            z = dpTouchBoundsExpansion.isLayoutDirectionAware;
        }
        boolean z2 = z;
        float f5 = f3;
        return dpTouchBoundsExpansion.m6447copylDy3nrA(f, f2, f5, f4, z2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m6443component1D9Ej5fM() {
        return this.start;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m6444component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m6445component3D9Ej5fM() {
        return this.end;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m6446component4D9Ej5fM() {
        return this.bottom;
    }

    public final boolean component5() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: copy-lDy3nrA, reason: not valid java name */
    public final DpTouchBoundsExpansion m6447copylDy3nrA(float f, float f2, float f3, float f4, boolean z) {
        return new DpTouchBoundsExpansion(f, f2, f3, f4, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return Dp.m7616equalsimpl0(this.start, dpTouchBoundsExpansion.start) && Dp.m7616equalsimpl0(this.top, dpTouchBoundsExpansion.top) && Dp.m7616equalsimpl0(this.end, dpTouchBoundsExpansion.end) && Dp.m7616equalsimpl0(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m6448getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m6449getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m6450getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m6451getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLayoutDirectionAware) + j50.a(this.bottom, j50.a(this.end, j50.a(this.top, Dp.m7617hashCodeimpl(this.start) * 31, 31), 31), 31);
    }

    public final boolean isLayoutDirectionAware() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m6452roundToTouchBoundsExpansionTW6G1oQ(Density density) {
        return TouchBoundsExpansion.m6661constructorimpl(TouchBoundsExpansion.Companion.pack$ui(density.mo361roundToPx0680j_4(this.start), density.mo361roundToPx0680j_4(this.top), density.mo361roundToPx0680j_4(this.end), density.mo361roundToPx0680j_4(this.bottom), this.isLayoutDirectionAware));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DpTouchBoundsExpansion(start=");
        fc.i(this.start, sb, ", top=");
        fc.i(this.top, sb, ", end=");
        fc.i(this.end, sb, ", bottom=");
        fc.i(this.bottom, sb, ", isLayoutDirectionAware=");
        return uf.e(sb, this.isLayoutDirectionAware, ')');
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: Absolute-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ DpTouchBoundsExpansion m6453Absolutea9UjIt4$default(Companion companion, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = Dp.m7611constructorimpl(0.0f);
            }
            if ((i & 2) != 0) {
                f2 = Dp.m7611constructorimpl(0.0f);
            }
            if ((i & 4) != 0) {
                f3 = Dp.m7611constructorimpl(0.0f);
            }
            if ((i & 8) != 0) {
                f4 = Dp.m7611constructorimpl(0.0f);
            }
            return companion.m6454Absolutea9UjIt4(f, f2, f3, f4);
        }

        /* renamed from: Absolute-a9UjIt4, reason: not valid java name */
        public final DpTouchBoundsExpansion m6454Absolutea9UjIt4(float f, float f2, float f3, float f4) {
            return new DpTouchBoundsExpansion(f, f2, f3, f4, false, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DpTouchBoundsExpansion(float f, float f2, float f3, float f4, boolean z, dq dqVar) {
        this(f, f2, f3, f4, z);
    }
}
