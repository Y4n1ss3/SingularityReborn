package androidx.compose.foundation.lazy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListPrefetchStrategyKt {
    private static final int UnsetItemCount = -1;

    public static final LazyListPrefetchStrategy LazyListPrefetchStrategy(int i) {
        return new DefaultLazyListPrefetchStrategy(i);
    }

    public static /* synthetic */ LazyListPrefetchStrategy LazyListPrefetchStrategy$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return LazyListPrefetchStrategy(i);
    }
}
