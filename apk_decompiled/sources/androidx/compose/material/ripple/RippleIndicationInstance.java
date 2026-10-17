package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.er;
import defpackage.t6;
import defpackage.un;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    public static final int $stable = 8;
    private final boolean bounded;
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z, State<RippleAlpha> state) {
        this.bounded = z;
        this.stateLayer = new StateLayer(z, new t6(state, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleAlpha stateLayer$lambda$0(State state) {
        return (RippleAlpha) state.getValue();
    }

    public abstract void addRipple(PressInteraction.Press press, un unVar);

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m1581drawStateLayerH2RKhps(DrawScope drawScope, float f, long j) {
        this.stateLayer.m1589drawStateLayermxwnekA(drawScope, Float.isNaN(f) ? RippleAnimationKt.m1577getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo5335getSizeNHjbRc()) : drawScope.mo367toPx0680j_4(f), j);
    }

    public abstract void removeRipple(PressInteraction.Press press);

    public final void updateStateLayer$material_ripple(Interaction interaction, un unVar) {
        this.stateLayer.handleInteraction$material_ripple(interaction, unVar);
    }
}
