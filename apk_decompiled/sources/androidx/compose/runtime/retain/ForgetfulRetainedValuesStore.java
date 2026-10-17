package androidx.compose.runtime.retain;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForgetfulRetainedValuesStore implements RetainedValuesStore {
    public static final int $stable = 0;
    public static final ForgetfulRetainedValuesStore INSTANCE = new ForgetfulRetainedValuesStore();

    private ForgetfulRetainedValuesStore() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void saveExitingValue(Object obj, Object obj2) {
        if (obj2 instanceof RetainObserver) {
            ((RetainObserver) obj2).onRetired();
        }
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentExitComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public Object consumeExitedValueOrDefault(Object obj, Object obj2) {
        return obj2;
    }
}
