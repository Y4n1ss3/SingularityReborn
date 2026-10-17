package androidx.compose.runtime;

import defpackage.e1;
import defpackage.ky;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;
    private final ComputedValueHolder<T> defaultValueHolder;

    public ComputedProvidableCompositionLocal(ky kyVar) {
        super(new e1(16));
        this.defaultValueHolder = new ComputedValueHolder<>(kyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0() {
        throw uf.a("Unexpected call to default provider");
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public ProvidedValue<T> defaultProvidedValue$runtime(T t) {
        return new ProvidedValue<>(this, t, t == null, null, null, null, true);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public ComputedValueHolder<T> getDefaultValueHolder$runtime() {
        return this.defaultValueHolder;
    }
}
