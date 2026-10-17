package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import defpackage.er;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DebugRippleTheme implements RippleTheme {
    public static final DebugRippleTheme INSTANCE = new DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @er
    /* renamed from: defaultColor-WaAFU9c, reason: not valid java name */
    public long mo1575defaultColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceGroup(2042140174);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042140174, i, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:237)");
        }
        long m1587defaultRippleColor5vOe2sY = RippleTheme.Companion.m1587defaultRippleColor5vOe2sY(Color.Companion.m4787getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1587defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @er
    public RippleAlpha rippleAlpha(Composer composer, int i) {
        composer.startReplaceGroup(-1629816343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1629816343, i, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:242)");
        }
        RippleAlpha m1586defaultRippleAlphaDxMtmZc = RippleTheme.Companion.m1586defaultRippleAlphaDxMtmZc(Color.Companion.m4787getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1586defaultRippleAlphaDxMtmZc;
    }
}
