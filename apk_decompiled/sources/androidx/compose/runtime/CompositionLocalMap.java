package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface CompositionLocalMap {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CompositionLocalMap Empty = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

        private Companion() {
        }

        public final CompositionLocalMap getEmpty() {
            return Empty;
        }
    }

    <T> T get(CompositionLocal<T> compositionLocal);
}
