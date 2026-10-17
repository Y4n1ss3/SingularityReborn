package androidx.compose.foundation.lazy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListPrefetchResultScopeImpl implements LazyListPrefetchResultScope {
    public static final int $stable = 0;
    private final int index;
    private final int mainAxisSize;

    public LazyListPrefetchResultScopeImpl(int i, int i2) {
        this.index = i;
        this.mainAxisSize = i2;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchResultScope
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchResultScope
    public int getMainAxisSize() {
        return this.mainAxisSize;
    }
}
