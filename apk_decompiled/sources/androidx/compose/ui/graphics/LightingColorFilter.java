package androidx.compose.ui.graphics;

import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LightingColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private final long add;
    private final long multiply;

    private LightingColorFilter(long j, long j2) {
        this(j, j2, AndroidColorFilter_androidKt.m4622actualLightingColorFilterOWjLjI(j, j2), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        return Color.m4762equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m4762equalsimpl0(this.add, lightingColorFilter.add);
    }

    /* renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m4998getAdd0d7_KjU() {
        return this.add;
    }

    /* renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m4999getMultiply0d7_KjU() {
        return this.multiply;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.add) + (Color.m4768hashCodeimpl(this.multiply) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LightingColorFilter(multiply=");
        kp0.i(this.multiply, sb, ", add=");
        sb.append((Object) Color.m4769toStringimpl(this.add));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ LightingColorFilter(long j, long j2, android.graphics.ColorFilter colorFilter, dq dqVar) {
        this(j, j2, colorFilter);
    }

    private LightingColorFilter(long j, long j2, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j;
        this.add = j2;
    }

    public /* synthetic */ LightingColorFilter(long j, long j2, dq dqVar) {
        this(j, j2);
    }
}
