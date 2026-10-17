package androidx.compose.runtime;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionLocalContext {
    public static final int $stable = 0;
    private final PersistentCompositionLocalMap compositionLocals;

    public CompositionLocalContext(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.compositionLocals = persistentCompositionLocalMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionLocalContext) && q10.b(((CompositionLocalContext) obj).compositionLocals, this.compositionLocals);
    }

    public final PersistentCompositionLocalMap getCompositionLocals$runtime() {
        return this.compositionLocals;
    }

    public int hashCode() {
        return this.compositionLocals.hashCode();
    }
}
