package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class OverscrollConfiguration {
    public static final int $stable = 0;
    private final PaddingValues drawPadding;
    private final long glowColor;

    public /* synthetic */ OverscrollConfiguration(long j, PaddingValues paddingValues, int i, dq dqVar) {
        this((i & 1) != 0 ? ColorKt.Color(4284900966L) : j, (i & 2) != 0 ? PaddingKt.m757PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!OverscrollConfiguration.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        return Color.m4762equalsimpl0(this.glowColor, overscrollConfiguration.glowColor) && q10.b(this.drawPadding, overscrollConfiguration.drawPadding);
    }

    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    /* renamed from: getGlowColor-0d7_KjU, reason: not valid java name */
    public final long m314getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    public int hashCode() {
        return this.drawPadding.hashCode() + (Color.m4768hashCodeimpl(this.glowColor) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        kp0.i(this.glowColor, sb, ", drawPadding=");
        sb.append(this.drawPadding);
        sb.append(')');
        return sb.toString();
    }

    private OverscrollConfiguration(long j, PaddingValues paddingValues) {
        this.glowColor = j;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverscrollConfiguration(long j, PaddingValues paddingValues, dq dqVar) {
        this(j, paddingValues);
    }
}
