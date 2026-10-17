package androidx.compose.runtime.retain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import defpackage.ms;
import defpackage.my;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalRetainedValuesStoreKt {
    private static final ProvidableCompositionLocal<RetainedValuesStore> LocalRetainedValuesStore = CompositionLocalKt.staticCompositionLocalOf(new ms(10));

    public static final void LocalRetainedValuesStoreProvider(RetainedValuesStore retainedValuesStore, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-358532755);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(retainedValuesStore) : startRestartGroup.changedInstance(retainedValuesStore) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        boolean z = false;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-358532755, i2, -1, "androidx.compose.runtime.retain.LocalRetainedValuesStoreProvider (LocalRetainedValuesStore.kt:77)");
            }
            CompositionLocalKt.CompositionLocalProvider(LocalRetainedValuesStore.provides(retainedValuesStore), myVar, startRestartGroup, ProvidedValue.$stable | (i2 & 112));
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && startRestartGroup.changed(retainedValuesStore))) {
                z = true;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new RetainContentPresenceIndicator(retainedValuesStore, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ((RetainContentPresenceIndicator) rememberedValue).setComposer(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(retainedValuesStore, myVar, i, 23));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LocalRetainedValuesStoreProvider$lambda$2(RetainedValuesStore retainedValuesStore, my myVar, int i, Composer composer, int i2) {
        LocalRetainedValuesStoreProvider(retainedValuesStore, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final ProvidableCompositionLocal<RetainedValuesStore> getLocalRetainedValuesStore() {
        return LocalRetainedValuesStore;
    }
}
