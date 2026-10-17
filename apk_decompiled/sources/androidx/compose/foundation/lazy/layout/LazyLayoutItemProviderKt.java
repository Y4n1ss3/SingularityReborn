package androidx.compose.foundation.lazy.layout;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutItemProviderKt {
    public static final int findIndexByKey(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i) {
        int index;
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i < lazyLayoutItemProvider.getItemCount() && obj.equals(lazyLayoutItemProvider.getKey(i))) || (index = lazyLayoutItemProvider.getIndex(obj)) == -1) ? i : index;
    }
}
