package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ScrollableAreaNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean enabled;
    private FlingBehavior flingBehavior;
    private MutableInteractionSource interactionSource;
    private OverscrollFactory localOverscrollFactory;
    private OverscrollEffect localOverscrollFactoryCreatedOverscrollEffect;
    private Orientation orientation;
    private DelegatableNode overscrollNode;
    private boolean reverseScrolling;
    private ScrollableNode scrollableNode;
    private final boolean shouldAutoInvalidate;
    private boolean shouldReverseDirection;
    private ScrollableState state;
    private boolean useLocalOverscrollFactory;
    private OverscrollEffect userProvidedOverscrollEffect;

    public ScrollableAreaNode(ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, boolean z3, OverscrollEffect overscrollEffect) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.enabled = z;
        this.reverseScrolling = z2;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.useLocalOverscrollFactory = z3;
        this.userProvidedOverscrollEffect = overscrollEffect;
    }

    private final void attachOverscrollNodeIfNeeded() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            if (delegatableNode.getNode().isAttached()) {
                return;
            }
            delegate(delegatableNode);
            return;
        }
        if (this.useLocalOverscrollFactory) {
            ObserverModifierNodeKt.observeReads(this, new e(2, this));
        }
        OverscrollEffect overscrollEffect = getOverscrollEffect();
        if (overscrollEffect != null) {
            DelegatableNode node = overscrollEffect.getNode();
            if (node.getNode().isAttached()) {
                return;
            }
            this.overscrollNode = delegate(node);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 attachOverscrollNodeIfNeeded$lambda$0(ScrollableAreaNode scrollableAreaNode) {
        OverscrollFactory overscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.currentValueOf(scrollableAreaNode, OverscrollKt.getLocalOverscrollFactory());
        scrollableAreaNode.localOverscrollFactory = overscrollFactory;
        scrollableAreaNode.localOverscrollFactoryCreatedOverscrollEffect = overscrollFactory != null ? overscrollFactory.createOverscrollEffect() : null;
        return w01.a;
    }

    public final OverscrollEffect getOverscrollEffect() {
        return this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.shouldReverseDirection = shouldReverseDirection();
        attachOverscrollNodeIfNeeded();
        if (this.scrollableNode == null) {
            this.scrollableNode = (ScrollableNode) delegate(new ScrollableNode(this.state, getOverscrollEffect(), this.flingBehavior, this.orientation, this.enabled, this.shouldReverseDirection, this.interactionSource, this.bringIntoViewSpec));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        boolean shouldReverseDirection = shouldReverseDirection();
        if (this.shouldReverseDirection != shouldReverseDirection) {
            this.shouldReverseDirection = shouldReverseDirection;
            update(this.state, this.orientation, this.useLocalOverscrollFactory, getOverscrollEffect(), this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        OverscrollFactory overscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, OverscrollKt.getLocalOverscrollFactory());
        if (q10.b(overscrollFactory, this.localOverscrollFactory)) {
            return;
        }
        this.localOverscrollFactory = overscrollFactory;
        this.localOverscrollFactoryCreatedOverscrollEffect = null;
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.overscrollNode = null;
        attachOverscrollNodeIfNeeded();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.update(this.state, this.orientation, getOverscrollEffect(), this.enabled, this.shouldReverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    public final boolean shouldReverseDirection() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (isAttached()) {
            layoutDirection = DelegatableNodeKt.requireLayoutDirection(this);
        }
        return ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, this.orientation, this.reverseScrolling);
    }

    public final void update(ScrollableState scrollableState, Orientation orientation, boolean z, OverscrollEffect overscrollEffect, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z4;
        this.state = scrollableState;
        this.orientation = orientation;
        boolean z5 = true;
        if (this.useLocalOverscrollFactory != z) {
            this.useLocalOverscrollFactory = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (q10.b(this.userProvidedOverscrollEffect, overscrollEffect)) {
            z5 = false;
        } else {
            this.userProvidedOverscrollEffect = overscrollEffect;
        }
        if (z4 || (z5 && !z)) {
            DelegatableNode delegatableNode = this.overscrollNode;
            if (delegatableNode != null) {
                undelegate(delegatableNode);
            }
            this.overscrollNode = null;
            attachOverscrollNodeIfNeeded();
        }
        this.enabled = z2;
        this.reverseScrolling = z3;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.shouldReverseDirection = shouldReverseDirection();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.update(scrollableState, orientation, getOverscrollEffect(), z2, this.shouldReverseDirection, flingBehavior, mutableInteractionSource, bringIntoViewSpec);
        }
    }
}
