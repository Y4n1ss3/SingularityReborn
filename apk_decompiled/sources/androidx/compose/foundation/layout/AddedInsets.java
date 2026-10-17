package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AddedInsets implements WindowInsets {
    private final WindowInsets first;
    private final WindowInsets second;

    public AddedInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.first = windowInsets;
        this.second = windowInsets2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedInsets)) {
            return false;
        }
        AddedInsets addedInsets = (AddedInsets) obj;
        return q10.b(addedInsets.first, this.first) && q10.b(addedInsets.second, this.second);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return this.second.getBottom(density) + this.first.getBottom(density);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return this.second.getLeft(density, layoutDirection) + this.first.getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return this.second.getRight(density, layoutDirection) + this.first.getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return this.second.getTop(density) + this.first.getTop(density);
    }

    public int hashCode() {
        return (this.second.hashCode() * 31) + this.first.hashCode();
    }

    public String toString() {
        return "(" + this.first + " + " + this.second + ')';
    }
}
