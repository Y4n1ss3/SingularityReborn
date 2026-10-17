package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import defpackage.p80;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final SnapshotStateMap<ModifierLocal<?>, Object> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiLocalMap(xe0 xe0Var, xe0... xe0VarArr) {
        super(null);
        SnapshotStateMap<ModifierLocal<?>, Object> mutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        this.map = mutableStateMapOf;
        mutableStateMapOf.put(xe0Var.d, xe0Var.e);
        mutableStateMapOf.putAll(p80.Q(xe0VarArr));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui(ModifierLocal<?> modifierLocal) {
        return this.map.containsKey(modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui(ModifierLocal<T> modifierLocal) {
        T t = (T) this.map.get(modifierLocal);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui */
    public <T> void mo6391set$ui(ModifierLocal<T> modifierLocal, T t) {
        this.map.put(modifierLocal, t);
    }
}
