package androidx.compose.runtime.retain;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RetainManagedRetainedValuesStoreWrapper implements RetainObserver {
    private final ManagedRetainedValuesStore retainedValuesStore = new ManagedRetainedValuesStore();

    public final ManagedRetainedValuesStore getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetired() {
        this.retainedValuesStore.dispose();
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onUnused() {
        this.retainedValuesStore.dispose();
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onExitedComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetained() {
    }
}
