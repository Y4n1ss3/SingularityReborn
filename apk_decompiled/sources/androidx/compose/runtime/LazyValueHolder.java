package androidx.compose.runtime;

import defpackage.g30;
import defpackage.iy;
import defpackage.uf;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 8;
    private final g30 current$delegate;

    public LazyValueHolder(iy iyVar) {
        this.current$delegate = y80.C(iyVar);
    }

    private final T getCurrent() {
        return (T) this.current$delegate.getValue();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return getCurrent();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        throw uf.a("Cannot produce a provider from a lazy value holder");
    }
}
