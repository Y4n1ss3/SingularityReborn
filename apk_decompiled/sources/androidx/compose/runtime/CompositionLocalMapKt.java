package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionLocalMapKt {
    public static final <T> boolean contains(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal<T> compositionLocal) {
        compositionLocal.getClass();
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap mutate(PersistentCompositionLocalMap persistentCompositionLocalMap, ky kyVar) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2 = persistentCompositionLocalMap.builder2();
        kyVar.invoke(builder2);
        return builder2.build2();
    }

    public static final <T> T read(PersistentCompositionLocalMap persistentCompositionLocalMap, CompositionLocal<T> compositionLocal) {
        compositionLocal.getClass();
        ValueHolder valueHolder = persistentCompositionLocalMap.get((Object) compositionLocal);
        if (valueHolder == null) {
            valueHolder = compositionLocal.getDefaultValueHolder$runtime();
        }
        return (T) valueHolder.readValue(persistentCompositionLocalMap);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap updateCompositionMap(ProvidedValue<?>[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder2();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            compositionLocal.getClass();
            ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) compositionLocal;
            if (providedValue.getCanOverride() || !contains(persistentCompositionLocalMap, providableCompositionLocal)) {
                builder2.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime(providedValue, (ValueHolder) persistentCompositionLocalMap2.get((Object) providableCompositionLocal)));
            }
        }
        return builder2.build2();
    }

    public static /* synthetic */ PersistentCompositionLocalMap updateCompositionMap$default(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2, int i, Object obj) {
        if ((i & 4) != 0) {
            persistentCompositionLocalMap2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }
}
