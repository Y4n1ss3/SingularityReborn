package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.dq;
import defpackage.ji0;
import defpackage.ky;
import defpackage.p01;
import defpackage.q10;
import defpackage.ts;
import defpackage.v4;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    private final FocusTargetModifierNode focusTargetNode;
    private FocusInteraction.Focus focusedInteraction;
    private LayoutCoordinates globalLayoutCoordinates;
    private MutableInteractionSource interactionSource;
    private final ky onFocusChange;
    private PinnableContainer.PinnedHandle pinnedHandle;
    private final boolean shouldAutoInvalidate;
    private static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    private FocusableNode(MutableInteractionSource mutableInteractionSource, int i, ky kyVar) {
        this.interactionSource = mutableInteractionSource;
        this.onFocusChange = kyVar;
        this.focusTargetNode = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m4425FocusTargetModifierNodePYyLHbc(i, new FocusableNode$focusTargetNode$1(this)));
    }

    private final void disposeInteractionSource() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (focus = this.focusedInteraction) != null) {
            mutableInteractionSource.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        this.focusedInteraction = null;
    }

    private final void emitInteraction(boolean z) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            FocusInteraction.Focus focus = this.focusedInteraction;
            if (!z) {
                if (focus != null) {
                    emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            if (focus != null) {
                emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                this.focusedInteraction = null;
            }
            FocusInteraction.Focus focus2 = new FocusInteraction.Focus();
            emitWithFallback(mutableInteractionSource, focus2);
            this.focusedInteraction = focus2;
        }
    }

    private final void emitWithFallback(MutableInteractionSource mutableInteractionSource, Interaction interaction) {
        if (!isAttached()) {
            mutableInteractionSource.tryEmit(interaction);
        } else {
            z10 z10Var = (z10) getCoroutineScope().getCoroutineContext().get(ts.l);
            p01.t(getCoroutineScope(), null, null, new FocusableNode$emitWithFallback$1(mutableInteractionSource, interaction, z10Var != null ? z10Var.h(new defpackage.g(19, mutableInteractionSource, interaction)) : null, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 emitWithFallback$lambda$0(MutableInteractionSource mutableInteractionSource, Interaction interaction, Throwable th) {
        mutableInteractionSource.tryEmit(interaction);
        return w01.a;
    }

    private final FocusedBoundsObserverNode getFocusedBoundsObserver() {
        if (isAttached()) {
            TraversableNode findNearestAncestor = TraversableNodeKt.findNearestAncestor(this, FocusedBoundsObserverNode.TraverseKey);
            if (findNearestAncestor instanceof FocusedBoundsObserverNode) {
                return (FocusedBoundsObserverNode) findNearestAncestor;
            }
        }
        return null;
    }

    private final void notifyObserverWhenAttached() {
        FocusedBoundsObserverNode focusedBoundsObserver;
        LayoutCoordinates layoutCoordinates = this.globalLayoutCoordinates;
        if (layoutCoordinates != null) {
            layoutCoordinates.getClass();
            if (!layoutCoordinates.isAttached() || (focusedBoundsObserver = getFocusedBoundsObserver()) == null) {
                return;
            }
            focusedBoundsObserver.onFocusBoundsChanged(this.globalLayoutCoordinates);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState, FocusState focusState2) {
        boolean isFocused;
        if (isAttached() && (isFocused = focusState2.isFocused()) != focusState.isFocused()) {
            ky kyVar = this.onFocusChange;
            if (kyVar != null) {
                kyVar.invoke(Boolean.valueOf(isFocused));
            }
            if (isFocused) {
                p01.t(getCoroutineScope(), null, null, new FocusableNode$onFocusStateChange$1(this, null), 3);
                PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
                this.pinnedHandle = retrievePinnableContainer != null ? retrievePinnableContainer.pin() : null;
                notifyObserverWhenAttached();
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                this.pinnedHandle = null;
                FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
                if (focusedBoundsObserver != null) {
                    focusedBoundsObserver.onFocusBoundsChanged(null);
                }
            }
            SemanticsModifierNodeKt.invalidateSemantics(this);
            emitInteraction(isFocused);
        }
    }

    private final PinnableContainer retrievePinnableContainer() {
        ji0 ji0Var = new ji0();
        ObserverModifierNodeKt.observeReads(this, new v4(16, ji0Var, this));
        return (PinnableContainer) ji0Var.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 retrievePinnableContainer$lambda$0(ji0 ji0Var, FocusableNode focusableNode) {
        ji0Var.d = CompositionLocalConsumerModifierNodeKt.currentValueOf(focusableNode, PinnableContainerKt.getLocalPinnableContainer());
        return w01.a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.focusTargetNode.getFocusState().isFocused());
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new FocusableNode$applySemantics$1(this), 1, null);
    }

    public final FocusState getFocusState() {
        return this.focusTargetNode.getFocusState();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TraverseKey;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.globalLayoutCoordinates = layoutCoordinates;
        if (this.focusTargetNode.getFocusState().isFocused()) {
            if (layoutCoordinates.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            FocusedBoundsObserverNode focusedBoundsObserver = getFocusedBoundsObserver();
            if (focusedBoundsObserver != null) {
                focusedBoundsObserver.onFocusBoundsChanged(null);
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
        if (this.focusTargetNode.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = retrievePinnableContainer != null ? retrievePinnableContainer.pin() : null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    public final boolean requestFocus() {
        return FocusTargetModifierNode.m4421requestFocus3ESFkO8$default(this.focusTargetNode, 0, 1, null);
    }

    public final void update(MutableInteractionSource mutableInteractionSource) {
        if (q10.b(this.interactionSource, mutableInteractionSource)) {
            return;
        }
        disposeInteractionSource();
        this.interactionSource = mutableInteractionSource;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(dq dqVar) {
            this();
        }

        private TraverseKey() {
        }
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i, ky kyVar, dq dqVar) {
        this(mutableInteractionSource, i, kyVar);
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i, ky kyVar, int i2, dq dqVar) {
        this(mutableInteractionSource, (i2 & 2) != 0 ? Focusability.Companion.m4450getAlwaysLCbbffg() : i, (i2 & 4) != 0 ? null : kyVar, null);
    }
}
