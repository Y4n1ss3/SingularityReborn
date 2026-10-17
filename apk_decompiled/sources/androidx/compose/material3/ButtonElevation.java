package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;
import defpackage.my;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private ButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
        this.disabledElevation = f5;
    }

    private final State<Dp> animateElevation(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        Animatable animatable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1312510462, i, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:947)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i & 48) == 32;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ButtonElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (my) rememberedValue2, composer, (i >> 3) & 14);
        Interaction interaction = (Interaction) yi.w0(snapshotStateList);
        float f = !z ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            Object animatable2 = new Animatable(Dp.m7609boximpl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(animatable2);
            rememberedValue3 = animatable2;
        }
        Animatable animatable3 = (Animatable) rememberedValue3;
        Dp m7609boximpl = Dp.m7609boximpl(f);
        boolean changedInstance = composer.changedInstance(animatable3) | composer.changed(f) | ((((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean changedInstance2 = changedInstance | z2 | composer.changedInstance(interaction);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
            animatable = animatable3;
            Object buttonElevation$animateElevation$2$1 = new ButtonElevation$animateElevation$2$1(animatable, f, z, this, interaction, null);
            composer.updateRememberedValue(buttonElevation$animateElevation$2$1);
            rememberedValue4 = buttonElevation$animateElevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.LaunchedEffect(m7609boximpl, (my) rememberedValue4, composer, 0);
        State<Dp> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        return Dp.m7616equalsimpl0(this.defaultElevation, buttonElevation.defaultElevation) && Dp.m7616equalsimpl0(this.pressedElevation, buttonElevation.pressedElevation) && Dp.m7616equalsimpl0(this.focusedElevation, buttonElevation.focusedElevation) && Dp.m7616equalsimpl0(this.hoveredElevation, buttonElevation.hoveredElevation) && Dp.m7616equalsimpl0(this.disabledElevation, buttonElevation.disabledElevation);
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.disabledElevation) + j50.a(this.hoveredElevation, j50.a(this.focusedElevation, j50.a(this.pressedElevation, Dp.m7617hashCodeimpl(this.defaultElevation) * 31, 31), 31), 31);
    }

    public final State<Dp> shadowElevation$material3(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045116089, i, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:939)");
        }
        State<Dp> animateElevation = animateElevation(z, interactionSource, composer, i & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateElevation;
    }

    public /* synthetic */ ButtonElevation(float f, float f2, float f3, float f4, float f5, dq dqVar) {
        this(f, f2, f3, f4, f5);
    }
}
