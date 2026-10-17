package androidx.compose.ui.unit;

import defpackage.dq;
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DpRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    private DpRect(long j, long j2) {
        this(DpOffset.m7672getXD9Ej5fM(j), DpOffset.m7674getYD9Ej5fM(j), Dp.m7611constructorimpl(DpSize.m7709getWidthD9Ej5fM(j2) + DpOffset.m7672getXD9Ej5fM(j)), Dp.m7611constructorimpl(DpSize.m7707getHeightD9Ej5fM(j2) + DpOffset.m7674getYD9Ej5fM(j)), null);
    }

    /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m7683copya9UjIt4$default(DpRect dpRect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpRect.left;
        }
        if ((i & 2) != 0) {
            f2 = dpRect.top;
        }
        if ((i & 4) != 0) {
            f3 = dpRect.right;
        }
        if ((i & 8) != 0) {
            f4 = dpRect.bottom;
        }
        return dpRect.m7692copya9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m7688component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m7689component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m7690component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m7691component4D9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m7692copya9UjIt4(float f, float f2, float f3, float f4) {
        return new DpRect(f, f2, f3, f4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        return Dp.m7616equalsimpl0(this.left, dpRect.left) && Dp.m7616equalsimpl0(this.top, dpRect.top) && Dp.m7616equalsimpl0(this.right, dpRect.right) && Dp.m7616equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m7693getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m7694getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m7695getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m7696getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.bottom) + j50.a(this.right, j50.a(this.top, Dp.m7617hashCodeimpl(this.left) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DpRect(left=");
        fc.i(this.left, sb, ", top=");
        fc.i(this.top, sb, ", right=");
        fc.i(this.right, sb, ", bottom=");
        sb.append((Object) Dp.m7622toStringimpl(this.bottom));
        sb.append(')');
        return sb.toString();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7684getBottomD9Ej5fM$annotations() {
    }

    /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7685getLeftD9Ej5fM$annotations() {
    }

    /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7686getRightD9Ej5fM$annotations() {
    }

    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m7687getTopD9Ej5fM$annotations() {
    }

    public /* synthetic */ DpRect(long j, long j2, dq dqVar) {
        this(j, j2);
    }

    private DpRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public /* synthetic */ DpRect(float f, float f2, float f3, float f4, dq dqVar) {
        this(f, f2, f3, f4);
    }
}
