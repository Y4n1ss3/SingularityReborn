package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PxCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public PxCornerSize(float f) {
        this.size = f;
    }

    private final float component1() {
        return this.size;
    }

    public static /* synthetic */ PxCornerSize copy$default(PxCornerSize pxCornerSize, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = pxCornerSize.size;
        }
        return pxCornerSize.copy(f);
    }

    public final PxCornerSize copy(float f) {
        return new PxCornerSize(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PxCornerSize) && Float.compare(this.size, ((PxCornerSize) obj).size) == 0;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public String getValueOverride() {
        return this.size + "px";
    }

    public int hashCode() {
        return Float.hashCode(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo1047toPxTmRCtEA(long j, Density density) {
        return this.size;
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".px)";
    }
}
