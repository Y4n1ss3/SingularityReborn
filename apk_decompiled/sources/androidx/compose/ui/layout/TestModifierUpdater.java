package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class TestModifierUpdater {
    public static final int $stable = 8;
    private final LayoutNode node;

    public TestModifierUpdater(LayoutNode layoutNode) {
        this.node = layoutNode;
    }

    public final void updateModifier(Modifier modifier) {
        this.node.setModifier(modifier);
    }
}
