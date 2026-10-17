package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class InsetsPaddingValues implements PaddingValues {
    private final Density density;
    private final WindowInsets insets;

    public InsetsPaddingValues(WindowInsets windowInsets, Density density) {
        this.insets = windowInsets;
        this.density = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public float mo711calculateBottomPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo364toDpu2uoSUM(this.insets.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public float mo712calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo364toDpu2uoSUM(this.insets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public float mo713calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo364toDpu2uoSUM(this.insets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public float mo714calculateTopPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo364toDpu2uoSUM(this.insets.getTop(density));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        return q10.b(this.insets, insetsPaddingValues.insets) && q10.b(this.density, insetsPaddingValues.density);
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    public int hashCode() {
        return this.density.hashCode() + (this.insets.hashCode() * 31);
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
