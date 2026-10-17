package androidx.compose.foundation.layout;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class UnionInsetsConsumingModifierNode extends InsetsConsumingModifierNode {
    private WindowInsets insets;

    public UnionInsetsConsumingModifierNode(WindowInsets windowInsets) {
        this.insets = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return WindowInsetsKt.union(windowInsets, this.insets);
    }

    public final void update(WindowInsets windowInsets) {
        if (q10.b(windowInsets, this.insets)) {
            return;
        }
        this.insets = windowInsets;
        insetsInvalidated();
    }
}
