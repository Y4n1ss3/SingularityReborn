package androidx.compose.runtime;

import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.q6;
import defpackage.w01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionLocalKt {
    public static final void CompositionLocalProvider(CompositionLocalContext compositionLocalContext, my myVar, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1162003659);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(compositionLocalContext) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162003659, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:446)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime = compositionLocalContext.getCompositionLocals$runtime();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime.size());
            for (Map.Entry<CompositionLocal<Object>, ValueHolder<Object>> entry : compositionLocals$runtime.entrySet()) {
                arrayList.add(entry.getValue().toProvided(entry.getKey()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), myVar, startRestartGroup, i2 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(compositionLocalContext, myVar, i, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CompositionLocalProvider$lambda$0(ProvidedValue[] providedValueArr, my myVar, int i, Composer composer, int i2) {
        CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CompositionLocalProvider$lambda$1(ProvidedValue providedValue, my myVar, int i, Composer composer, int i2) {
        CompositionLocalProvider((ProvidedValue<?>) providedValue, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CompositionLocalProvider$lambda$3(CompositionLocalContext compositionLocalContext, my myVar, int i, Composer composer, int i2) {
        CompositionLocalProvider(compositionLocalContext, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, iy iyVar) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, iyVar);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, iyVar);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithComputedDefaultOf(ky kyVar) {
        return new ComputedProvidableCompositionLocal(kyVar);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithHostDefaultOf(HostDefaultKey<T> hostDefaultKey) {
        return compositionLocalWithComputedDefaultOf(new defpackage.h(hostDefaultKey, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object compositionLocalWithHostDefaultOf$lambda$0(HostDefaultKey hostDefaultKey, CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return ((HostDefaultProvider) compositionLocalAccessorScope.getCurrentValue(HostDefaultProviderKt.getLocalHostDefaultProvider())).getHostDefault(hostDefaultKey);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(iy iyVar) {
        return new StaticProvidableCompositionLocal(iyVar);
    }

    public static final <T> T withCompositionLocal(ProvidedValue<?> providedValue, my myVar, Composer composer, int i) {
        composer.startProvider(providedValue);
        T t = (T) myVar.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endProvider();
        return t;
    }

    public static final <T> T withCompositionLocals(ProvidedValue<?>[] providedValueArr, my myVar, Composer composer, int i) {
        composer.startProviders(providedValueArr);
        T t = (T) myVar.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endProvider();
        return t;
    }

    public static final void CompositionLocalProvider(ProvidedValue<?> providedValue, my myVar, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-149765515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-149765515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:425)");
        }
        startRestartGroup.startProvider(providedValue);
        myVar.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(providedValue, myVar, i, 6));
        }
    }

    public static final void CompositionLocalProvider(ProvidedValue<?>[] providedValueArr, my myVar, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(415205898);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(415205898, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:405)");
        }
        startRestartGroup.startProviders(providedValueArr);
        myVar.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(providedValueArr, myVar, i, 7));
        }
    }
}
