package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import defpackage.dq;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class CommonRipple extends Ripple {
    public static final int $stable = 0;

    private CommonRipple(boolean z, float f, State<Color> state) {
        super(z, f, state, null);
    }

    @Override // androidx.compose.material.ripple.Ripple
    /* renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public RippleIndicationInstance mo1573rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z, float f, State<Color> state, State<RippleAlpha> state2, Composer composer, int i) {
        composer.startReplaceGroup(-1768051227);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1768051227, i, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:56)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4) | ((((458752 & i) ^ 196608) > 131072 && composer.changed(this)) || (i & 196608) == 131072);
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
            CommonRippleIndicationInstance commonRippleIndicationInstance = new CommonRippleIndicationInstance(z, f, state, state2, null);
            composer.updateRememberedValue(commonRippleIndicationInstance);
            rememberedValue = commonRippleIndicationInstance;
        }
        CommonRippleIndicationInstance commonRippleIndicationInstance2 = (CommonRippleIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return commonRippleIndicationInstance2;
    }

    public /* synthetic */ CommonRipple(boolean z, float f, State state, dq dqVar) {
        this(z, f, state);
    }
}
