package androidx.compose.foundation.lazy.staggeredgrid;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final StaggeredGridItemSpan FullLine = new StaggeredGridItemSpan(0);
    private static final StaggeredGridItemSpan SingleLane = new StaggeredGridItemSpan(1);
    private final int value;

    private StaggeredGridItemSpan(int i) {
        this.value = i;
    }

    public final int getValue$foundation() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.FullLine;
        }

        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.SingleLane;
        }

        private Companion() {
        }
    }
}
