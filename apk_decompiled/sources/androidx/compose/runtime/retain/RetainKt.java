package androidx.compose.runtime.retain;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import defpackage.iy;
import defpackage.q10;
import defpackage.v4;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RetainKt {
    private static final Object RetainedValuesStoreMissingValue = new Object();

    public static final <T> T retain(int i, Object[] objArr, iy iyVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2119413254, i2, -1, "androidx.compose.runtime.retain.retain (Retain.kt:209)");
        }
        T t = (T) retainImpl(new RetainKeys(objArr, ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0), i), iyVar, composer, (i2 >> 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    private static final <T> T retainImpl(RetainKeys retainKeys, iy iyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(583113279, i, -1, "androidx.compose.runtime.retain.retainImpl (Retain.kt:222)");
        }
        RetainedValuesStore retainedValuesStore = (RetainedValuesStore) composer.consume(LocalRetainedValuesStoreKt.getLocalRetainedValuesStore());
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(retainKeys)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            Object obj = RetainedValuesStoreMissingValue;
            Object consumeExitedValueOrDefault = retainedValuesStore.consumeExitedValueOrDefault(retainKeys, obj);
            rememberedValue = consumeExitedValueOrDefault != obj ? new RetainedValueHolder(retainKeys, consumeExitedValueOrDefault, retainedValuesStore, false) : new RetainedValueHolder(retainKeys, iyVar.invoke(), retainedValuesStore, true);
            composer.updateRememberedValue(rememberedValue);
        }
        RetainedValueHolder retainedValueHolder = (RetainedValueHolder) rememberedValue;
        if (retainedValueHolder.getOwner() != retainedValuesStore) {
            composer.startReplaceGroup(-1614000612);
            boolean changedInstance = composer.changedInstance(retainedValueHolder) | composer.changedInstance(retainedValuesStore);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new v4(29, retainedValueHolder, retainedValuesStore);
                composer.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.SideEffect((iy) rememberedValue2, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1613932381);
            composer.endReplaceGroup();
        }
        T t = (T) retainedValueHolder.getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 retainImpl$lambda$1$0(RetainedValueHolder retainedValueHolder, RetainedValuesStore retainedValuesStore) {
        retainedValueHolder.readoptUnder$runtime_retain(retainedValuesStore);
        return w01.a;
    }

    public static final <T> T retain(int i, iy iyVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(663053747, i2, -1, "androidx.compose.runtime.retain.retain (Retain.kt:195)");
        }
        T t = (T) retainImpl(new RetainKeys(null, ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0), i), iyVar, composer, i2 & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t;
    }

    public static final <T> T retain(iy iyVar, Composer composer, int i) {
        q10.G();
        throw null;
    }

    public static final <T> T retain(Object[] objArr, iy iyVar, Composer composer, int i) {
        q10.G();
        throw null;
    }
}
