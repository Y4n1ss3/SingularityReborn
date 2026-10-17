package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    private DpCornerSize(float f) {
        this.size = f;
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m1052component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m1053copy0680j_4$default(DpCornerSize dpCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpCornerSize.size;
        }
        return dpCornerSize.m1054copy0680j_4(f);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m1054copy0680j_4(float f) {
        return new DpCornerSize(f, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m7616equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return Dp.m7609boximpl(m1055getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m1055getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo1047toPxTmRCtEA(long j, Density density) {
        return density.mo367toPx0680j_4(this.size);
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    public /* synthetic */ DpCornerSize(float f, dq dqVar) {
        this(f);
    }
}
