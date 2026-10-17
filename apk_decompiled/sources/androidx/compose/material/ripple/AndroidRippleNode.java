package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.dq;
import defpackage.i2;
import defpackage.iy;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public static final int $stable = 8;
    private RippleContainer rippleContainer;
    private RippleHostView rippleHostView;

    private AndroidRippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, iy iyVar) {
        super(interactionSource, z, f, colorProducer, iyVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addRipple_12SF9DM$lambda$0$0$0(AndroidRippleNode androidRippleNode) {
        DrawModifierNodeKt.invalidateDraw(androidRippleNode);
        return w01.a;
    }

    private final RippleContainer getOrCreateRippleContainer() {
        ViewGroup findNearestViewGroup;
        RippleContainer createAndAttachRippleContainerIfNeeded;
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.getClass();
            return rippleContainer;
        }
        findNearestViewGroup = Ripple_androidKt.findNearestViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView()));
        createAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(findNearestViewGroup);
        this.rippleContainer = createAndAttachRippleContainerIfNeeded;
        createAndAttachRippleContainerIfNeeded.getClass();
        return createAndAttachRippleContainerIfNeeded;
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView = rippleHostView;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM, reason: not valid java name */
    public void mo1572addRipple12SF9DM(PressInteraction.Press press, long j, float f) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m1579addRippleKOepWvA(press, getBounded(), j, y80.P(f), m1584getRippleColor0d7_KjU(), ((RippleAlpha) getRippleAlpha().invoke()).getPressedAlpha(), new i2(this, 3));
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.m1580setRipplePropertiesbiQXAtU(m1585getRippleSizeNHjbRc(), y80.P(getTargetRadius()), m1584getRippleColor0d7_KjU(), ((RippleAlpha) getRippleAlpha().invoke()).getPressedAlpha());
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(PressInteraction.Press press) {
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    public /* synthetic */ AndroidRippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, iy iyVar, dq dqVar) {
        this(interactionSource, z, f, colorProducer, iyVar);
    }
}
