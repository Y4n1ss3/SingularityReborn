package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;
    private final RippleAlpha rippleAlpha;

    public /* synthetic */ RippleConfiguration(long j, RippleAlpha rippleAlpha, int i, dq dqVar) {
        this((i & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j, (i & 2) != 0 ? null : rippleAlpha, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.m4762equalsimpl0(this.color, rippleConfiguration.color) && q10.b(this.rippleAlpha, rippleConfiguration.rippleAlpha);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m2295getColor0d7_KjU() {
        return this.color;
    }

    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public int hashCode() {
        int m4768hashCodeimpl = Color.m4768hashCodeimpl(this.color) * 31;
        RippleAlpha rippleAlpha = this.rippleAlpha;
        return m4768hashCodeimpl + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        kp0.i(this.color, sb, ", rippleAlpha=");
        sb.append(this.rippleAlpha);
        sb.append(')');
        return sb.toString();
    }

    private RippleConfiguration(long j, RippleAlpha rippleAlpha) {
        this.color = j;
        this.rippleAlpha = rippleAlpha;
    }

    public /* synthetic */ RippleConfiguration(long j, RippleAlpha rippleAlpha, dq dqVar) {
        this(j, rippleAlpha);
    }
}
