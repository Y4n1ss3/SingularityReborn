package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SharedTransitionScopeRootModifierNode extends Modifier.Node implements LayoutModifierNode, ObserverModifierNode, DrawModifierNode {
    private SharedTransitionScopeImpl sharedScope;

    public SharedTransitionScopeRootModifierNode(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedScope = sharedTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.sharedScope.drawInOverlay$animation(contentDrawScope);
    }

    public final SharedTransitionScopeImpl getSharedScope() {
        return this.sharedScope;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new SharedTransitionScopeRootModifierNode$measure$1(measureScope, this, mo6234measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        ObserverModifierNodeKt.observeReads(this, this.sharedScope.getObserveAnimatingBlock$animation());
        this.sharedScope.setInvalidateOverlay(new SharedTransitionScopeRootModifierNode$onAttach$1(this));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.sharedScope.setInvalidateOverlay(null);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.sharedScope.updateTransitionActiveness$animation();
        ObserverModifierNodeKt.observeReads(this, this.sharedScope.getObserveAnimatingBlock$animation());
    }

    public final void setSharedScope(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        if (!q10.b(sharedTransitionScopeImpl, this.sharedScope)) {
            ObserverModifierNodeKt.observeReads(this, sharedTransitionScopeImpl.getObserveAnimatingBlock$animation());
        }
        this.sharedScope = sharedTransitionScopeImpl;
    }
}
