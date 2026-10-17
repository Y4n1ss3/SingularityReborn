package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.c1;
import defpackage.d1;
import defpackage.e1;
import defpackage.f1;
import defpackage.g1;
import defpackage.iy;
import defpackage.ky;
import defpackage.q40;
import defpackage.w01;
import defpackage.x50;
import defpackage.y40;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccessibilityServiceStateProvider_androidKt {
    private static final String SwitchAccessActivityName = "SwitchAccess";
    private static final String VoiceAccessActivityName = "VoiceAccess";

    private static final void ObserveState(y40 y40Var, ky kyVar, iy iyVar, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1868327245);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(y40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? 256 : Fields.SpotShadowColor;
        }
        int i6 = 0;
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new d1(i6);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kyVar = (ky) rememberedValue;
            }
            if (i5 != 0) {
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new e1(i6);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                iyVar = (iy) rememberedValue2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1868327245, i3, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean changedInstance = ((i3 & 112) == 32) | startRestartGroup.changedInstance(y40Var) | ((i3 & 896) == 256);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new f1(y40Var, kyVar, iyVar, i6);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.DisposableEffect(y40Var, (ky) rememberedValue3, startRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ky kyVar2 = kyVar;
        iy iyVar2 = iyVar;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g1(y40Var, kyVar2, iyVar2, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ObserveState$lambda$12$lambda$11(final y40 y40Var, ky kyVar, final iy iyVar, DisposableEffectScope disposableEffectScope) {
        final c1 c1Var = new c1(kyVar, 0);
        y40Var.getLifecycle().a(c1Var);
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$lambda$12$lambda$11$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                iy.this.invoke();
                y40Var.getLifecycle().b(c1Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ObserveState$lambda$13(y40 y40Var, ky kyVar, iy iyVar, int i, int i2, Composer composer, int i3) {
        ObserveState(y40Var, kyVar, iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ObserveState$lambda$6$lambda$5(q40 q40Var) {
        return w01.a;
    }

    public static final State<Boolean> rememberAccessibilityServiceState(boolean z, boolean z2, boolean z3, Composer composer, int i, int i2) {
        boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(432241692, i, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        Object systemService = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("accessibility");
        systemService.getClass();
        final AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean z5 = ((((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(z2)) || (i & 48) == 32);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(z3)) && (i & 384) != 256) {
            z4 = false;
        }
        boolean z6 = z5 | z4;
        Object rememberedValue = composer.rememberedValue();
        if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Listener(z, z2, z3);
            composer.updateRememberedValue(rememberedValue);
        }
        final Listener listener = (Listener) rememberedValue;
        y40 y40Var = (y40) composer.consume(x50.a);
        boolean changed = composer.changed(listener) | composer.changedInstance(accessibilityManager);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ky() { // from class: androidx.compose.material3.internal.a
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 rememberAccessibilityServiceState$lambda$2$lambda$1;
                    rememberAccessibilityServiceState$lambda$2$lambda$1 = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState$lambda$2$lambda$1(Listener.this, accessibilityManager, (q40) obj);
                    return rememberAccessibilityServiceState$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ky kyVar = (ky) rememberedValue2;
        boolean changed2 = composer.changed(listener) | composer.changedInstance(accessibilityManager);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new iy() { // from class: androidx.compose.material3.internal.b
                @Override // defpackage.iy
                public final Object invoke() {
                    w01 rememberAccessibilityServiceState$lambda$4$lambda$3;
                    rememberAccessibilityServiceState$lambda$4$lambda$3 = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState$lambda$4$lambda$3(Listener.this, accessibilityManager);
                    return rememberAccessibilityServiceState$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        ObserveState(y40Var, kyVar, (iy) rememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rememberAccessibilityServiceState$lambda$2$lambda$1(Listener listener, AccessibilityManager accessibilityManager, q40 q40Var) {
        if (q40Var == q40.ON_RESUME) {
            listener.register(accessibilityManager);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rememberAccessibilityServiceState$lambda$4$lambda$3(Listener listener, AccessibilityManager accessibilityManager) {
        listener.unregister(accessibilityManager);
        return w01.a;
    }
}
