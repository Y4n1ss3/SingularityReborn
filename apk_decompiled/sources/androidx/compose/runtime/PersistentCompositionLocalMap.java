package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PersistentCompositionLocalMap extends PersistentMap<CompositionLocal<Object>, ValueHolder<Object>>, CompositionLocalMap, CompositionLocalAccessorScope {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Builder extends PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        PersistentMap<CompositionLocal<Object>, ValueHolder<Object>> build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder();

    @Override // androidx.compose.runtime.CompositionLocalAccessorScope
    default <T> T getCurrentValue(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(this, compositionLocal);
    }

    PersistentCompositionLocalMap putValue(CompositionLocal<Object> compositionLocal, ValueHolder<Object> valueHolder);
}
