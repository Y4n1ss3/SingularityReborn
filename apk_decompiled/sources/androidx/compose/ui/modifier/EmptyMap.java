package androidx.compose.ui.modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class EmptyMap extends ModifierLocalMap {
    public static final int $stable = 0;
    public static final EmptyMap INSTANCE = new EmptyMap();

    private EmptyMap() {
        super(null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui(ModifierLocal<?> modifierLocal) {
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui(ModifierLocal<T> modifierLocal) {
        throw new IllegalStateException("");
    }

    public <T> Void set$ui(ModifierLocal<T> modifierLocal, T t) {
        throw new IllegalStateException("");
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo6391set$ui(ModifierLocal modifierLocal, Object obj) {
        set$ui((ModifierLocal<ModifierLocal>) modifierLocal, (ModifierLocal) obj);
    }
}
