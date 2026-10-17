package androidx.compose.runtime.retain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.iy;
import defpackage.ms;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RetainedValuesStoreRegistryKt {
    public static final RetainedValuesStoreRegistry retainRetainedValuesStoreRegistry(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1800021473, i, -1, "androidx.compose.runtime.retain.retainRetainedValuesStoreRegistry (RetainedValuesStoreRegistry.kt:145)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ms(23);
            composer.updateRememberedValue(rememberedValue);
        }
        RetainedValuesStoreRegistry retainedValuesStoreRegistry = ((RetainedValuesStoreRegistryWrapper) RetainKt.retain(-285137363, (iy) rememberedValue, composer, 48)).getRetainedValuesStoreRegistry();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return retainedValuesStoreRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedValuesStoreRegistryWrapper retainRetainedValuesStoreRegistry$lambda$0$0() {
        return new RetainedValuesStoreRegistryWrapper();
    }
}
