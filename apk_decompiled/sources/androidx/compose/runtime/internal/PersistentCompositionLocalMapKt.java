package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import defpackage.p80;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersistentCompositionLocalMapKt {
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(xe0... xe0VarArr) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builder2 = PersistentCompositionLocalHashMap.Companion.getEmpty().builder2();
        p80.O(builder2, xe0VarArr);
        return builder2.build2();
    }

    public static final PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
        return PersistentCompositionLocalHashMap.Companion.getEmpty();
    }
}
