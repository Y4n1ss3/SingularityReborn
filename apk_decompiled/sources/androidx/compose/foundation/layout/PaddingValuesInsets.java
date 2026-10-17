package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return q10.b(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo361roundToPx0680j_4(this.paddingValues.mo711calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo361roundToPx0680j_4(this.paddingValues.mo712calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo361roundToPx0680j_4(this.paddingValues.mo713calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo361roundToPx0680j_4(this.paddingValues.mo714calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) Dp.m7622toStringimpl(this.paddingValues.mo712calculateLeftPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m7622toStringimpl(this.paddingValues.mo714calculateTopPaddingD9Ej5fM())) + ", " + ((Object) Dp.m7622toStringimpl(this.paddingValues.mo713calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m7622toStringimpl(this.paddingValues.mo711calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
