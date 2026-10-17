package androidx.compose.runtime;

import defpackage.ky;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProvidedValue<T> {
    public static final int $stable = 8;
    private boolean canOverride = true;
    private final CompositionLocal<T> compositionLocal;
    private final ky compute;
    private final boolean explicitNull;
    private final boolean isDynamic;
    private final SnapshotMutationPolicy<T> mutationPolicy;
    private final T providedValue;
    private final MutableState<T> state;

    public ProvidedValue(CompositionLocal<T> compositionLocal, T t, boolean z, SnapshotMutationPolicy<T> snapshotMutationPolicy, MutableState<T> mutableState, ky kyVar, boolean z2) {
        this.compositionLocal = compositionLocal;
        this.explicitNull = z;
        this.mutationPolicy = snapshotMutationPolicy;
        this.state = mutableState;
        this.compute = kyVar;
        this.isDynamic = z2;
        this.providedValue = t;
    }

    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    public final ky getCompute$runtime() {
        return this.compute;
    }

    public final T getEffectiveValue$runtime() {
        if (this.explicitNull) {
            return null;
        }
        MutableState<T> mutableState = this.state;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        T t = this.providedValue;
        if (t != null) {
            return t;
        }
        throw uf.a("Unexpected form of a provided value");
    }

    public final SnapshotMutationPolicy<T> getMutationPolicy$runtime() {
        return this.mutationPolicy;
    }

    public final MutableState<T> getState$runtime() {
        return this.state;
    }

    public final T getValue() {
        return this.providedValue;
    }

    public final ProvidedValue<T> ifNotAlreadyProvided$runtime() {
        this.canOverride = false;
        return this;
    }

    public final boolean isDynamic$runtime() {
        return this.isDynamic;
    }

    public final boolean isStatic$runtime() {
        return (this.explicitNull || getValue() != null) && !this.isDynamic;
    }

    public static /* synthetic */ void getEffectiveValue$runtime$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
