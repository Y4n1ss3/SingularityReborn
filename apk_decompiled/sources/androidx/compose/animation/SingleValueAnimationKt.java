package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m98Animatable8_81llA(long j) {
        return new Animatable<>(Color.m4751boximpl(j), (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4765getColorSpaceimpl(j)), null, null, 12, null);
    }

    @er
    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ State m99animateColorAsStateKTwxG1Y(long j, AnimationSpec animationSpec, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:82)");
        }
        State<Color> m100animateColorAsStateeuL9pac = m100animateColorAsStateeuL9pac(j, animationSpec2, null, kyVar2, composer, (i & 126) | ((i << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m100animateColorAsStateeuL9pac;
    }

    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State<Color> m100animateColorAsStateeuL9pac(long j, AnimationSpec<Color> animationSpec, String str, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec<Color> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            kyVar = null;
        }
        ky kyVar2 = kyVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean changed = composer.changed(Color.m4765getColorSpaceimpl(j));
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4765getColorSpaceimpl(j));
            composer.updateRememberedValue(rememberedValue);
        }
        int i3 = i << 6;
        State<Color> animateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m4751boximpl(j), (TwoWayConverter) rememberedValue, animationSpec2, null, str2, kyVar2, composer, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateValueAsState;
    }
}
