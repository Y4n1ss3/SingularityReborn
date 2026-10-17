package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class GapRememberObserverHolder implements RememberObserverHolder {
    public static final int $stable = 8;
    private int afterGroupIndex;
    private RememberObserver wrapped;

    public GapRememberObserverHolder(RememberObserver rememberObserver, int i) {
        this.wrapped = rememberObserver;
        this.afterGroupIndex = i;
    }

    public final int getAfterGroupIndex() {
        return this.afterGroupIndex;
    }

    @Override // androidx.compose.runtime.RememberObserverHolder
    public RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfterGroupIndex(int i) {
        this.afterGroupIndex = i;
    }

    @Override // androidx.compose.runtime.RememberObserverHolder
    public void setWrapped(RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
