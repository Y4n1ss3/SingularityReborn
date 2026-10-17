package androidx.compose.runtime;

import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComputedValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;
    private final ky compute;

    public ComputedValueHolder(ky kyVar) {
        this.compute = kyVar;
    }

    public static /* synthetic */ ComputedValueHolder copy$default(ComputedValueHolder computedValueHolder, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = computedValueHolder.compute;
        }
        return computedValueHolder.copy(kyVar);
    }

    public final ky component1() {
        return this.compute;
    }

    public final ComputedValueHolder<T> copy(ky kyVar) {
        return new ComputedValueHolder<>(kyVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComputedValueHolder) && q10.b(this.compute, ((ComputedValueHolder) obj).compute);
    }

    public final ky getCompute() {
        return this.compute;
    }

    public int hashCode() {
        return this.compute.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return (T) this.compute.invoke(persistentCompositionLocalMap);
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        return new ProvidedValue<>(compositionLocal, null, false, null, null, this.compute, false);
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.compute + ')';
    }
}
