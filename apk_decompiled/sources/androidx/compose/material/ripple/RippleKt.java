package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RippleKt {
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    /* renamed from: createRippleModifierNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m1582createRippleModifierNodeTDGSqEk(InteractionSource interactionSource, boolean z, float f, ColorProducer colorProducer, iy iyVar) {
        return Ripple_androidKt.m1588createPlatformRippleNodeTDGSqEk(interactionSource, z, f, colorProducer, iyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? DefaultTweenSpec : interaction instanceof FocusInteraction.Focus ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : interaction instanceof DragInteraction.Start ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? DefaultTweenSpec : interaction instanceof FocusInteraction.Focus ? DefaultTweenSpec : interaction instanceof DragInteraction.Start ? new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
    }

    @er
    /* renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final Indication m1583rememberRipple9IZ8Weo(boolean z, float f, long j, Composer composer, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Dp.Companion.m7631getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            j = Color.Companion.m4797getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:144)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(j), composer, (i >> 6) & 14);
        boolean z3 = (((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(f)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PlatformRipple(z, f, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue);
        }
        PlatformRipple platformRipple = (PlatformRipple) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return platformRipple;
    }
}
