package androidx.compose.foundation.layout;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ConsumedInsetsModifierNode extends InsetsConsumingModifierNode {
    private ky block;

    public ConsumedInsetsModifierNode(ky kyVar) {
        this.block = kyVar;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        this.block.invoke(windowInsets);
        return windowInsets;
    }

    public final void update(ky kyVar) {
        if (kyVar != this.block) {
            this.block = kyVar;
        }
    }
}
