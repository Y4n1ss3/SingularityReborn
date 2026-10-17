package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.dq;
import defpackage.er;
import defpackage.p01;
import defpackage.un;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;
    private float targetRadius;

    private CommonRippleIndicationInstance(boolean z, float f, State<Color> state, State<RippleAlpha> state2) {
        super(z, state2);
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
        this.targetRadius = Float.NaN;
    }

    /* renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m1574drawRipples4WTKRHQ(DrawScope drawScope, long j) {
        long j2;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha == 0.0f) {
                j2 = j;
            } else {
                j2 = j;
                value.m1576draw4WTKRHQ(drawScope, Color.m4760copywmQWz5c$default(j2, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
            j = j2;
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, un unVar) {
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.bounded ? Offset.m4505boximpl(press.m588getPressPositionF1C5BW0()) : null, this.targetRadius, this.bounded, null);
        this.ripples.put(press, rippleAnimation);
        p01.t(unVar, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, press, null), 3);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m1577getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo5335getSizeNHjbRc()) : contentDrawScope.mo367toPx0680j_4(this.radius);
        long m4771unboximpl = this.color.getValue().m4771unboximpl();
        contentDrawScope.drawContent();
        m1581drawStateLayerH2RKhps(contentDrawScope, this.radius, m4771unboximpl);
        m1574drawRipples4WTKRHQ(contentDrawScope, m4771unboximpl);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    public /* synthetic */ CommonRippleIndicationInstance(boolean z, float f, State state, State state2, dq dqVar) {
        this(z, f, state, state2);
    }
}
