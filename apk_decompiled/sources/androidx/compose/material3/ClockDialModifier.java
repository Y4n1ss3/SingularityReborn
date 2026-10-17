package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {
    public static final int $stable = 0;
    private final AnimationSpec<Float> animationSpec;
    private final boolean autoSwitchToMinute;
    private final int selection;
    private final AnalogTimePickerState state;

    private ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z, int i, AnimationSpec<Float> animationSpec) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z;
        this.selection = i;
        this.animationSpec = animationSpec;
    }

    private final AnalogTimePickerState component1() {
        return this.state;
    }

    private final boolean component2() {
        return this.autoSwitchToMinute;
    }

    /* renamed from: component3-yecRtBI, reason: not valid java name */
    private final int m1732component3yecRtBI() {
        return this.selection;
    }

    private final AnimationSpec<Float> component4() {
        return this.animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-JwYzU44$default, reason: not valid java name */
    public static /* synthetic */ ClockDialModifier m1733copyJwYzU44$default(ClockDialModifier clockDialModifier, AnalogTimePickerState analogTimePickerState, boolean z, int i, AnimationSpec animationSpec, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            analogTimePickerState = clockDialModifier.state;
        }
        if ((i2 & 2) != 0) {
            z = clockDialModifier.autoSwitchToMinute;
        }
        if ((i2 & 4) != 0) {
            i = clockDialModifier.selection;
        }
        if ((i2 & 8) != 0) {
            animationSpec = clockDialModifier.animationSpec;
        }
        return clockDialModifier.m1734copyJwYzU44(analogTimePickerState, z, i, animationSpec);
    }

    /* renamed from: copy-JwYzU44, reason: not valid java name */
    public final ClockDialModifier m1734copyJwYzU44(AnalogTimePickerState analogTimePickerState, boolean z, int i, AnimationSpec<Float> animationSpec) {
        return new ClockDialModifier(analogTimePickerState, z, i, animationSpec, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ClockDialNode create() {
        return new ClockDialNode(this.state, this.autoSwitchToMinute, this.selection, this.animationSpec, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return q10.b(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute && TimePickerSelectionMode.m2673equalsimpl0(this.selection, clockDialModifier.selection) && q10.b(this.animationSpec, clockDialModifier.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.animationSpec.hashCode() + ((TimePickerSelectionMode.m2674hashCodeimpl(this.selection) + kp0.c(this.state.hashCode() * 31, 31, this.autoSwitchToMinute)) * 31);
    }

    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ", selection=" + ((Object) TimePickerSelectionMode.m2675toStringimpl(this.selection)) + ", animationSpec=" + this.animationSpec + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ClockDialNode clockDialNode) {
        clockDialNode.m1738updateNodeJwYzU44(this.state, this.autoSwitchToMinute, this.selection, this.animationSpec);
    }

    public /* synthetic */ ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z, int i, AnimationSpec animationSpec, dq dqVar) {
        this(analogTimePickerState, z, i, animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
