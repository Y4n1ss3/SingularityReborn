package androidx.compose.runtime;

import defpackage.b20;
import defpackage.er;
import defpackage.iy;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.rc;
import defpackage.sj;
import defpackage.st;
import defpackage.ts;
import defpackage.un;
import defpackage.w01;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    public static final void DisposableEffect(Object[] objArr, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:266)");
        }
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(kyVar));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object[] objArr, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");
        }
        kn applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, myVar));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LaunchedEffect$lambda$0(my myVar, int i, Composer composer, int i2) {
        LaunchedEffect(myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void SideEffect(iy iyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:53)");
        }
        composer.recordSideEffect(iyVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final un createCompositionCoroutineScope(kn knVar, Composer composer) {
        if (knVar.get(ts.l) == null) {
            return new RememberedCoroutineScope(composer.getApplyCoroutineContext(), knVar);
        }
        b20 b20Var = new b20(null);
        b20Var.K(new sj(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return p10.a(b20Var);
    }

    public static final un rememberCoroutineScope(iy iyVar, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            iyVar = new iy() { // from class: androidx.compose.runtime.EffectsKt$rememberCoroutineScope$1
                @Override // defpackage.iy
                public final st invoke() {
                    return st.d;
                }
            };
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = createCompositionCoroutineScope((kn) iyVar.invoke(), composer);
            composer.updateRememberedValue(rememberedValue);
        }
        return (un) rememberedValue;
    }

    public static final void DisposableEffect(Object obj, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(kyVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:344)");
        }
        kn applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, myVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:192)");
        }
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(kyVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:363)");
        }
        kn applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, myVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:230)");
        }
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(kyVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:387)");
        }
        kn applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, myVar);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @er
    public static final void DisposableEffect(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:122)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError);
    }

    @er
    public static final void LaunchedEffect(my myVar, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-805415771);
        int i2 = i & 1;
        if (startRestartGroup.shouldExecute(i2 != 0, i2)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:328)");
            }
            o.f(LaunchedEffectNoParamError);
        } else {
            startRestartGroup.skipToGroupEnd();
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new rc(i, 2, myVar));
            }
        }
    }
}
