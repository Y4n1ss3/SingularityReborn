package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnboxedIntState implements IntState {
    public static final int $stable = 0;
    private final State<Integer> baseState;

    public UnboxedIntState(State<Integer> state) {
        this.baseState = state;
    }

    @Override // androidx.compose.runtime.IntState
    public int getIntValue() {
        return this.baseState.getValue().intValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    public Integer getValue() {
        return this.baseState.getValue();
    }

    public String toString() {
        return "UnboxedIntState(baseState=" + this.baseState + ")@" + hashCode();
    }
}
