package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SingleLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final ModifierLocal<?> key;
    private final MutableState value$delegate;

    public SingleLocalMap(ModifierLocal<?> modifierLocal) {
        super(null);
        this.key = modifierLocal;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui(ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.key;
    }

    public final void forceValue$ui(Object obj) {
        setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui(ModifierLocal<T> modifierLocal) {
        if (!(modifierLocal == this.key)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        T t = (T) getValue();
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui */
    public <T> void mo6391set$ui(ModifierLocal<T> modifierLocal, T t) {
        if (!(modifierLocal == this.key)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        setValue(t);
    }
}
