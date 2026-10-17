package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import defpackage.iy;
import defpackage.rn0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailStateKt {
    public static final boolean isExpanded(WideNavigationRailValue wideNavigationRailValue) {
        return wideNavigationRailValue == WideNavigationRailValue.Expanded;
    }

    public static final WideNavigationRailValue not(WideNavigationRailValue wideNavigationRailValue) {
        WideNavigationRailValue wideNavigationRailValue2 = WideNavigationRailValue.Collapsed;
        return wideNavigationRailValue == wideNavigationRailValue2 ? WideNavigationRailValue.Expanded : wideNavigationRailValue2;
    }

    public static final WideNavigationRailState rememberWideNavigationRailState(WideNavigationRailValue wideNavigationRailValue, Composer composer, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            wideNavigationRailValue = WideNavigationRailValue.Collapsed;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595273472, i, -1, "androidx.compose.material3.rememberWideNavigationRailState (WideNavigationRailState.kt:86)");
        }
        FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        Object[] objArr = new Object[0];
        Saver<WideNavigationRailState, WideNavigationRailValue> Saver = WideNavigationRailStateImpl.Companion.Saver(value);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(wideNavigationRailValue.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance = composer.changedInstance(value) | z;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new rn0(8, wideNavigationRailValue, value);
            composer.updateRememberedValue(rememberedValue);
        }
        WideNavigationRailState wideNavigationRailState = (WideNavigationRailState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return wideNavigationRailState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WideNavigationRailState rememberWideNavigationRailState$lambda$1$lambda$0(WideNavigationRailValue wideNavigationRailValue, FiniteAnimationSpec finiteAnimationSpec) {
        return new WideNavigationRailStateImpl(wideNavigationRailValue, finiteAnimationSpec);
    }
}
