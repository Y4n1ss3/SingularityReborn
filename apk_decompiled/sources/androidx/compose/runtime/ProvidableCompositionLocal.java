package androidx.compose.runtime;

import defpackage.iy;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public ProvidableCompositionLocal(iy iyVar) {
        super(iyVar, null);
    }

    private final ValueHolder<T> valueHolderOf(ProvidedValue<T> providedValue) {
        if (!providedValue.isDynamic$runtime()) {
            return providedValue.getCompute$runtime() != null ? new ComputedValueHolder(providedValue.getCompute$runtime()) : providedValue.getState$runtime() != null ? new DynamicValueHolder(providedValue.getState$runtime()) : new StaticValueHolder(providedValue.getEffectiveValue$runtime());
        }
        MutableState<T> state$runtime = providedValue.getState$runtime();
        if (state$runtime == null) {
            T value = providedValue.getValue();
            SnapshotMutationPolicy<T> mutationPolicy$runtime = providedValue.getMutationPolicy$runtime();
            if (mutationPolicy$runtime == null) {
                mutationPolicy$runtime = SnapshotStateKt.structuralEqualityPolicy();
            }
            state$runtime = SnapshotStateKt.mutableStateOf(value, mutationPolicy$runtime);
        }
        return new DynamicValueHolder(state$runtime);
    }

    public abstract ProvidedValue<T> defaultProvidedValue$runtime(T t);

    public final ProvidedValue<T> provides(T t) {
        return defaultProvidedValue$runtime(t);
    }

    public final ProvidedValue<T> providesComputed(ky kyVar) {
        return new ProvidedValue<>(this, null, false, null, null, kyVar, false);
    }

    public final ProvidedValue<T> providesDefault(T t) {
        return defaultProvidedValue$runtime(t).ifNotAlreadyProvided$runtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r0 == r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValueHolder<T> updatedStateOf$runtime(ProvidedValue<T> providedValue, ValueHolder<T> valueHolder) {
        DynamicValueHolder dynamicValueHolder;
        DynamicValueHolder dynamicValueHolder2 = null;
        if (valueHolder instanceof DynamicValueHolder) {
            if (providedValue.isDynamic$runtime()) {
                dynamicValueHolder2 = (DynamicValueHolder) valueHolder;
                dynamicValueHolder2.getState().setValue(providedValue.getEffectiveValue$runtime());
            }
        } else if (valueHolder instanceof StaticValueHolder) {
            if (providedValue.isStatic$runtime()) {
                StaticValueHolder staticValueHolder = (StaticValueHolder) valueHolder;
                boolean b = q10.b(providedValue.getEffectiveValue$runtime(), staticValueHolder.getValue());
                dynamicValueHolder = staticValueHolder;
            }
        } else if (valueHolder instanceof ComputedValueHolder) {
            ky compute$runtime = providedValue.getCompute$runtime();
            ComputedValueHolder computedValueHolder = (ComputedValueHolder) valueHolder;
            ky compute = computedValueHolder.getCompute();
            dynamicValueHolder = computedValueHolder;
        }
        return dynamicValueHolder2 == null ? valueHolderOf(providedValue) : dynamicValueHolder2;
    }
}
