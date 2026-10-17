package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.InspectorValueInfo;
import defpackage.iy;
import defpackage.ky;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ModifierLocalProviderKt$modifierLocalProvider$1<T> extends InspectorValueInfo implements ModifierLocalProvider<T> {
    private final ProvidableModifierLocal<T> key;
    private final State value$delegate;

    public ModifierLocalProviderKt$modifierLocalProvider$1(ProvidableModifierLocal<T> providableModifierLocal, iy iyVar, ky kyVar) {
        super(kyVar);
        this.key = providableModifierLocal;
        this.value$delegate = SnapshotStateKt.derivedStateOf(iyVar);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<T> getKey() {
        return this.key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public T getValue() {
        return (T) this.value$delegate.getValue();
    }
}
