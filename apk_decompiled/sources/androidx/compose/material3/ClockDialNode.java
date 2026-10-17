package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.dq;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClockDialNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private AnimationSpec<Float> animationSpec;
    private boolean autoSwitchToMinute;
    private final MutableState center$delegate;
    private float offsetX;
    private float offsetY;
    private final SuspendingPointerInputModifierNode pointerInputDragNode;
    private final SuspendingPointerInputModifierNode pointerInputTapNode;
    private int selection;
    private AnalogTimePickerState state;

    private ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z, int i, AnimationSpec<Float> animationSpec) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z;
        this.selection = i;
        this.animationSpec = animationSpec;
        this.center$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m7730boximpl(IntOffset.Companion.m7750getZeronOccac()), null, 2, null);
        this.pointerInputTapNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputTapNode$1(this)));
        this.pointerInputDragNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClockDialNode$pointerInputDragNode$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m1736getCenternOccac() {
        return ((IntOffset) this.center$delegate.getValue()).m7748unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxDist() {
        float f;
        Density requireDensity = DelegatableNodeKt.requireDensity(this);
        f = TimePickerKt.MaxDistance;
        return (requireDensity.mo367toPx0680j_4(f) * requireDensity.mo361roundToPx0680j_4(this.state.m1596getCurrentDiameterD9Ej5fM())) / requireDensity.mo361roundToPx0680j_4(TimePickerTokens.INSTANCE.m3707getClockDialContainerSizeD9Ej5fM());
    }

    /* renamed from: setCenter--gyyYBs, reason: not valid java name */
    private final void m1737setCentergyyYBs(long j) {
        this.center$delegate.setValue(IntOffset.m7730boximpl(j));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputTapNode.onCancelPointerInput();
        this.pointerInputDragNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.pointerInputTapNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        this.pointerInputDragNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo356onRemeasuredozmzZPI(long j) {
        m1737setCentergyyYBs(IntSizeKt.m7788getCenterozmzZPI(j));
        this.state.m1598setCurrentDiameter0680j_4(DelegatableNodeKt.requireDensity(this).mo364toDpu2uoSUM((int) (j >> 32)));
    }

    /* renamed from: updateNode-JwYzU44, reason: not valid java name */
    public final void m1738updateNodeJwYzU44(AnalogTimePickerState analogTimePickerState, boolean z, int i, AnimationSpec<Float> animationSpec) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z;
        this.animationSpec = animationSpec;
        if (TimePickerSelectionMode.m2673equalsimpl0(this.selection, i)) {
            return;
        }
        this.selection = i;
        p01.t(getCoroutineScope(), null, null, new ClockDialNode$updateNode$1(analogTimePickerState, animationSpec, null), 3);
    }

    public /* synthetic */ ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z, int i, AnimationSpec animationSpec, dq dqVar) {
        this(analogTimePickerState, z, i, animationSpec);
    }
}
