package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import defpackage.iy;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    public static final int $stable = 8;
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private final iy onDispose;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, iy iyVar) {
        this.$$delegate_0 = saveableStateRegistry;
        this.onDispose = iyVar;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, iy iyVar) {
        return this.$$delegate_0.registerProvider(str, iyVar);
    }
}
