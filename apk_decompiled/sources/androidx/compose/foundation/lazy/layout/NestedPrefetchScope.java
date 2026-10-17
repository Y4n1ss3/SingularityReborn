package androidx.compose.foundation.lazy.layout;

import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface NestedPrefetchScope {
    default int getNestedPrefetchItemCount() {
        return -1;
    }

    void schedulePrecomposition(int i);

    /* renamed from: schedulePrecompositionAndPremeasure-0kLqBqw */
    void mo936schedulePrecompositionAndPremeasure0kLqBqw(int i, long j);

    @er
    default void schedulePrefetch(int i) {
        schedulePrecomposition(i);
    }

    @er
    /* renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
    default void m938schedulePrefetch0kLqBqw(int i, long j) {
        mo936schedulePrecompositionAndPremeasure0kLqBqw(i, j);
    }
}
