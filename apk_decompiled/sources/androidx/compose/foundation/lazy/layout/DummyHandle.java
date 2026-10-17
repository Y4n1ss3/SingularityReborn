package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DummyHandle implements LazyLayoutPrefetchState.PrefetchHandle {
    public static final DummyHandle INSTANCE = new DummyHandle();

    private DummyHandle() {
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
    public void cancel() {
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
    public void markAsUrgent() {
    }
}
