package androidx.compose.foundation.layout;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class PaddingValuesConsumingModifierNode extends InsetsConsumingModifierNode {
    private PaddingValues paddingValues;

    public PaddingValuesConsumingModifierNode(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        return WindowInsetsKt.add(windowInsets, WindowInsetsKt.asInsets(this.paddingValues));
    }

    public final void update(PaddingValues paddingValues) {
        if (q10.b(paddingValues, this.paddingValues)) {
            return;
        }
        this.paddingValues = paddingValues;
        insetsInvalidated();
    }
}
