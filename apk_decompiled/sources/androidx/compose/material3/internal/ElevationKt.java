package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.hm;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElevationKt {
    private static final TweenSpec<Dp> DefaultIncomingSpec;
    private static final TweenSpec<Dp> DefaultOutgoingSpec;
    private static final TweenSpec<Dp> HoveredOutgoingSpec;
    private static final Easing OutgoingSpecEasing;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        OutgoingSpecEasing = cubicBezierEasing;
        DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        int i = 2;
        dq dqVar = null;
        int i2 = 0;
        DefaultOutgoingSpec = new TweenSpec<>(150, i2, cubicBezierEasing, i, dqVar);
        HoveredOutgoingSpec = new TweenSpec<>(120, i2, cubicBezierEasing, i, dqVar);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m2898animateElevationrAjV9yQ(Animatable<Dp, ?> animatable, float f, Interaction interaction, Interaction interaction2, hm hmVar) {
        AnimationSpec<Dp> incomingAnimationSpecForInteraction = interaction2 != null ? ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2) : interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        vn vnVar = vn.d;
        w01 w01Var = w01.a;
        if (incomingAnimationSpecForInteraction != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, Dp.m7609boximpl(f), incomingAnimationSpecForInteraction, null, null, hmVar, 12, null);
            return animateTo$default == vnVar ? animateTo$default : w01Var;
        }
        Object snapTo = animatable.snapTo(Dp.m7609boximpl(f), hmVar);
        return snapTo == vnVar ? snapTo : w01Var;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m2899animateElevationrAjV9yQ$default(Animatable animatable, float f, Interaction interaction, Interaction interaction2, hm hmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m2898animateElevationrAjV9yQ(animatable, f, interaction, interaction2, hmVar);
    }
}
