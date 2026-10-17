package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import defpackage.e10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyListItemProvider extends LazyLayoutItemProvider {
    e10 getHeaderIndexes();

    LazyItemScopeImpl getItemScope();

    LazyLayoutKeyIndexMap getKeyIndexMap();
}
