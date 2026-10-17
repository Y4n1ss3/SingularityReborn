package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PercentCornerSize implements CornerSize, InspectableValue {
    private final float percent;

    public PercentCornerSize(float f) {
        this.percent = f;
        if (f < 0.0f || f > 100.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    private final float component1() {
        return this.percent;
    }

    public static /* synthetic */ PercentCornerSize copy$default(PercentCornerSize percentCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = percentCornerSize.percent;
        }
        return percentCornerSize.copy(f);
    }

    public final PercentCornerSize copy(float f) {
        return new PercentCornerSize(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.percent, ((PercentCornerSize) obj).percent) == 0;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getValueOverride() {
        return k4.g(new StringBuilder(), this.percent, '%');
    }

    public int hashCode() {
        return Float.hashCode(this.percent);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo1047toPxTmRCtEA(long j, Density density) {
        return (this.percent / 100.0f) * Size.m4584getMinDimensionimpl(j);
    }

    public String toString() {
        return "CornerSize(size = " + this.percent + "%)";
    }
}
