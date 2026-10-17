package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.dq;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public final class PlatformRipple extends Ripple {
    public static final int $stable = 0;

    private PlatformRipple(boolean z, float f, State<Color> state) {
        super(z, f, state, null);
    }

    @Override // androidx.compose.material.ripple.Ripple
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public RippleIndicationInstance mo1573rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z, float f, State<Color> state, State<RippleAlpha> state2, Composer composer, int i) {
        ViewGroup findNearestViewGroup;
        composer.startReplaceGroup(331259447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(331259447, i, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:84)");
        }
        findNearestViewGroup = Ripple_androidKt.findNearestViewGroup((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(interactionSource)) || (i & 6) == 4) | ((((458752 & i) ^ 196608) > 131072 && composer.changed(this)) || (i & 196608) == 131072) | composer.changed(findNearestViewGroup);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Object androidRippleIndicationInstance = new AndroidRippleIndicationInstance(z, f, state, state2, findNearestViewGroup, null);
            composer.updateRememberedValue(androidRippleIndicationInstance);
            rememberedValue = androidRippleIndicationInstance;
        }
        AndroidRippleIndicationInstance androidRippleIndicationInstance2 = (AndroidRippleIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return androidRippleIndicationInstance2;
    }

    public /* synthetic */ PlatformRipple(boolean z, float f, State state, dq dqVar) {
        this(z, f, state);
    }
}
