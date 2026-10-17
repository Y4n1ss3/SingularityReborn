package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.j50;
import defpackage.my;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectableChipElevation {
    public static final int $stable = 0;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float elevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private SelectableChipElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.elevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
        this.draggedElevation = f5;
        this.disabledElevation = f6;
    }

    private final State<Dp> animateElevation(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(664514136, i, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2500)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i & 48) == 32;
        Object rememberedValue3 = composer.rememberedValue();
        if (z3 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new SelectableChipElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.LaunchedEffect(interactionSource, (my) rememberedValue3, composer, (i >> 3) & 14);
        Interaction interaction = (Interaction) yi.w0(snapshotStateList);
        float f = !z ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.elevation;
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            Object animatable = new Animatable(Dp.m7609boximpl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(animatable);
            rememberedValue4 = animatable;
        }
        Animatable animatable2 = (Animatable) rememberedValue4;
        Dp m7609boximpl = Dp.m7609boximpl(f);
        boolean changedInstance = composer.changedInstance(animatable2) | composer.changed(f);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(z)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean changedInstance2 = changedInstance | z2 | composer.changedInstance(interaction);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
            Object selectableChipElevation$animateElevation$2$1 = new SelectableChipElevation$animateElevation$2$1(animatable2, f, z, interaction, mutableState, null);
            composer.updateRememberedValue(selectableChipElevation$animateElevation$2$1);
            rememberedValue5 = selectableChipElevation$animateElevation$2$1;
        }
        EffectsKt.LaunchedEffect(m7609boximpl, (my) rememberedValue5, composer, 0);
        State<Dp> asState = animatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interaction animateElevation$lambda$2(MutableState<Interaction> mutableState) {
        return mutableState.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) obj;
        return Dp.m7616equalsimpl0(this.elevation, selectableChipElevation.elevation) && Dp.m7616equalsimpl0(this.pressedElevation, selectableChipElevation.pressedElevation) && Dp.m7616equalsimpl0(this.focusedElevation, selectableChipElevation.focusedElevation) && Dp.m7616equalsimpl0(this.hoveredElevation, selectableChipElevation.hoveredElevation) && Dp.m7616equalsimpl0(this.disabledElevation, selectableChipElevation.disabledElevation);
    }

    /* renamed from: getDisabledElevation-D9Ej5fM, reason: not valid java name */
    public final float m2365getDisabledElevationD9Ej5fM() {
        return this.disabledElevation;
    }

    /* renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2366getDraggedElevationD9Ej5fM() {
        return this.draggedElevation;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2367getElevationD9Ej5fM() {
        return this.elevation;
    }

    /* renamed from: getFocusedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2368getFocusedElevationD9Ej5fM() {
        return this.focusedElevation;
    }

    /* renamed from: getHoveredElevation-D9Ej5fM, reason: not valid java name */
    public final float m2369getHoveredElevationD9Ej5fM() {
        return this.hoveredElevation;
    }

    /* renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2370getPressedElevationD9Ej5fM() {
        return this.pressedElevation;
    }

    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.disabledElevation) + j50.a(this.hoveredElevation, j50.a(this.focusedElevation, j50.a(this.pressedElevation, Dp.m7617hashCodeimpl(this.elevation) * 31, 31), 31), 31);
    }

    public final State<Dp> shadowElevation$material3(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1888175651, i, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2492)");
        }
        State<Dp> animateElevation = animateElevation(z, interactionSource, composer, i & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animateElevation;
    }

    public /* synthetic */ SelectableChipElevation(float f, float f2, float f3, float f4, float f5, float f6, dq dqVar) {
        this(f, f2, f3, f4, f5, f6);
    }
}
