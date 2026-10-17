package androidx.compose.material3;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.PopupProperties;
import defpackage.bs;
import defpackage.dq;
import defpackage.iy;
import defpackage.ky;
import defpackage.w01;
import defpackage.z5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    public static final void OnPlatformWindowBoundsChange(iy iyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1646555525);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1646555525, i2, -1, "androidx.compose.material3.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:47)");
            }
            SoftKeyboardListener((View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView()), (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()), iyVar, startRestartGroup, (i2 << 6) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new bs(i, i3, iyVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OnPlatformWindowBoundsChange$lambda$1(iy iyVar, int i, Composer composer, int i2) {
        OnPlatformWindowBoundsChange(iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void SoftKeyboardListener(View view, Density density, iy iyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1319522472);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(density) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 256 : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319522472, i2, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:85)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(view) | ((i2 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new defpackage.g(18, view, iyVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(view, density, (ky) rememberedValue, startRestartGroup, i2 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 9, view, density, iyVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SoftKeyboardListener$lambda$5$lambda$4(View view, iy iyVar, DisposableEffectScope disposableEffectScope) {
        final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(view, iyVar);
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$lambda$5$lambda$4$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.this.dispose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SoftKeyboardListener$lambda$6(View view, Density density, iy iyVar, int i, Composer composer, int i2) {
        SoftKeyboardListener(view, density, iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect getWindowBounds(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.toComposeIntRect(rect);
    }

    public static final WindowBoundsCalculator platformWindowBoundsCalculator(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(703324275, i, -1, "androidx.compose.material3.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:40)");
        }
        Object obj = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean changed = composer.changed(obj) | composer.changed(view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new WindowBoundsCalculator(view);
            composer.updateRememberedValue(rememberedValue);
        }
        WindowBoundsCalculator windowBoundsCalculator = (WindowBoundsCalculator) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowBoundsCalculator;
    }

    /* renamed from: popupPropertiesForAnchorType-BTG8-q0, reason: not valid java name */
    public static final PopupProperties m1979popupPropertiesForAnchorTypeBTG8q0(String str, boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895018515, i, -1, "androidx.compose.material3.popupPropertiesForAnchorType (ExposedDropdownMenu.android.kt:57)");
        }
        State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, composer, 0, 7);
        int i2 = !popupPropertiesForAnchorType_BTG8_q0$lambda$2(rememberAccessibilityServiceState) ? 393248 : 393216;
        ExposedDropdownMenuAnchorType.Companion companion = ExposedDropdownMenuAnchorType.Companion;
        if ((ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, companion.m1956getPrimaryEditableoYjWRB4()) || (ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, companion.m1958getSecondaryEditableoYjWRB4()) && !popupPropertiesForAnchorType_BTG8_q0$lambda$2(rememberAccessibilityServiceState))) && !z) {
            i2 |= 8;
        }
        PopupProperties popupProperties = new PopupProperties(i2, false, false, false, false, false, 62, (dq) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return popupProperties;
    }

    private static final boolean popupPropertiesForAnchorType_BTG8_q0$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
