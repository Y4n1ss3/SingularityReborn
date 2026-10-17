package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.semantics.CollectionInfo;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyLayoutSemanticState {
    CollectionInfo collectionInfo();

    int getContentPadding();

    float getMaxScrollOffset();

    float getScrollOffset();

    int getViewport();

    Object scrollToItem(int i, hm hmVar);
}
