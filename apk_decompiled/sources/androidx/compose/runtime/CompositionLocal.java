package androidx.compose.runtime;

import defpackage.dq;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final ValueHolder<T> defaultValueHolder;

    private CompositionLocal(iy iyVar) {
        this.defaultValueHolder = new LazyValueHolder(iyVar);
    }

    public final T getCurrent(Composer composer, int i) {
        return (T) composer.consume(this);
    }

    public ValueHolder<T> getDefaultValueHolder$runtime() {
        return this.defaultValueHolder;
    }

    public abstract ValueHolder<T> updatedStateOf$runtime(ProvidedValue<T> providedValue, ValueHolder<T> valueHolder);

    public /* synthetic */ CompositionLocal(iy iyVar, dq dqVar) {
        this(iyVar);
    }

    public static /* synthetic */ void getCurrent$annotations(Composer composer, int i) {
    }
}
