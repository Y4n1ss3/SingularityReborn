package androidx.compose.foundation.layout;

import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowLayoutData {
    public static final int $stable = 8;
    private float fillCrossAxisFraction;

    public FlowLayoutData(float f) {
        this.fillCrossAxisFraction = f;
    }

    public static /* synthetic */ FlowLayoutData copy$default(FlowLayoutData flowLayoutData, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = flowLayoutData.fillCrossAxisFraction;
        }
        return flowLayoutData.copy(f);
    }

    public final float component1() {
        return this.fillCrossAxisFraction;
    }

    public final FlowLayoutData copy(float f) {
        return new FlowLayoutData(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowLayoutData) && Float.compare(this.fillCrossAxisFraction, ((FlowLayoutData) obj).fillCrossAxisFraction) == 0;
    }

    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public int hashCode() {
        return Float.hashCode(this.fillCrossAxisFraction);
    }

    public final void setFillCrossAxisFraction(float f) {
        this.fillCrossAxisFraction = f;
    }

    public String toString() {
        return k4.g(new StringBuilder("FlowLayoutData(fillCrossAxisFraction="), this.fillCrossAxisFraction, ')');
    }
}
