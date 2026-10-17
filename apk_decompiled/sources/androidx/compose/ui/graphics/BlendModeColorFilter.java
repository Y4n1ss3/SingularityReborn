package androidx.compose.ui.graphics;

import defpackage.dq;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private final int blendMode;
    private final long color;

    private BlendModeColorFilter(long j, int i) {
        this(j, i, AndroidColorFilter_androidKt.m4623actualTintColorFilterxETnrds(j, i), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.m4762equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m4670equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4703getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4704getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return BlendMode.m4671hashCodeimpl(this.blendMode) + (Color.m4768hashCodeimpl(this.color) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        kp0.i(this.color, sb, ", blendMode=");
        sb.append((Object) BlendMode.m4672toStringimpl(this.blendMode));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter, dq dqVar) {
        this(j, i, colorFilter);
    }

    private BlendModeColorFilter(long j, int i, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j;
        this.blendMode = i;
    }

    public /* synthetic */ BlendModeColorFilter(long j, int i, dq dqVar) {
        this(j, i);
    }
}
