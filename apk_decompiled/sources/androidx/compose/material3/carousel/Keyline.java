package androidx.compose.material3.carousel;

import defpackage.bv;
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Keyline {
    public static final int $stable = 0;
    private final float cutoff;
    private final boolean isAnchor;
    private final boolean isFocal;
    private final boolean isPivot;
    private final float offset;
    private final float size;
    private final float unadjustedOffset;

    public Keyline(float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4) {
        this.size = f;
        this.offset = f2;
        this.unadjustedOffset = f3;
        this.isFocal = z;
        this.isAnchor = z2;
        this.isPivot = z3;
        this.cutoff = f4;
    }

    public static /* synthetic */ Keyline copy$default(Keyline keyline, float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = keyline.size;
        }
        if ((i & 2) != 0) {
            f2 = keyline.offset;
        }
        if ((i & 4) != 0) {
            f3 = keyline.unadjustedOffset;
        }
        if ((i & 8) != 0) {
            z = keyline.isFocal;
        }
        if ((i & 16) != 0) {
            z2 = keyline.isAnchor;
        }
        if ((i & 32) != 0) {
            z3 = keyline.isPivot;
        }
        if ((i & 64) != 0) {
            f4 = keyline.cutoff;
        }
        boolean z4 = z3;
        float f5 = f4;
        boolean z5 = z2;
        float f6 = f3;
        return keyline.copy(f, f2, f6, z, z5, z4, f5);
    }

    public final float component1() {
        return this.size;
    }

    public final float component2() {
        return this.offset;
    }

    public final float component3() {
        return this.unadjustedOffset;
    }

    public final boolean component4() {
        return this.isFocal;
    }

    public final boolean component5() {
        return this.isAnchor;
    }

    public final boolean component6() {
        return this.isPivot;
    }

    public final float component7() {
        return this.cutoff;
    }

    public final Keyline copy(float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4) {
        return new Keyline(f, f2, f3, z, z2, z3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) obj;
        return Float.compare(this.size, keyline.size) == 0 && Float.compare(this.offset, keyline.offset) == 0 && Float.compare(this.unadjustedOffset, keyline.unadjustedOffset) == 0 && this.isFocal == keyline.isFocal && this.isAnchor == keyline.isAnchor && this.isPivot == keyline.isPivot && Float.compare(this.cutoff, keyline.cutoff) == 0;
    }

    public final float getCutoff() {
        return this.cutoff;
    }

    public final float getOffset() {
        return this.offset;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    public int hashCode() {
        return Float.hashCode(this.cutoff) + kp0.c(kp0.c(kp0.c(bv.a(this.unadjustedOffset, bv.a(this.offset, Float.hashCode(this.size) * 31, 31), 31), 31, this.isFocal), 31, this.isAnchor), 31, this.isPivot);
    }

    public final boolean isAnchor() {
        return this.isAnchor;
    }

    public final boolean isFocal() {
        return this.isFocal;
    }

    public final boolean isPivot() {
        return this.isPivot;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyline(size=");
        sb.append(this.size);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", unadjustedOffset=");
        sb.append(this.unadjustedOffset);
        sb.append(", isFocal=");
        sb.append(this.isFocal);
        sb.append(", isAnchor=");
        sb.append(this.isAnchor);
        sb.append(", isPivot=");
        sb.append(this.isPivot);
        sb.append(", cutoff=");
        return k4.g(sb, this.cutoff, ')');
    }
}
