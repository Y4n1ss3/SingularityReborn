package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes.dex */
public interface RippleTheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @er
        /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final RippleAlpha m1586defaultRippleAlphaDxMtmZc(long j, boolean z) {
            RippleAlpha rippleAlpha;
            RippleAlpha rippleAlpha2;
            RippleAlpha rippleAlpha3;
            if (!z) {
                rippleAlpha = RippleThemeKt.DarkThemeRippleAlpha;
                return rippleAlpha;
            }
            if (ColorKt.m4813luminance8_81llA(j) > 0.5d) {
                rippleAlpha3 = RippleThemeKt.LightThemeHighContrastRippleAlpha;
                return rippleAlpha3;
            }
            rippleAlpha2 = RippleThemeKt.LightThemeLowContrastRippleAlpha;
            return rippleAlpha2;
        }

        @er
        /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m1587defaultRippleColor5vOe2sY(long j, boolean z) {
            return (z || ((double) ColorKt.m4813luminance8_81llA(j)) >= 0.5d) ? j : Color.Companion.m4798getWhite0d7_KjU();
        }
    }

    @er
    /* renamed from: defaultColor-WaAFU9c */
    long mo1575defaultColorWaAFU9c(Composer composer, int i);

    @er
    RippleAlpha rippleAlpha(Composer composer, int i);
}
