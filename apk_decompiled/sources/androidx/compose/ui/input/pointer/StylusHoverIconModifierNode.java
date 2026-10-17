package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class StylusHoverIconModifierNode extends HoverIconModifierNode {
    public static final int $stable = 8;
    private final String traverseKey;

    public /* synthetic */ StylusHoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, dq dqVar) {
        this(pointerIcon, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public void displayIcon(PointerIcon pointerIcon) {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setStylusHoverIcon(pointerIcon);
        }
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public boolean mo6005isRelevantPointerTypeuerMTgs(int i) {
        PointerType.Companion companion = PointerType.Companion;
        return PointerType.m6174equalsimpl0(i, companion.m6180getStylusT8wyACA()) || PointerType.m6174equalsimpl0(i, companion.m6178getEraserT8wyACA());
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }

    public StylusHoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        super(pointerIcon, z, dpTouchBoundsExpansion);
        this.traverseKey = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
