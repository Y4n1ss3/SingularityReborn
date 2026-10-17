package androidx.compose.runtime.retain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.iy;
import defpackage.ms;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ManagedRetainedValuesStoreKt {
    public static final ManagedRetainedValuesStore retainManagedRetainedValuesStore(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(847199873, i, -1, "androidx.compose.runtime.retain.retainManagedRetainedValuesStore (ManagedRetainedValuesStore.kt:172)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ms(13);
            composer.updateRememberedValue(rememberedValue);
        }
        ManagedRetainedValuesStore retainedValuesStore = ((RetainManagedRetainedValuesStoreWrapper) RetainKt.retain(-893765632, (iy) rememberedValue, composer, 48)).getRetainedValuesStore();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return retainedValuesStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainManagedRetainedValuesStoreWrapper retainManagedRetainedValuesStore$lambda$0$0() {
        return new RetainManagedRetainedValuesStoreWrapper();
    }
}
