package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.er;
import defpackage.j50;
import defpackage.my;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public abstract class Ripple implements Indication {
    public static final int $stable = 0;
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    private Ripple(boolean z, float f, State<Color> state) {
        this.bounded = z;
        this.radius = f;
        this.color = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.bounded == ripple.bounded && Dp.m7616equalsimpl0(this.radius, ripple.radius) && q10.b(this.color, ripple.color);
    }

    public int hashCode() {
        return this.color.hashCode() + j50.a(this.radius, Boolean.hashCode(this.bounded) * 31, 31);
    }

    @Override // androidx.compose.foundation.Indication
    @er
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i) {
        long mo1575defaultColorWaAFU9c;
        composer.startReplaceGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:190)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        if (this.color.getValue().m4771unboximpl() != 16) {
            composer.startReplaceGroup(762841340);
            composer.endReplaceGroup();
            mo1575defaultColorWaAFU9c = this.color.getValue().m4771unboximpl();
        } else {
            composer.startReplaceGroup(762899124);
            mo1575defaultColorWaAFU9c = rippleTheme.mo1575defaultColorWaAFU9c(composer, 0);
            composer.endReplaceGroup();
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4751boximpl(mo1575defaultColorWaAFU9c), composer, 0);
        State<RippleAlpha> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0);
        int i2 = i & 14;
        RippleIndicationInstance mo1573rememberUpdatedRippleInstance942rkJo = mo1573rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, rememberUpdatedState, rememberUpdatedState2, composer, i2 | ((i << 12) & 458752));
        boolean changedInstance = composer.changedInstance(mo1573rememberUpdatedRippleInstance942rkJo) | (((i2 ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Ripple$rememberUpdatedInstance$1$1(interactionSource, mo1573rememberUpdatedRippleInstance942rkJo, null);
            composer.updateRememberedValue(rememberedValue);
        }
        EffectsKt.LaunchedEffect(mo1573rememberUpdatedRippleInstance942rkJo, interactionSource, (my) rememberedValue, composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mo1573rememberUpdatedRippleInstance942rkJo;
    }

    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo1573rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z, float f, State<Color> state, State<RippleAlpha> state2, Composer composer, int i);

    public /* synthetic */ Ripple(boolean z, float f, State state, dq dqVar) {
        this(z, f, state);
    }
}
