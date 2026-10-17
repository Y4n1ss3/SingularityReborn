package androidx.compose.runtime;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StaticValueHolder<T> implements ValueHolder<T> {
    public static final int $stable = 0;
    private final T value;

    public StaticValueHolder(T t) {
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StaticValueHolder copy$default(StaticValueHolder staticValueHolder, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = staticValueHolder.value;
        }
        return staticValueHolder.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    public final StaticValueHolder<T> copy(T t) {
        return new StaticValueHolder<>(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StaticValueHolder) && q10.b(this.value, ((StaticValueHolder) obj).value);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @Override // androidx.compose.runtime.ValueHolder
    public T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.value;
    }

    @Override // androidx.compose.runtime.ValueHolder
    public ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal) {
        T t = this.value;
        return new ProvidedValue<>(compositionLocal, t, t == null, null, null, null, false);
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.value + ')';
    }
}
