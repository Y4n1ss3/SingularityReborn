package androidx.compose.ui.input.pointer;

import defpackage.f30;
import defpackage.ji0;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HoverIconModifierNode$findOverridingAncestorNode$1 extends f30 implements ky {
    final /* synthetic */ ji0 $hoverIconModifierNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverIconModifierNode$findOverridingAncestorNode$1(ji0 ji0Var) {
        super(1);
        this.$hoverIconModifierNode = ji0Var;
    }

    @Override // defpackage.ky
    public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
        boolean z;
        if (hoverIconModifierNode.getOverrideDescendants()) {
            z = hoverIconModifierNode.cursorInBoundsOfNode;
            if (z) {
                this.$hoverIconModifierNode.d = hoverIconModifierNode;
            }
        }
        return Boolean.TRUE;
    }
}
