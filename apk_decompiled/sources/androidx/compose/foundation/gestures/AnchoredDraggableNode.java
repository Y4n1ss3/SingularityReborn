package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.gi0;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AnchoredDraggableNode<T> extends DragGestureNode {
    private Density density;
    private FlingBehavior flingBehavior;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    public FlingBehavior resolvedFlingBehavior;
    private Boolean reverseDirection;
    private Boolean startDragImmediately;
    private AnchoredDraggableState<T> state;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnchoredDraggableNode(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        super(r0, z, mutableInteractionSource, orientation);
        ky kyVar;
        kyVar = AnchoredDraggableKt.AlwaysDrag;
        this.state = anchoredDraggableState;
        this.orientation = orientation;
        this.reverseDirection = bool;
        this.overscrollEffect = overscrollEffect;
        this.startDragImmediately = bool2;
        this.flingBehavior = flingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fling(float f, hm hmVar) {
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$1;
        int i;
        gi0 gi0Var;
        if (hmVar instanceof AnchoredDraggableNode$fling$1) {
            anchoredDraggableNode$fling$1 = (AnchoredDraggableNode$fling$1) hmVar;
            int i2 = anchoredDraggableNode$fling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableNode$fling$1.label = i2 - Integer.MIN_VALUE;
                AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$12 = anchoredDraggableNode$fling$1;
                Object obj = anchoredDraggableNode$fling$12.result;
                i = anchoredDraggableNode$fling$12.label;
                if (i != 0) {
                    p10.Q(obj);
                    boolean usePreModifierChangeBehavior$foundation = this.state.getUsePreModifierChangeBehavior$foundation();
                    vn vnVar = vn.d;
                    if (usePreModifierChangeBehavior$foundation) {
                        AnchoredDraggableState<T> anchoredDraggableState = this.state;
                        anchoredDraggableNode$fling$12.label = 1;
                        Object obj2 = anchoredDraggableState.settle(f, anchoredDraggableNode$fling$12);
                        if (obj2 != vnVar) {
                            return obj2;
                        }
                    } else {
                        gi0 gi0Var2 = new gi0();
                        gi0Var2.d = f;
                        AnchoredDraggableState<T> anchoredDraggableState2 = this.state;
                        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this, gi0Var2, f, null);
                        anchoredDraggableNode$fling$12.L$0 = gi0Var2;
                        anchoredDraggableNode$fling$12.label = 2;
                        if (AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState2, null, anchoredDraggableNode$fling$2, anchoredDraggableNode$fling$12, 1, null) != vnVar) {
                            gi0Var = gi0Var2;
                        }
                    }
                    return vnVar;
                }
                if (i == 1) {
                    p10.Q(obj);
                    return obj;
                }
                if (i != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gi0Var = (gi0) anchoredDraggableNode$fling$12.L$0;
                p10.Q(obj);
                return new Float(gi0Var.d);
            }
        }
        anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(this, hmVar);
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$122 = anchoredDraggableNode$fling$1;
        Object obj3 = anchoredDraggableNode$fling$122.result;
        i = anchoredDraggableNode$fling$122.label;
        if (i != 0) {
        }
        return new Float(gi0Var.d);
    }

    private final boolean isReverseDirection() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return DelegatableNodeKt.requireLayoutDirection(this) == LayoutDirection.Rtl && this.orientation == Orientation.Horizontal;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-AH228Gc, reason: not valid java name */
    public final long m379reverseIfNeededAH228Gc(long j) {
        return Velocity.m7855timesadjELrA(j, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m380reverseIfNeededMKHz9U(long j) {
        return Offset.m4523timestuRUvjQ(j, isReverseDirection() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m381toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Vertical ? Velocity.m7850getYimpl(j) : Velocity.m7849getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m382toFloatk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Vertical ? j & 4294967295L : j >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m383toOffsettuRUvjQ(float f) {
        Orientation orientation = this.orientation;
        float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
        if (orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m384toVelocityadjELrA(float f) {
        Orientation orientation = this.orientation;
        float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
        if (orientation != Orientation.Vertical) {
            f = 0.0f;
        }
        return VelocityKt.Velocity(f2, f);
    }

    private final void updateDensity() {
        Density requireDensity = DelegatableNodeKt.requireDensity(this);
        Density density = this.density;
        if (density == null || !q10.b(density, requireDensity)) {
            this.density = requireDensity;
            updateFlingBehavior(this.flingBehavior);
        }
    }

    private final void updateFlingBehavior(FlingBehavior flingBehavior) {
        if (flingBehavior == null) {
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
            AnimationSpec<Float> snapAnimationSpec = anchoredDraggableDefaults.getSnapAnimationSpec();
            ky positionalThreshold = anchoredDraggableDefaults.getPositionalThreshold();
            Density requireDensity = DelegatableNodeKt.requireDensity(this);
            this.density = requireDensity;
            flingBehavior = AnchoredDraggableKt.anchoredDraggableFlingBehavior(this.state, requireDensity, positionalThreshold, snapAnimationSpec);
        }
        setResolvedFlingBehavior(flingBehavior);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object drag(my myVar, hm hmVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.state, null, new AnchoredDraggableNode$drag$2(myVar, this, null), hmVar, 1, null);
        return anchoredDrag$default == vn.d ? anchoredDrag$default : w01.a;
    }

    public final FlingBehavior getResolvedFlingBehavior() {
        FlingBehavior flingBehavior = this.resolvedFlingBehavior;
        if (flingBehavior != null) {
            return flingBehavior;
        }
        q10.H("resolvedFlingBehavior");
        throw null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateFlingBehavior(this.flingBehavior);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            updateDensity();
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void onDragStopped(DragEvent.DragStopped dragStopped) {
        if (isAttached()) {
            p01.t(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, dragStopped, null), 3);
        }
    }

    public final void setResolvedFlingBehavior(FlingBehavior flingBehavior) {
        this.resolvedFlingBehavior = flingBehavior;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public boolean startDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.isAnimationRunning();
    }

    public final void update(AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, Boolean bool, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, Boolean bool2, FlingBehavior flingBehavior) {
        boolean z2;
        boolean z3;
        this.flingBehavior = flingBehavior;
        if (q10.b(this.state, anchoredDraggableState)) {
            z2 = false;
        } else {
            this.state = anchoredDraggableState;
            updateFlingBehavior(flingBehavior);
            z2 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z2 = true;
        }
        if (q10.b(this.reverseDirection, bool)) {
            z3 = z2;
        } else {
            this.reverseDirection = bool;
            z3 = true;
        }
        this.startDragImmediately = bool2;
        this.overscrollEffect = overscrollEffect;
        DragGestureNode.update$default(this, null, z, mutableInteractionSource, orientation, z3, 1, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M, reason: not valid java name */
    public void mo385onDragStartedk4lQ0M(long j) {
    }
}
