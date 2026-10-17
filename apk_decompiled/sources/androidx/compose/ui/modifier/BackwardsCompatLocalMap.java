package androidx.compose.ui.modifier;

import androidx.compose.ui.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    public static final int $stable = 8;
    private ModifierLocalProvider<?> element;

    public BackwardsCompatLocalMap(ModifierLocalProvider<?> modifierLocalProvider) {
        super(null);
        this.element = modifierLocalProvider;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui(ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.element.getKey();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui(ModifierLocal<T> modifierLocal) {
        if (!(modifierLocal == this.element.getKey())) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        return (T) this.element.getValue();
    }

    public final ModifierLocalProvider<?> getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui */
    public <T> void mo6391set$ui(ModifierLocal<T> modifierLocal, T t) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    public final void setElement(ModifierLocalProvider<?> modifierLocalProvider) {
        this.element = modifierLocalProvider;
    }
}
