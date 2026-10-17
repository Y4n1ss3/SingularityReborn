package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends f30 implements ky {
    final /* synthetic */ FocusTargetNode $activeNodeBeforeSearch;
    final /* synthetic */ int $direction;
    final /* synthetic */ Rect $focusedItem;
    final /* synthetic */ ky $onFound;
    final /* synthetic */ FocusTargetNode $this_generateAndSearchChildren;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, Rect rect, int i, ky kyVar) {
        super(1);
        this.$activeNodeBeforeSearch = focusTargetNode;
        this.$this_generateAndSearchChildren = focusTargetNode2;
        this.$focusedItem = rect;
        this.$direction = i;
        this.$onFound = kyVar;
    }

    @Override // defpackage.ky
    public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
        boolean m4465searchChildren4C6V_qg;
        if (this.$activeNodeBeforeSearch != DelegatableNodeKt.requireOwner(this.$this_generateAndSearchChildren).getFocusOwner().getActiveFocusTargetNode()) {
            return Boolean.TRUE;
        }
        m4465searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m4465searchChildren4C6V_qg(this.$this_generateAndSearchChildren, this.$focusedItem, this.$direction, this.$onFound);
        Boolean valueOf = Boolean.valueOf(m4465searchChildren4C6V_qg);
        if (m4465searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
            return valueOf;
        }
        return null;
    }
}
