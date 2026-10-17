package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    private FixedDpInsets(float f, float f2, float f3, float f4) {
        this.leftDp = f;
        this.topDp = f2;
        this.rightDp = f3;
        this.bottomDp = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        return Dp.m7616equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && Dp.m7616equalsimpl0(this.topDp, fixedDpInsets.topDp) && Dp.m7616equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && Dp.m7616equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo361roundToPx0680j_4(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo361roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo361roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo361roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.bottomDp) + j50.a(this.rightDp, j50.a(this.topDp, Dp.m7617hashCodeimpl(this.leftDp) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        fc.i(this.leftDp, sb, ", top=");
        fc.i(this.topDp, sb, ", right=");
        fc.i(this.rightDp, sb, ", bottom=");
        sb.append((Object) Dp.m7622toStringimpl(this.bottomDp));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ FixedDpInsets(float f, float f2, float f3, float f4, dq dqVar) {
        this(f, f2, f3, f4);
    }
}
