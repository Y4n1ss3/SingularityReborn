package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import defpackage.dq;
import defpackage.er;
import defpackage.i2;
import defpackage.iy;
import defpackage.un;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {
    public static final int $stable = 8;
    private final boolean bounded;
    private final State<Color> color;
    private final MutableState invalidateTick$delegate;
    private final iy onInvalidateRipple;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private RippleContainer rippleContainer;
    private final MutableState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;
    private final ViewGroup view;

    private AndroidRippleIndicationInstance(boolean z, float f, State<Color> state, State<RippleAlpha> state2, ViewGroup viewGroup) {
        super(z, state2);
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.view = viewGroup;
        this.rippleHostView$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.invalidateTick$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.rippleSize = Size.Companion.m4594getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new i2(this, 2);
    }

    private final void dispose() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick$delegate.getValue()).booleanValue();
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer createAndAttachRippleContainerIfNeeded;
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.getClass();
            return rippleContainer;
        }
        createAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(this.view);
        this.rippleContainer = createAndAttachRippleContainerIfNeeded;
        createAndAttachRippleContainerIfNeeded.getClass();
        return createAndAttachRippleContainerIfNeeded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onInvalidateRipple$lambda$0(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        androidRippleIndicationInstance.setInvalidateTick(!androidRippleIndicationInstance.getInvalidateTick());
        return w01.a;
    }

    private final void setInvalidateTick(boolean z) {
        this.invalidateTick$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView$delegate.setValue(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, un unVar) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m1579addRippleKOepWvA(press, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m4771unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        this.rippleSize = contentDrawScope.mo5335getSizeNHjbRc();
        this.rippleRadius = Float.isNaN(this.radius) ? y80.P(RippleAnimationKt.m1577getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo5335getSizeNHjbRc())) : contentDrawScope.mo361roundToPx0680j_4(this.radius);
        long m4771unboximpl = this.color.getValue().m4771unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        m1581drawStateLayerH2RKhps(contentDrawScope, this.radius, m4771unboximpl);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m1580setRipplePropertiesbiQXAtU(contentDrawScope.mo5335getSizeNHjbRc(), this.rippleRadius, m4771unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press press) {
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z, float f, State state, State state2, ViewGroup viewGroup, dq dqVar) {
        this(z, f, state, state2, viewGroup);
    }
}
