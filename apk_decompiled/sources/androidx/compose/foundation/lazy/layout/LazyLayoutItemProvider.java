package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    void Item(int i, Object obj, Composer composer, int i2);

    default Object getContentType(int i) {
        return null;
    }

    default int getIndex(Object obj) {
        return -1;
    }

    int getItemCount();

    default Object getKey(int i) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i);
    }
}
