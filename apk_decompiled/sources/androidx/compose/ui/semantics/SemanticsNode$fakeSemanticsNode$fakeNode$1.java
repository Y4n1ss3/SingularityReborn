package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {
    final /* synthetic */ ky $properties;

    public SemanticsNode$fakeSemanticsNode$fakeNode$1(ky kyVar) {
        this.$properties = kyVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.$properties.invoke(semanticsPropertyReceiver);
    }
}
