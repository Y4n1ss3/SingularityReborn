package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FixedIntInsets implements WindowInsets {
    private final int bottomVal;
    private final int leftVal;
    private final int rightVal;
    private final int topVal;

    public FixedIntInsets(int i, int i2, int i3, int i4) {
        this.leftVal = i;
        this.topVal = i2;
        this.rightVal = i3;
        this.bottomVal = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedIntInsets)) {
            return false;
        }
        FixedIntInsets fixedIntInsets = (FixedIntInsets) obj;
        return this.leftVal == fixedIntInsets.leftVal && this.topVal == fixedIntInsets.topVal && this.rightVal == fixedIntInsets.rightVal && this.bottomVal == fixedIntInsets.bottomVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return this.bottomVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return this.leftVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return this.rightVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return this.topVal;
    }

    public int hashCode() {
        return (((((this.leftVal * 31) + this.topVal) * 31) + this.rightVal) * 31) + this.bottomVal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.leftVal);
        sb.append(", top=");
        sb.append(this.topVal);
        sb.append(", right=");
        sb.append(this.rightVal);
        sb.append(", bottom=");
        return fc.e(sb, this.bottomVal, ')');
    }
}
