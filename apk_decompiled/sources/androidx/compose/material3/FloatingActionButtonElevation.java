package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class FloatingActionButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private FloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
    }

    private final State<Dp> animateElevation(InteractionSource interactionSource, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1845106002, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:628)");
        }
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && composer.changed(interactionSource)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            Object floatingActionButtonElevationAnimatable = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.updateRememberedValue(floatingActionButtonElevationAnimatable);
            rememberedValue = floatingActionButtonElevationAnimatable;
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable2 = (FloatingActionButtonElevationAnimatable) rememberedValue;
        boolean changedInstance = composer.changedInstance(floatingActionButtonElevationAnimatable2) | ((((i & 112) ^ 48) > 32 && composer.changed(this)) || (i & 48) == 32);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new FloatingActionButtonElevation$animateElevation$1$1(floatingActionButtonElevationAnimatable2, this, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(this, (my) rememberedValue2, composer, (i >> 3) & 14);
        boolean changedInstance2 = composer.changedInstance(floatingActionButtonElevationAnimatable2) | ((i3 > 4 && composer.changed(interactionSource)) || (i & 6) == 4);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new FloatingActionButtonElevation$animateElevation$2$1(interactionSource, floatingActionButtonElevationAnimatable2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.LaunchedEffect(interactionSource, (my) rememberedValue3, composer, i2);
        State<Dp> asState = floatingActionButtonElevationAnimatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (Dp.m7616equalsimpl0(this.defaultElevation, floatingActionButtonElevation.defaultElevation) && Dp.m7616equalsimpl0(this.pressedElevation, floatingActionButtonElevation.pressedElevation) && Dp.m7616equalsimpl0(this.focusedElevation, floatingActionButtonElevation.focusedElevation)) {
            return Dp.m7616equalsimpl0(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation);
        }
        return false;
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.hoveredElevation) + j50.a(this.focusedElevation, j50.a(this.pressedElevation, Dp.m7617hashCodeimpl(this.defaultElevation) * 31, 31), 31);
    }

    public final State<Dp> shadowElevation$material3(InteractionSource interactionSource, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424810125, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:619)");
        }
        State<Dp> animateElevation = animateElevation(interactionSource, composer, i & 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateElevation;
    }

    /* renamed from: tonalElevation-D9Ej5fM$material3, reason: not valid java name */
    public final float m2003tonalElevationD9Ej5fM$material3() {
        return this.defaultElevation;
    }

    public /* synthetic */ FloatingActionButtonElevation(float f, float f2, float f3, float f4, dq dqVar) {
        this(f, f2, f3, f4);
    }
}
