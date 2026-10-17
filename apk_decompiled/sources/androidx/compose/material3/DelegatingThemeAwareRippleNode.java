package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import defpackage.dq;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private final boolean bounded;
    private final ColorProducer color;
    private final InteractionSource interactionSource;
    private final float radius;
    private DelegatableNode rippleNode;

    private DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer) {
        this.interactionSource = interactionSource;
        this.bounded = z;
        this.radius = f;
        this.color = colorProducer;
    }

    private final void attachNewRipple() {
        this.rippleNode = delegate(androidx.compose.material.ripple.RippleKt.m1582createRippleModifierNodeTDGSqEk(this.interactionSource, this.bounded, this.radius, new ColorProducer() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
            @Override // androidx.compose.ui.graphics.ColorProducer
            /* renamed from: invoke-0d7_KjU, reason: not valid java name */
            public final long mo1922invoke0d7_KjU() {
                ColorProducer colorProducer;
                colorProducer = DelegatingThemeAwareRippleNode.this.color;
                long mo1922invoke0d7_KjU = colorProducer.mo1922invoke0d7_KjU();
                if (mo1922invoke0d7_KjU != 16) {
                    return mo1922invoke0d7_KjU;
                }
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, RippleKt.getLocalRippleConfiguration());
                return (rippleConfiguration == null || rippleConfiguration.m2295getColor0d7_KjU() == 16) ? ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, ContentColorKt.getLocalContentColor())).m4771unboximpl() : rippleConfiguration.m2295getColor0d7_KjU();
            }
        }, new b0(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleAlpha attachNewRipple$lambda$1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        RippleAlpha rippleAlpha;
        RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, RippleKt.getLocalRippleConfiguration());
        return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? RippleDefaults.INSTANCE.getRippleAlpha() : rippleAlpha;
    }

    private final void removeRipple() {
        DelegatableNode delegatableNode = this.rippleNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.rippleNode = null;
    }

    private final void updateConfiguration() {
        ObserverModifierNodeKt.observeReads(this, new b0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 updateConfiguration$lambda$0(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, RippleKt.getLocalRippleConfiguration())) == null) {
            delegatingThemeAwareRippleNode.removeRipple();
        } else if (delegatingThemeAwareRippleNode.rippleNode == null) {
            delegatingThemeAwareRippleNode.attachNewRipple();
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateConfiguration();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateConfiguration();
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, dq dqVar) {
        this(interactionSource, z, f, colorProducer);
    }
}
