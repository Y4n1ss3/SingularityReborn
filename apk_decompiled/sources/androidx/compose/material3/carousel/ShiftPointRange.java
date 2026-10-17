package androidx.compose.material3.carousel;

import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ShiftPointRange {
    private final int fromStepIndex;
    private final float steppedInterpolation;
    private final int toStepIndex;

    public ShiftPointRange(int i, int i2, float f) {
        this.fromStepIndex = i;
        this.toStepIndex = i2;
        this.steppedInterpolation = f;
    }

    public static /* synthetic */ ShiftPointRange copy$default(ShiftPointRange shiftPointRange, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = shiftPointRange.fromStepIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = shiftPointRange.toStepIndex;
        }
        if ((i3 & 4) != 0) {
            f = shiftPointRange.steppedInterpolation;
        }
        return shiftPointRange.copy(i, i2, f);
    }

    public final int component1() {
        return this.fromStepIndex;
    }

    public final int component2() {
        return this.toStepIndex;
    }

    public final float component3() {
        return this.steppedInterpolation;
    }

    public final ShiftPointRange copy(int i, int i2, float f) {
        return new ShiftPointRange(i, i2, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftPointRange)) {
            return false;
        }
        ShiftPointRange shiftPointRange = (ShiftPointRange) obj;
        return this.fromStepIndex == shiftPointRange.fromStepIndex && this.toStepIndex == shiftPointRange.toStepIndex && Float.compare(this.steppedInterpolation, shiftPointRange.steppedInterpolation) == 0;
    }

    public final int getFromStepIndex() {
        return this.fromStepIndex;
    }

    public final float getSteppedInterpolation() {
        return this.steppedInterpolation;
    }

    public final int getToStepIndex() {
        return this.toStepIndex;
    }

    public int hashCode() {
        return Float.hashCode(this.steppedInterpolation) + j50.b(this.toStepIndex, Integer.hashCode(this.fromStepIndex) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShiftPointRange(fromStepIndex=");
        sb.append(this.fromStepIndex);
        sb.append(", toStepIndex=");
        sb.append(this.toStepIndex);
        sb.append(", steppedInterpolation=");
        return k4.g(sb, this.steppedInterpolation, ')');
    }
}
