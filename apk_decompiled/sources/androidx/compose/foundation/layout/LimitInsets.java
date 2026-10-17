package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    private LimitInsets(WindowInsets windowInsets, int i) {
        this.insets = windowInsets;
        this.sides = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        return q10.b(this.insets, limitInsets.insets) && WindowInsetsSides.m842equalsimpl0(this.sides, limitInsets.sides);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        if (WindowInsetsSides.m843hasAnybkgdKaI$foundation_layout(this.sides, WindowInsetsSides.Companion.m853getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.m843hasAnybkgdKaI$foundation_layout(this.sides, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.Companion.m849getAllowLeftInLtrJoeWqyM$foundation_layout() : WindowInsetsSides.Companion.m850getAllowLeftInRtlJoeWqyM$foundation_layout())) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.m843hasAnybkgdKaI$foundation_layout(this.sides, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.Companion.m851getAllowRightInLtrJoeWqyM$foundation_layout() : WindowInsetsSides.Companion.m852getAllowRightInRtlJoeWqyM$foundation_layout())) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m716getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        if (WindowInsetsSides.m843hasAnybkgdKaI$foundation_layout(this.sides, WindowInsetsSides.Companion.m859getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return WindowInsetsSides.m844hashCodeimpl(this.sides) + (this.insets.hashCode() * 31);
    }

    public String toString() {
        return "(" + this.insets + " only " + ((Object) WindowInsetsSides.m846toStringimpl(this.sides)) + ')';
    }

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i, dq dqVar) {
        this(windowInsets, i);
    }
}
