package androidx.compose.ui.layout;

import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FixedScale implements ContentScale {
    public static final int $stable = 0;
    private final float value;

    public FixedScale(float f) {
        this.value = f;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fixedScale.value;
        }
        return fixedScale.copy(f);
    }

    public final float component1() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo6227computeScaleFactorH7hwNQA(long j, long j2) {
        float f = this.value;
        return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final FixedScale copy(float f) {
        return new FixedScale(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public String toString() {
        return k4.g(new StringBuilder("FixedScale(value="), this.value, ')');
    }
}
