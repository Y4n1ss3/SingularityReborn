package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.dq;
import defpackage.iy;
import defpackage.p01;
import defpackage.un;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final boolean bounded;
    private final ColorProducer color;
    private boolean hasValidSize;
    private final InteractionSource interactionSource;
    private final xa0 pendingInteractions;
    private final float radius;
    private final iy rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;
    private StateLayer stateLayer;
    private float targetRadius;

    private RippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, iy iyVar) {
        this.interactionSource = interactionSource;
        this.bounded = z;
        this.radius = f;
        this.color = colorProducer;
        this.rippleAlpha = iyVar;
        this.rippleSize = Size.Companion.m4594getZeroNHjbRc();
        this.pendingInteractions = new xa0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePressInteraction(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            mo1572addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            removeRipple(((PressInteraction.Release) pressInteraction).getPress());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateLayer(Interaction interaction, un unVar) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            DrawModifierNodeKt.invalidateDraw(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.handleInteraction$material_ripple(interaction, unVar);
    }

    /* renamed from: addRipple-12SF9DM */
    public abstract void mo1572addRipple12SF9DM(PressInteraction.Press press, long j, float f);

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.m1589drawStateLayermxwnekA(contentDrawScope, this.targetRadius, m1584getRippleColor0d7_KjU());
        }
        drawRipples(contentDrawScope);
    }

    public abstract void drawRipples(DrawScope drawScope);

    public final boolean getBounded() {
        return this.bounded;
    }

    public final iy getRippleAlpha() {
        return this.rippleAlpha;
    }

    /* renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m1584getRippleColor0d7_KjU() {
        return this.color.mo1922invoke0d7_KjU();
    }

    /* renamed from: getRippleSize-NH-jbRc, reason: not valid java name */
    public final long m1585getRippleSizeNHjbRc() {
        return this.rippleSize;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final float getTargetRadius() {
        return this.targetRadius;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        p01.t(getCoroutineScope(), null, null, new RippleNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo356onRemeasuredozmzZPI(long j) {
        this.hasValidSize = true;
        Density requireDensity = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m7794toSizeozmzZPI(j);
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m1577getRippleEndRadiuscSwnlzA(requireDensity, this.bounded, this.rippleSize) : requireDensity.mo367toPx0680j_4(this.radius);
        xa0 xa0Var = this.pendingInteractions;
        Object[] objArr = xa0Var.a;
        int i = xa0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            handlePressInteraction((PressInteraction) objArr[i2]);
        }
        this.pendingInteractions.j();
    }

    public abstract void removeRipple(PressInteraction.Press press);

    public final void setTargetRadius(float f) {
        this.targetRadius = f;
    }

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, iy iyVar, dq dqVar) {
        this(interactionSource, z, f, colorProducer, iyVar);
    }
}
