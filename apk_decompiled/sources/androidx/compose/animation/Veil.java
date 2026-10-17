package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Veil {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Color> animationSpec;
    private final long initialColor;
    private final boolean matchParentSize;
    private final long targetColor;

    private Veil(long j, long j2, FiniteAnimationSpec<Color> finiteAnimationSpec, boolean z) {
        this.initialColor = j;
        this.targetColor = j2;
        this.animationSpec = finiteAnimationSpec;
        this.matchParentSize = z;
    }

    /* renamed from: copy-RFnl5yQ$default, reason: not valid java name */
    public static /* synthetic */ Veil m120copyRFnl5yQ$default(Veil veil, long j, long j2, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = veil.initialColor;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = veil.targetColor;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            finiteAnimationSpec = veil.animationSpec;
        }
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        if ((i & 8) != 0) {
            z = veil.matchParentSize;
        }
        return veil.m123copyRFnl5yQ(j3, j4, finiteAnimationSpec2, z);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m121component10d7_KjU() {
        return this.initialColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m122component20d7_KjU() {
        return this.targetColor;
    }

    public final FiniteAnimationSpec<Color> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.matchParentSize;
    }

    /* renamed from: copy-RFnl5yQ, reason: not valid java name */
    public final Veil m123copyRFnl5yQ(long j, long j2, FiniteAnimationSpec<Color> finiteAnimationSpec, boolean z) {
        return new Veil(j, j2, finiteAnimationSpec, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Veil)) {
            return false;
        }
        Veil veil = (Veil) obj;
        return Color.m4762equalsimpl0(this.initialColor, veil.initialColor) && Color.m4762equalsimpl0(this.targetColor, veil.targetColor) && q10.b(this.animationSpec, veil.animationSpec) && this.matchParentSize == veil.matchParentSize;
    }

    public final FiniteAnimationSpec<Color> getAnimationSpec() {
        return this.animationSpec;
    }

    /* renamed from: getInitialColor-0d7_KjU, reason: not valid java name */
    public final long m124getInitialColor0d7_KjU() {
        return this.initialColor;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    /* renamed from: getTargetColor-0d7_KjU, reason: not valid java name */
    public final long m125getTargetColor0d7_KjU() {
        return this.targetColor;
    }

    public int hashCode() {
        return Boolean.hashCode(this.matchParentSize) + ((this.animationSpec.hashCode() + kp0.d(this.targetColor, Color.m4768hashCodeimpl(this.initialColor) * 31, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Veil(initialColor=");
        kp0.i(this.initialColor, sb, ", targetColor=");
        kp0.i(this.targetColor, sb, ", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(", matchParentSize=");
        return uf.e(sb, this.matchParentSize, ')');
    }

    public /* synthetic */ Veil(long j, long j2, FiniteAnimationSpec finiteAnimationSpec, boolean z, dq dqVar) {
        this(j, j2, finiteAnimationSpec, z);
    }
}
